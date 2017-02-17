package com.example.mabre.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.Menu;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;

public class signin extends AppCompatActivity {


    EditText nameField;
    EditText zipCodeField;
    String name;
    int zipcode;
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        setSupportActionBar(null);
        // EditText nameField = (EditText) findViewById(R.id.namefield);
        //EditText zipCodeField = (EditText) findViewById(R.id.zipcodefield);
        search= (Button) findViewById(R.id.search);
        search.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startFilterActvity();
            }
        });
    }
            public void startFilterActvity() {
                Intent intent = new Intent(getApplicationContext(), filterList.class);
                startActivity(intent);
            }
        }
