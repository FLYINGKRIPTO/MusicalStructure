package com.example.dell.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongList extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        final ArrayList<List> song_details = new ArrayList<List>();
        song_details.add(new List("Thunder", "Imagine Dragons", R.drawable.thunderdd));
        song_details.add(new List("Attention","Charlie Puth",R.drawable.attentiondd));
        song_details.add(new List("Shape Of You","Ed Sheeran",R.drawable.shapeofyoudd));
        song_details.add(new List("Despacito","Louis Fonsi",R.drawable.despacitodd));
        song_details.add(new List("Girls Like You","Maroon Five",R.drawable.girlslikeyoudd));
        song_details.add(new List("Faded","Alan Walker",R.drawable.fadeddd));
        song_details.add(new List("Perfect","Ed Sheeran",R.drawable.perfectdd));
        song_details.add(new List("Red","Taylor Swift",R.drawable.reddd));
        song_details.add(new List("Magenta Riddim","DJ Snake",R.drawable.magenta));
        song_details.add(new List("Cold Water","Justin Beiber",R.drawable.coldwaterdd));
        final SongAdapter adapter  = new SongAdapter(this,song_details);
        final ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              String TempListViewClickedValue = song_details.get(position).getmSongName();
              int TempListViewClickedImage = song_details.get(position).getmImageResourceId();
              String TempListviewClickedArtist = song_details.get(position).getmArtistName();
               Intent playingNowIntent = new Intent(SongList.this,PlayingNow.class);
              playingNowIntent.putExtra("ListViewClickedValue",TempListViewClickedValue);
              playingNowIntent.putExtra("ListViewClickedImage",TempListViewClickedImage);
              playingNowIntent.putExtra("ListViewClickedArtist",TempListviewClickedArtist);
               startActivity(playingNowIntent);
           }
       });
    }
}
