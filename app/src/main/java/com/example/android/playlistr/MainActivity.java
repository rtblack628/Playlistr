package com.example.android.playlistr;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of Song objects
        final ArrayList<Song> Songs = new ArrayList<Song>();
        Songs.add(new Song("Space Cowboy", "Kacey Musgraves", R.drawable.goldenhour));
        Songs.add(new Song("Call Your Girlfriend", "Robyn", R.drawable.bodytalk));
        Songs.add(new Song("Happier", "Marshmello ft. Bastille", R.drawable.happier));
        Songs.add(new Song("Green Light", "Lorde", R.drawable.melodrama));
        Songs.add(new Song("You're Got the Love", "Florence + The Machine", R.drawable.lungs));
        Songs.add(new Song("Space Cowboy", "Kacey Musgraves", R.drawable.goldenhour));
        Songs.add(new Song("Call Your Girlfriend", "Robyn", R.drawable.bodytalk));
        Songs.add(new Song("Happier", "Marshmello ft. Bastille", R.drawable.happier));
        Songs.add(new Song("Green Light", "Lorde", R.drawable.melodrama));
        Songs.add(new Song("You're Got the Love", "Florence + The Machine", R.drawable.lungs));
        Songs.add(new Song("Space Cowboy", "Kacey Musgraves", R.drawable.goldenhour));
        Songs.add(new Song("Call Your Girlfriend", "Robyn", R.drawable.bodytalk));
        Songs.add(new Song("Happier", "Marshmello ft. Bastille", R.drawable.happier));
        Songs.add(new Song("Green Light", "Lorde", R.drawable.melodrama));
        Songs.add(new Song("You're Got the Love", "Florence + The Machine", R.drawable.lungs));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter adapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView, and attach the adapter to the listView
        ListView listView = (ListView) findViewById(R.id.listview_song);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, SongDetails.class);
                intent.putExtra("Song Title", Songs.get(position).getSongTitle());
                intent.putExtra("Song Artist", Songs.get(position).getSongArtist());
                intent.putExtra("Album Art", Songs.get(position).getImageResourceId());
                MainActivity.this.startActivity(intent);
            }
        });
    }
}