package com.company.observer.example2;



import java.util.ArrayList;
import java.util.List;
//this is our subject class
public class Salary {
    List<Observer> observers=new ArrayList<>();
    private int val;
    public Salary(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer ob:observers ) {
                ob.update();
        }
    }


    public void subscribe(Observer ob){
        observers.add(ob);
    }







}
