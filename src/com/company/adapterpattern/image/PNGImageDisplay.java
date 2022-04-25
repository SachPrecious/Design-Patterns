package com.company.adapterpattern.image;

public class PNGImageDisplay implements ImageDisplay {
    @Override
    public void show(String fileName) {

        System.out.println("Displaying PNG Image:"+fileName);
    }
}
