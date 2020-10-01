package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_activity);
        //get the intent which open the activity

        Intent currentIntent = getIntent();

        //get the data stored to the Intent using the keys "titleName" and "authorName"

        String titleName = currentIntent.getExtras().getString("titleName");

        String authorName = currentIntent.getExtras().getString("authorName");



        TextView author = findViewById(R.id.author_text_view);

        TextView title = findViewById(R.id.title_text_view);


        //set the text of your TextViews with data

        author.setText(authorName);
        title.setText(titleName);









    }
}
