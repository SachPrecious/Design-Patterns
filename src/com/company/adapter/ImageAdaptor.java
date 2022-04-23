package com.company.adapter;

import com.company.adapter.image.ImageDisplay;

public class ImageAdaptor implements Player {

    ImageDisplay imageDisplay =new ImageDisplay();






    @Override
    public void play(String fileName) {
        imageDisplay.show(fileName);
    }
}
