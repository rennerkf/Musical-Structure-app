package com.example.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an Array list of words
        ArrayList<Book> books = new ArrayList<Book>();

        //words.add("one");
        books.add(new Book("Lynsay Sands", "Hunting for a Highlander"));
        books.add(new Book("Lynsay Sands","Devil of the Highlands"));
        books.add(new Book("Maya Banks","No Place To Run"));
        books.add(new Book("J. K. Rowling","Harry Potter And The Sorcerer's Stone"));
        books.add(new Book("Gena Showalter","Catch A Mate"));
        books.add(new Book("Lora Leigh","Overcome"));
        books.add(new Book("Geoff Colvin","Talent Is Overrated"));
        books.add(new Book("Meg Jay","The Defining Decade"));
        books.add(new Book("J. K. Rowling","Harry Potter And The Chamber of Secrets"));
        books.add(new Book("J. K. Rowling","Harry Potter And The Goblet Of Fire"));
        books.add(new Book("J. K. Rowling","Harry Potter And The Prisoner Of Azkaban"));

        // Find the root view so we can add child views to it
//        LinearLayout rootView =(LinearLayout)findViewById(R.id.rootView);

        WordAdapter adapter =
                new WordAdapter(this, books);
        ListView listView = (ListView) findViewById(R.id.list);

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
//        for( int index =0; index < books.size(); index++){
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//            // Set the text to be word at the current index
//            bookView.setText(books.get(index));
//
//
//        }
        listView.setAdapter(adapter);


    }
}
