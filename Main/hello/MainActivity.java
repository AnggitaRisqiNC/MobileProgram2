package com.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.hello.Chat.OneActivity;
import com.hello.Count.CountActivity;
import com.hello.Fibonacci.FibonacciActivity;
import com.hello.Fragment.Celebrity;
import com.hello.Fragment.PagerActivity;
import com.hello.Hello.HelloActivity;
import com.hello.News.ScrollingIcecold;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnSetAlarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAlarm();
            }
        });

    }
    public void btnMaps(View view) {
        double latitude = 37.5444218;
        double longitude = 127.0438123;

        Uri geoLocation = Uri.parse("geo:" + latitude + "," + longitude + "?q=" + latitude + "," + longitude + "(Label)");

        showMap(geoLocation);
    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    private void setAlarm() {
        Intent alarm = new Intent(android.provider.AlarmClock.ACTION_SET_ALARM);
        startActivity(alarm);
    }

    public void btnHello(View view) {
        Intent helloworld = new Intent(MainActivity.this, HelloActivity.class);
        startActivity(helloworld);
    }

    public void btnCount(View view) {
        Intent count = new Intent(MainActivity.this, CountActivity.class);
        startActivity(count);
    }

    public void btnFibonacci(View view) {
        Intent fibonacci = new Intent(MainActivity.this, FibonacciActivity.class);
        startActivity(fibonacci);
    }

    public void btnSianida(View view) {
        Intent sianida = new Intent(MainActivity.this, ScrollingIcecold.class);
        startActivity(sianida);
    }

    public void btnTwoActivity(View view) {
        Intent twoact = new Intent(MainActivity.this, OneActivity.class);
        startActivity(twoact);
    }

    public void btnMovie(View view) {
        Intent pageract = new Intent(MainActivity.this, PagerActivity.class);
        startActivity(pageract);
    }

    public void btnNone(View view) {
        Intent noneact = new Intent(MainActivity.this, Celebrity.class);
        startActivity(noneact);
    }
}