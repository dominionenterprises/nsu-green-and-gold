package com.example.mabre.myapplication;

//import Apartment;
import android.app.Activity;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.telephony.gsm.GsmCellLocation;
import android.widget.*;
import android.media.Image;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class apartmentList extends AppCompatActivity {

    String name;
    String adress;
    String contact;
    String rating;
    Image img;
    String phoneNumber;
    apartmentList activity;
ListView listView;
    List<Apartment> resultList;
    ListAdapter adapter;
    Call<ResultsList> call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apartmentlistview);
        listView = (ListView) findViewById(R.id.list);

        activity = this;
        resultList = new ArrayList<>();

        adapter = new ListAdapter(getApplicationContext(), R.layout.listviewrow,resultList);
        listView.setAdapter(adapter);
        call = YelpAPIFactory.yelpApi().search("apartments","23510", "education");
        call.enqueue(new Callback<ResultsList>() {
            @Override
            public void onResponse(Call<ResultsList> call, Response<ResultsList> response) {
                activity.setAdapter(response.body());
            }

            @Override
            public void onFailure(Call<ResultsList> call, Throwable t) {
                System.out.println("failed");
            }
        });

    }
    public void setAdapter(ResultsList list){
        activity.resultList =list.getBusinesses();
        adapter = new ListAdapter(getApplicationContext(), R.layout.listviewrow,resultList);
    }

    public void notifyAdapter(){
        adapter.notifyDataSetChanged();
    }

}
