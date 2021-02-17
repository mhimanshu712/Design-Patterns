package com.darkstars.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeOberver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(var observer : observers)
            observer.update();
    }
}
