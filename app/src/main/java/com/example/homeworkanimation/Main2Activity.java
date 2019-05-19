package com.example.homeworkanimation;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView ios, android;
    TextView ios_text, android_text,thats_all;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ios = findViewById(R.id.ios);
        android = findViewById(R.id.android);
        ios_text = findViewById(R.id.ios_text);
        android_text = findViewById(R.id.android_text);
        thats_all = findViewById(R.id.thats_all);

        Animation androidAnimation = AnimationUtils.loadAnimation(this,R.anim.android);
        android.startAnimation(androidAnimation);
        androidAnimation.setFillAfter(true);


        Animation iosAnimation = AnimationUtils.loadAnimation(this,R.anim.ios);
        ios.startAnimation(iosAnimation);
        iosAnimation.setFillAfter(true);

        Animation androidTextdAnimation = AnimationUtils.loadAnimation(this,R.anim.android_text);
        android_text.startAnimation(androidTextdAnimation);
        androidTextdAnimation.setFillAfter(true);

        Animation iosTextAnimation = AnimationUtils.loadAnimation(this,R.anim.ios_text);
        ios_text.startAnimation(iosTextAnimation);
        iosTextAnimation.setFillAfter(true);

        Animation endAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.thats_all);
        thats_all.startAnimation(endAnim);
        endAnim.setFillAfter(true);

    }
}
