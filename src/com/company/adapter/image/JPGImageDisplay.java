package com.company.adapter.image;

public class JPGImageDisplay implements ImageDisplay{


    @Override
    public void show(String fileName) {
        System.out.println("Displaying JPG Image: "+fileName);
    }
}
