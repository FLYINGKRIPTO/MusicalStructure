package com.example.dell.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingNow extends AppCompatActivity  {
    TextView textView;
    TextView textView1;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        textView = findViewById(R.id.song_name);
        imageView = findViewById(R.id.song_image);
        textView1 = findViewById(R.id.artist_name);

       // String TempHolder = getIntent().getStringExtra("ListViewClickedValue");
        //textView.setText(TempHolder);
       Bundle bundle = getIntent().getExtras();
        String SongName = bundle.getString("ListViewClickedValue");
        int imageData = bundle.getInt("ListViewClickedImage");
        String artistName = bundle.getString("ListViewClickedArtist");

        textView.setText(SongName);
        imageView.setImageResource(imageData);
        textView1.setText(artistName);


    }

}
