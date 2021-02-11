package com.darkstars;

import com.darkstars.iterator.BrowseHistory;
import com.darkstars.momento.Editor;
import com.darkstars.momento.History;
import com.darkstars.state.Brush;
import com.darkstars.state.Canvas;
import com.darkstars.stratgy.BWFilter;
import com.darkstars.stratgy.ImageStorage;
import com.darkstars.stratgy.JpegCompressor;
import com.darkstars.stratgy.PngCompressor;

public class Main {

    public static void main(String[] args) {
        // momento();
        // state();
        //iterator();
        stratgy();
    }



    private static void momento(){
        var editor = new Editor();
        var history = new History();

        editor.setContent("hi bro");
        history.push(editor.createState());

        editor.setContent("hi bro!");
        history.push(editor.createState());

        editor.setContent("hi bro!!");
        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }

    private static void state(){
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    private static void iterator(){
        BrowseHistory browserHistory = new BrowseHistory();
        browserHistory.push("https://www.google.com");
        browserHistory.push("https://www.bing.com");
        browserHistory.push("https://www.yahoo.com");

        var itr = browserHistory.createIterator();
        browserHistory.pop();

        while(itr.hasNext()){
            System.out.println(itr.currrent());
            itr.next();
        }
    }

    private static void stratgy(){
        ImageStorage imageStorage = new ImageStorage(new PngCompressor(),new BWFilter());
        imageStorage.store("abx");
    }
}
