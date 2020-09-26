package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        Button audiobooks = (Button) findViewById(R.id.audiobooks);

        // Set a click listener on that View
        audiobooks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the audiobooks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, AudiobooksActivity.class);

                // Start the new activity
                startActivity(numbersIntent);

            }
        });

        // Find the View that shows the family category
        Button authors = (Button) findViewById(R.id.authors);

        // Set a click listener on that View
        authors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the authors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, AuthorsActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        Button favorites = (Button) findViewById(R.id.favorites);

        // Set a click listener on that View
        favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the favorites category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, FavoritesActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });




    }




}