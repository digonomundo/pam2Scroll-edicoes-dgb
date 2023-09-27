package com.example.pam2scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class actCreditos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_creditos);

        getSupportActionBar().hide();

        VideoView videoView = findViewById(R.id.video_view);
        String videoPatch = "android.resource://" + getPackageName() + "/" + R.raw.creditos;
        Uri uri = Uri.parse(videoPatch);
        videoView.setVideoURI(uri);

        videoView.start();


        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}