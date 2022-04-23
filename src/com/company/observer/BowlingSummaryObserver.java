package com.company.observer;

public class BowlingSummaryObserver implements Observer {
    @Override
    public void notifyObserver(MatchStatus status) {
        System.out.println(status.currentBowlerName);


    }
}
