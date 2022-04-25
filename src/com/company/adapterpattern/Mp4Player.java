package com.company.adapterpattern;

public class Mp4Player implements Player {
    public void play(String fileName){
        System.out.println("Play mp4 file"+fileName);

    }
}
