package com.example.musicalstructureapp;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AuthorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create an arraylist of authors
        ArrayList<String> authors = new ArrayList<String>();

        authors.add("J. K. Rowling");
        authors.add("Lyndsay Sands");
        authors.add("Gena Showalter");
        authors.add("Lora Leigh");
        authors.add("Geoff Colvin");
        authors.add("Meg Jay");

        LinearLayout listView = (LinearLayout)findViewById(R.id.list);


        for (int index = 0; index < authors.size(); index++) {
            TextView authorView = new TextView(this);
            authorView.setText(authors.get(index));
            listView.addView(authorView);

        }
    }
}
