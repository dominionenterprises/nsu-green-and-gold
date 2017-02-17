package com.example.mabre.myapplication;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class filterList extends AppCompatActivity {
    Toolbar toolbar;
    Button applyButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.filterlist);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        applyButton = (Button) findViewById(R.id.applybutton);
        toolbar.setTitle("Take Me There");
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), apartmentList.class);
                startActivity(i);
            }
        });
        setSupportActionBar(toolbar);
    }
}


/*public class filterList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filterlist);
    }


}
*/