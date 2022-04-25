package com.company.adapterpattern;

public class Main {
    public static void main(String[] args) {

try {
    String fileName="F:\\SENG\\file.jp";
    MediaPlayerFactory mediaPlayerFactory =new MediaPlayerFactory();

    Player player = mediaPlayerFactory.getPlayerType(fileName);

    player.play(fileName);
}
catch (Exception e){
    System.out.println("Could Not Find the File Type");
}




    }
}
