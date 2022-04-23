package com.company.observer;

public class BattingSummaryObserver implements Observer {
    @Override
    public void notifyObserver(MatchStatus status) {
        System.out.println("Team 1 Score :"+ status.team1Score);
        System.out.println("Team 1 Score :"+ status.team2Score);
    }
}
