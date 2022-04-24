package com.company;

import com.company.observer.example1.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {


        Observer battingSummary= new BattingSummaryObserver();
        Observer bowlingSummary=new BowlingSummaryObserver();
        Observer matchSummary=new MatchSummaryObserver();

        Subject subject = new Subject();
        subject.subscribe(battingSummary);
        subject.subscribe(matchSummary);
        subject.subscribe(bowlingSummary);

        MatchStatus status =new MatchStatus();

        status.bat1Name="Sanath Jayasooriya";
        status.bat2Name="Kaluwithrana";
        status.bat1Score=30;
        status.bat2Score=12;

        status.currentBowlerName="Warne";

        status.team1Score=45;
        status.team2Score=0;

        subject.notifyAllObservers(status);

        System.out.println("=====================================>");

        Thread.sleep(10000);

        status.bat1Score=32;
        status.team1Score=47;

        subject.notifyAllObservers(status);
        System.out.println("=====================================>");

        Thread.sleep(20000);
        status.bat1Score=36;
        status.team1Score=51;
        subject.notifyAllObservers(status);
        System.out.println("=====================================>");

        Thread.sleep(30000);
        status.bat1Name="Marvan Attapattu";
        status.bat1Score=0;
        status.team1Score=51;
        subject.notifyAllObservers(status);








    }
}
