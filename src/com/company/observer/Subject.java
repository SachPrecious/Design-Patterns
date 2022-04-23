package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //Subject should have a list of observers
    List<Observer> observers=new ArrayList<>();

    public void subscribe(Observer observer){

        observers.add(observer);
    }

    public void unSubscribe(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObservers(MatchStatus status) {

        for (Observer observer : observers) {
            observer.notifyObserver(status);
        }


    }
}
