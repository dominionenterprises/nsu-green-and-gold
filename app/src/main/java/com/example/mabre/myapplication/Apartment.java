package com.example.mabre.myapplication;

import android.media.Image;

import com.google.gson.annotations.SerializedName;

/**
 *
 * Created by mabre on 2/17/2017.
 */

public class Apartment
{

//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @SerializedName("name")
    String name;
//    @SerializedName("display_address")
//    String adress;
    @SerializedName("phone")
        String phoneNumber;
    @SerializedName("rating")
    String rating;
    @SerializedName("image_url")
    String img;
    @SerializedName("id")
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
