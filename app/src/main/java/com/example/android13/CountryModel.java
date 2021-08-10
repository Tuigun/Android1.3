package com.example.android13;

public class CountryModel {
    private int img;
    private String txt;
    private String Capital;

    public CountryModel(int img, String txt, String capital) {
        this.img = img;
        this.txt = txt;
        Capital = capital;
    }

    public int getImg() {
        return img;
    }

    public String getTxt() {
        return txt;
    }

    public String getCapital() {
        return Capital;
    }
}
