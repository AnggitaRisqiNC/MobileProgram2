package com.hello.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.hello.R;

public class BlackKnight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackknight);

        VideoView videoView = findViewById(R.id.video_blackknight);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.blackknight;
        Uri uri = Uri.parse(videoPath);

        // Set URI video ke VideoView
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        videoView.start();
    }
}

