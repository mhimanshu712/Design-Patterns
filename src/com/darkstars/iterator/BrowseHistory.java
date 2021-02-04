package com.darkstars.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() - 1;
        var lastItem = urls.get(lastIndex);
        urls.remove(lastItem);

        return lastItem;
    }

    public Iterator createIterator(){
        return new listIterator(this);
    }

    public class listIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public listIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String currrent() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
