package com.example.kunalberry.animatebutton3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void blueBulb(View view) {

        ImageView blue = (ImageView) findViewById(R.id.bluebutton);
        ImageView green = (ImageView) findViewById(R.id.greenbutton);
        blue.animate().alpha(1).setDuration(1000);
        green.animate().alpha(0).setDuration(1000);
    }


    public void greenBulb(View view) {
        ImageView blue = (ImageView) findViewById(R.id.bluebutton);
        ImageView green = (ImageView) findViewById(R.id.greenbutton);
        blue.animate().alpha(0).setDuration(1000);
        green.animate().alpha(1).setDuration(1000);
    }
}
