package com.company.adapterpattern;

import com.company.adapterpattern.image.ImageDisplay;
import com.company.adapterpattern.image.JPGImageDisplay;
import com.company.adapterpattern.image.PNGImageDisplay;

public class MediaPlayerFactory {


    //get the file name from the user
    //depending on the file type play the file using a player


    public Player getPlayerType(String fileName) {

        if (fileName.endsWith("mp3")) {
            return new Mp3Player();
        } else if (fileName.endsWith("mp4")) {
            return new Mp4Player();
        } else if (fileName.endsWith("jpg")) {
            ImageDisplay imageDisplay = new JPGImageDisplay();
            return new ImageAdaptor(imageDisplay);
        } else if (fileName.endsWith("png")) {
            ImageDisplay imageDisplay = new PNGImageDisplay();
            return new ImageAdaptor(imageDisplay);
        }else {
            return null;
        }



    }
}