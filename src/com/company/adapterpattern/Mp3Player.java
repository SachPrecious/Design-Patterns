package com.company.adapterpattern;

public class Mp3Player implements  Player{

    @Override
    public void play(String fileName){
        System.out.println("Play mp3 file"+fileName);

    }
}
