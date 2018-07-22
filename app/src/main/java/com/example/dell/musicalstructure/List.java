package com.example.dell.musicalstructure;

public class List {
    private String mSongName;
    private String mArtistName;
    private int mImageResourceId;

     public List(String songName,String artistName, int imageResourceId)
     {
         this.mSongName = songName;
         this.mArtistName = artistName;
         this.mImageResourceId= imageResourceId;
     }
     public String getmSongName(){
         return mSongName;
     }
     public String getmArtistName()
     {
         return mArtistName;
     }
     public int getmImageResourceId()
     {
         return mImageResourceId;
     }
}
