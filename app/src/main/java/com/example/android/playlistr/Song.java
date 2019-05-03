package com.example.android.playlistr;

public class Song {

    // Title of the song
    private String mTitle;

    // Artist of the song
    private String mArtist;

    // Drawable resource ID for the album art
    private int mImageResourceId;

    /*
     * Create a new Song object.
     *
     * @param title is the title of the song
     * @param artist is the artist of the song
     * @param imageResourceId is drawable reference ID that corresponds to the album art
     * */
    public Song(String title, String artist, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the title of the song
     */
    public String getSongTitle() {
        return mTitle;
    }

    /**
     * Get the artist of the song
     */
    public String getSongArtist() {
        return mArtist;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}