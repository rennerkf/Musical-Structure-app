package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an Array list of words
        final ArrayList<Book> books = new ArrayList<Book>();

        //words.add("one");
        books.add(new Book("Lynsay Sands", "Devil of the Highlands", R.drawable.devilhighlands));
        books.add(new Book("Maya Banks", "No Place To Run", R.drawable.noplace));
        books.add(new Book("J. K. Rowling", "Harry Potter And The Sorcerer's Stone", R.drawable.sorcerersstone));
        books.add(new Book("Gena Showalter", "Catch A Mate", R.drawable.catchmate));
        books.add(new Book("Geoff Colvin", "Talent Is Overrated", R.drawable.talentoverrated));
        books.add(new Book("Meg Jay", "The Defining Decade", R.drawable.definingcode));
        books.add(new Book("J. K. Rowling", "Harry Potter And The Chamber of Secrets", R.drawable.chambersecrets));
        books.add(new Book("J. K. Rowling", "Harry Potter And The Goblet Of Fire", R.drawable.gobletfire));

        WordAdapter adapter =
                new WordAdapter(this, books);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //get the current audiobook from the ArrayList (audiobooks) with the position of the clicked item.

                Book currentPlayingAudiobook = books.get(position);

                //get the title name and author name from the currentPlayingAudiobook object

                String titleName = currentPlayingAudiobook.getTitleName();

                String authorName = currentPlayingAudiobook.getAuthorName();

                //use explicit Intent to open the NowPalyingActivity and store the data of the song to this Intent object.

                Intent openAudioPlayer = new Intent(AudiobooksActivity.this, NowPlaying.class);

                //put the data on the Intent as (key, value) pair

                openAudioPlayer.putExtra("titleName", titleName);

                openAudioPlayer.putExtra("authorsName", authorName);

                //start the Intent to open the NowPalyingActivity

                startActivity(openAudioPlayer);

            }

        });



    }
}

