package com.example.mabre.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by mabre on 2/17/2017.
 */

public class ResultsList {
    @SerializedName("total")
    int total;
    @SerializedName("businesses")
    ArrayList<Apartment> businesses;

    public ArrayList<Apartment> getBusinesses() {
        return businesses;
    }

    public ArrayList<Apartment> businesses() {
        return businesses;
    }

    public void setApartmentArrayList(ArrayList<Apartment> businesses) {
        this.businesses = businesses;
    }
}
