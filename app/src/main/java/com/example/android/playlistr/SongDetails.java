package com.example.android.playlistr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SongDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        // Find views on the Song Details activity by ID
        TextView mSongTitleView = findViewById(R.id.song_title_details);
        TextView mSongArtistView = findViewById(R.id.song_artist_details);
        ImageView mAlbumArtView = findViewById(R.id.album_art_details);

        // Get the data from the intent
        Intent intent = getIntent();
        String mSongTitle = intent.getStringExtra("Song Title");
        String mSongArtist = intent.getStringExtra("Song Artist");
        int mAlbumArtID = intent.getIntExtra("Album Art", 0);

        // Set the data from the intent to the views
        mSongTitleView.setText(mSongTitle);
        mSongArtistView.setText(mSongArtist);
        mAlbumArtView.setImageResource(mAlbumArtID);
    }
}