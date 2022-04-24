package com.company.observer.example1;

public class BowlingSummaryObserver implements Observer {
    @Override
    public void notifyObserver(MatchStatus status) {
        System.out.println("Current Bowler is:"+status.currentBowlerName);


    }
}
