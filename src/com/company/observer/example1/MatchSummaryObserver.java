package com.company.observer.example1;

public class MatchSummaryObserver implements Observer {
    @Override
    public void notifyObserver(MatchStatus status) {

        System.out.println("Team 1 Score :"+ status.team1Score);
        System.out.println("Team 2 Score :"+ status.team2Score);
    }
}
