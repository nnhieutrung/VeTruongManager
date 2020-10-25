package com.example.vetruong.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vetruong.MainActivity;
import com.example.vetruong.R;

public class IntroAcitivity extends AppCompatActivity {

    //Constant time delay
    private final int DELAY = 2500;

    //Fields (Widgets)
    private ImageView logoView;
    private ImageView welcomeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        getWindow().setBackgroundDrawable(null);

        //Methods to call
        initializeView();
        animatedLogo();
        goToMainActivity();
    }



    private void initializeView() {
        logoView = findViewById(R.id.intro_logo);
        welcomeView = findViewById(R.id.welcome_text);
    }

    private void animatedLogo() {
        //This method will animate logo
        Animation fadingAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadingAnimation.setDuration(DELAY);

        logoView.startAnimation(fadingAnimation);
        welcomeView.startAnimation(fadingAnimation);
    }

    private void goToMainActivity() {
        //This method will tkae the user to main actitvity when the animation is finished
        new Handler().postDelayed(() -> {
            startActivity(new Intent(IntroAcitivity.this, MainActivity.class));
            finish();
        }, DELAY);

    }
}