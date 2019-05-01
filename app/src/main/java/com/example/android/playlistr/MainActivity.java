package com.example.android.playlistr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        // Create an ArrayList of Song objects
        ArrayList<Song> Songs = new ArrayList<Song>();
        Songs.add(new Song("Space Cowboy", "Kacey Musgraves", R.drawable.goldenhour));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter adapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_song);
        listView.setAdapter(adapter);
    }
}