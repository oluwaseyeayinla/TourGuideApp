package com.alc.google.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final long ONE_MILLISECOND = 1000;
    long quitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        // Create an adapter that knows which fragment should be shown on each page
        TourGuideFragmentPagerAdapter adapter = new TourGuideFragmentPagerAdapter(this, getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        if (quitTime < System.currentTimeMillis()) {
            // on hardware back button pressed, confirm notification by toast
            confirmQuit();
        } else {
            // on hardware back button pressed, quit the app
            quitApp();
        }
    }

    /**
     *
     */
    void confirmQuit() {
        // display confirm toast
        Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_LONG).show();
        quitTime = System.currentTimeMillis() + (ONE_MILLISECOND * 5);
    }

    /**
     * Quit and exit the application.
     */
    void quitApp() {
        // drop activity from memory
        finish();

        System.exit(0);
    }
}
