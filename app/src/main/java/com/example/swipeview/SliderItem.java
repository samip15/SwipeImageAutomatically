package com.example.swipeview;

public class SliderItem {
    // here you can use String variable to store url
    // if you want to load image from the internet
    private int image;
    SliderItem(int image){
        this.image = image;
    }
    public int getImage(){
        return image;
    }
}

