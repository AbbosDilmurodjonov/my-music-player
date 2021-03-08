package com.mysamarkand.musicplayer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import com.mysamarkand.musicplayer.R;
import com.mysamarkand.musicplayer.models.SongModel;

import java.util.ArrayList;

import static com.mysamarkand.musicplayer.activities.SongsList.songsList;

public class NowPlaying extends AppCompatActivity {

    private ArrayList<SongModel> allSongs = new ArrayList<>();
    private int position = -1;
    private MediaPlayer mediaPlayer;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        getIntent();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    private void getIntentMethod() {
        position = getIntent().getIntExtra("position", -1);
        allSongs = songsList; // songsList from SongsList.java because is static type
        uri = Uri.parse(allSongs.get(position).getUri());

        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
        mediaPlayer.start();
    }

}