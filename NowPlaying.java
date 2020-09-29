package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get the intent which open the activity

        Intent currentIntent = getIntent();

        //get the data stored to the Intent using the keys "titleName" and "authorName"

        String titleName = currentIntent.getExtras().getString("titleName");

        String authorName = currentIntent.getExtras().getString("authorName");


        //set the text of your TextViews with data

        titleName.setText(titleName);

        authorName.setText(authorName);





    }
}
