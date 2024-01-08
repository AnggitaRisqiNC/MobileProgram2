package com.hello.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.hello.R;

public class MyDemon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydemon);

        VideoView videoView = findViewById(R.id.video_mydemon);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.mydemon;
        Uri uri = Uri.parse(videoPath);

        // Set URI video ke VideoView
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        videoView.start();
    }
}
