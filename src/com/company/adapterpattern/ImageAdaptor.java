package com.company.adapterpattern;

import com.company.adapterpattern.image.ImageDisplay;

public class ImageAdaptor implements Player {

  //  ImageDisplay imageDisplay =new ImageDisplay();
    ImageDisplay imageDisplay;

    public ImageAdaptor(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }


    @Override
    public void play(String fileName) {

        imageDisplay.show(fileName);
    }
}
