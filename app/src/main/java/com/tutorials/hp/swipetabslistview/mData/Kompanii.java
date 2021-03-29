package com.example.ezbirka.mData;


public class Kompanii {

    String name;
    int image;
    String description;
    String number;
    String website;

    public Kompanii(String name, int image, String description, String number, String website) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.number = number;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public String getWebsite() {
        return website;
    }

}
