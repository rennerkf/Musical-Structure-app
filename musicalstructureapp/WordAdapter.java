package com.example.musicalstructureapp;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Book> {

    public WordAdapter(Activity context, ArrayList<Book> books){
        super(context,0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Book currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView authorNameTextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        authorNameTextView.setText(currentWord.getAuthorName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView titleNameTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        titleNameTextView.setText(currentWord.getTitleName());

        // so that it can be shown in the ListView
        return listItemView;
    }
}