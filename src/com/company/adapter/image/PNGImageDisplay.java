package com.company.adapter.image;

public class PNGImageDisplay implements ImageDisplay {
    @Override
    public void show(String fileName) {

        System.out.println("Displaying PNG Image:"+fileName);
    }
}
