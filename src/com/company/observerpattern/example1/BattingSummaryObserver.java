package com.company.observerpattern.example1;

public class BattingSummaryObserver implements Observer {
    @Override
    public void notifyObserver(MatchStatus status) {
        System.out.println(status.bat1Name +" "+status.bat1Score);
        System.out.println(status.bat2Name +" "+status.bat2Score);
    }
}
