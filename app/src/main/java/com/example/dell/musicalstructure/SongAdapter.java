package com.example.dell.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<List> {
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<List> song_details) {
        super(context, 0, song_details);
    }
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.song_list_item, parent, false);
            }

            List currentList  = (List) getItem(position);
            ImageView album_image =listItemView.findViewById(R.id.album_image);
            album_image.setImageResource(currentList.getmImageResourceId());
            TextView song_name = listItemView.findViewById(R.id.song_name);
            song_name.setText(currentList.getmSongName());
            TextView artist_name = listItemView.findViewById(R.id.artist_name);
            artist_name.setText(currentList.getmArtistName());
            return listItemView;
        }
}

