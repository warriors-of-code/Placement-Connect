package com.shivamvk.placementconnect;

import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity implements WelcomeFragment.OnFragmentInteractionListener, CampusStoriesFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ViewPager viewPager = findViewById(R.id.viewPager);
        SliderAdapter adapter = new SliderAdapter(getSupportFragmentManager(),2);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
