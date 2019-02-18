package com.example.mi_5.driver;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import Adapters.SlideThrough;

public class WelcomeActivity extends AppCompatActivity {
    private LinearLayout mDotsLayout;   //layout to show dots
    private TextView[] mDots;     //array of texts

    private final ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsLayout(position);

            int mCurrentPage = position;

            if (position == 0) {



            } else if (position == mDots.length - 1) {






            } else {

            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        setContentView(R.layout.activity_welcome);


        ViewPager mViewPager = findViewById(R.id.Viewpager);
        mDotsLayout = findViewById(R.id.slideDots);

        SlideThrough slidePagerAdapter = new SlideThrough(this);

        mViewPager.setAdapter(slidePagerAdapter);

        addDotsLayout(0);

        mViewPager.addOnPageChangeListener(onPageChangeListener);

    }

    public void doAction(View view) {
        switch (view.getId()) {
            case R.id.btnOpenLogin:
                startActivity(new Intent(WelcomeActivity.this, Login.class));
                break;
            case R.id.btnOpenSignUp:
                startActivity(new Intent(WelcomeActivity.this, SignUp.class));
                break;

        }
    }

    //indicator effect

    private void addDotsLayout(int position) {
        mDots = new TextView[4];
        mDotsLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextColor(getResources().getColor(R.color.white));
            mDots[i].setTextSize(36);

            mDotsLayout.addView(mDots[i]);

        }

        if (mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.colorOrange));

        }

    }
}

