package com.company.adapter;

public class MediaPlayer {
    //get the file name from the user
    //depending on the file type play the file using a player
    public static void main(String[] args) {

        String fileName="F:\\SENG\\file.mp3";
        Player player=null;
        if (fileName.endsWith("mp3")){
            player=new Mp3Player();
        }
        else if (fileName.endsWith("mp4")){
            player=new Mp4Player();
        }

        player.play(fileName);



    }
}
