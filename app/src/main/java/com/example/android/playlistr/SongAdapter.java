package com.example.android.playlistr;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * @param context The current context. Used to inflate the layout file.
     * @param Songs A List of Song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> Songs) {
        super(context, 0, Songs);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_title);

        // Get the title from the current Song object and set this text on the title TextView
        titleTextView.setText(currentSong.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID song_artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.song_artist);

        // Get the artist from the current Song object and set this text on the artist TextView
        artistTextView.setText(currentSong.getSongArtist());

        // Find the ImageView in the list_item.xml layout with the ID album_art
        ImageView albumArtView = (ImageView) listItemView.findViewById(R.id.album_art);

        // Get the image resource ID from the current Song object and set the image to albumArtView
        albumArtView.setImageResource(currentSong.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView
        // so that it can be shown in the ListView
        return listItemView;
    }
}
