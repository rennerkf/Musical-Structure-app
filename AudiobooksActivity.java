package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        // Create an Array list of words
        ArrayList<Book> books = new ArrayList<Book>();

        //words.add("one");
        books.add(new Book("Lynsay Sands","Devil of the Highlands"));
        books.add(new Book("Maya Banks","No Place To Run"));
        books.add(new Book("J. K. Rowling","Harry Potter And The Sorcerer's Stone"));
        books.add(new Book("Gena Showalter","Catch A Mate"));
        books.add(new Book("Geoff Colvin","Talent Is Overrated"));
        books.add(new Book("Meg Jay","The Defining Decade"));
        books.add(new Book("J. K. Rowling","Harry Potter And The Chamber of Secrets"));
        books.add(new Book("J. K. Rowling","Harry Potter And The Goblet Of Fire"));

        WordAdapter adapter =
                new WordAdapter(this, books);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //get the current audiobook from the ArrayList (songs) with the position of the clicked item.

                Audiobook currentPlayingAudiobook = Audiobook.get(position);

                //get the title name and author name from the currentPlayingAduiobook object

                String titleName = currentPlayingAudiobook.getTitleName();

                String authorName = currentPlayingAudiobook.getAuthorName();

                //use explicit Intent to open the NowPalyingActivity and store the data of the song to this Intent object.

                Intent openAudioPlayer = new Intent(MainActivity.this, NowPlaying.class);

                //put the data on the Intent as (key, value) pair

                openAudioPlayer.putExtra("titleName", titleName);

                openAudioPlayer.putExtra("authorsName", authorName);

                //start the Intent to open the NowPalyingActivity

                startActivity(openAudioPlayer);

            }

        });


    }
}
