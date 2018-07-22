package com.example.dell.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayingNow extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<List> song_details = new ArrayList<List>();
        song_details.add(new List("Thunder","Imagine Dragons",R.drawable.thunder));
        song_details.add(new List("Attention","Charlie Puth",R.drawable.attention));
        song_details.add(new List("Shape Of You","Ed Sheeran",R.drawable.shapeofyou));
        song_details.add(new List("Despacito","Louis Fonsi",R.drawable.despacito));
        song_details.add(new List("Girls Like You","Maroon Five",R.drawable.girlslikeyou));
        song_details.add(new List("Faded","Alan Walker",R.drawable.faded));
        song_details.add(new List("Perfect","Ed Sheeran",R.drawable.perfect));
        song_details.add(new List("Red","Taylor Swift",R.drawable.red));
        song_details.add(new List("Hymn for the weekend","ColdPlay",R.drawable.hymnfortheweekend));
        song_details.add(new List("Cold Water","Justin Beiber",R.drawable.coldwater));

        SongAdapter adapter  = new SongAdapter(this,song_details);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
