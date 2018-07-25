package com.example.dell.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingNow extends AppCompatActivity  {
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        textView = findViewById(R.id.song_name);
        imageView = findViewById(R.id.song_image);
       // String TempHolder = getIntent().getStringExtra("ListViewClickedValue");
        //textView.setText(TempHolder);
       Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("ListViewClickedValue");

        textView.setText(data);
    }
}
