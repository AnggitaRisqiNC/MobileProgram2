package com.hello.Maps;

import android.content.Intent;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;

public class MapsActivity extends AppCompatActivity {
    public void showMap(Uri geoLocation) {
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
