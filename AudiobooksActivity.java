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
    private Button mPlayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);




        // Create an Array list of words
       final ArrayList<Book> books = new ArrayList<Book>();

        //words.add("one");
        books.add(new Book("Lynsay Sands","Devil of the Highlands",R.drawable.devilhighlands));
        books.add(new Book("Maya Banks","No Place To Run", R.drawable.noplace));
        books.add(new Book("J. K. Rowling","Harry Potter And The Sorcerer's Stone", R.drawable.sorcerersstone));
        books.add(new Book("Gena Showalter","Catch A Mate", R.drawable.catchmate));
        books.add(new Book("Geoff Colvin","Talent Is Overrated",R.drawable.talentoverrated));
        books.add(new Book("Meg Jay","The Defining Decade",R.drawable.definingcode));
        books.add(new Book("J. K. Rowling","Harry Potter And The Chamber of Secrets",R.drawable.chambersecrets));
        books.add(new Book("J. K. Rowling","Harry Potter And The Goblet Of Fire", R.drawable.gobletfire));

        WordAdapter adapter =
                new WordAdapter(this, books);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //get the current audiobook from the ArrayList (audiobooks) with the position of the clicked item.

                Book currentPlayingAudiobook = Book.get(position);

                //get the title name and author name from the currentPlayingAduiobook object

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

//        books.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // Creating intent and putting inside it information for the selected item, that retrieved from books data from the array list.
//                Intent intent = new Intent(AudiobooksActivity.this, NowPlaying.class);
//                intent.putExtra(Info.NOW_PLAYING, false);
//                intent.putExtra(Info.BOOK_TITLE, books.get(position).getTitleName());
//                intent.putExtra(Info.BOOK_AUTHOR, books.get(position).getAuthorName());
//                intent.putExtra(Info.BOOK_COVER, books.get(position).getImageId());
//                startActivity(intent);
//            }
//        });


        // Setting click listener to the button "Now Playing"
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudiobooksActivity.this, NowPlaying.class);
                intent.putExtra(Info.NOW_PLAYING, true);
                startActivity(intent);
            }
        });

    }

    private void findViews() {
        mPlayButton = (Button) findViewById(R.id.play);
    }

    }
}
