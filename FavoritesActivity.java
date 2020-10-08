package com.example.musicalstructureapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FavoritesActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create an Array list of words
        ArrayList<Book> books = new ArrayList<Book>();

        //books.add("author", "title");
        books.add(new Book("Lynsay Sands","Devil of the Highlands",R.drawable.devilhighlands));
        books.add(new Book("Maya Banks","No Place To Run",R.drawable.noplace));


        WordAdapter adapter =
                new WordAdapter(this, books);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);







    }

}
