package com.example.homeworkanimation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView set_im;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set_im = findViewById(R.id.settings_image);
        tv = findViewById(R.id.textHW);

        Animation settings = AnimationUtils.loadAnimation(this,R.anim.settings);
        set_im.startAnimation(settings);
        settings.setFillAfter(true);

        Animation textHW6 = AnimationUtils.loadAnimation(this, R.anim.homework6);
        tv.startAnimation(textHW6);
        textHW6.setFillAfter(true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        }, 6000);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
