package com.example.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class AuthorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an arraylist of authors
        ArrayList<Book> authors = new ArrayList<Book>();

        authors.add(new Book("J. K. Rowling"));
        authors.add(new Book("Lyndsay Sands"));
        authors.add(new Book("Gena Showalter"));
        authors.add(new Book("Lora Leigh"));
        authors.add(new Book("Geoff Colvin"));
        authors.add(new Book("Meg Jay"));

       // LinearLayout listView = (LinearLayout)findViewById(R.id.list);
        WordAdapter adapter =
                new WordAdapter(this, authors);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        for (int index = 0; index < authors.size(); index++) {
//            TextView authorView = new TextView(this);
//            authorView.setText(authors.get(index));
//            setContentView(R.layout.book_list);
//
//        }
    }
}
