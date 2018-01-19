package com.grape.basic8086;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

//import com.purplebrain.adbuddiz.sdk.AdBuddiz;

/**
 * Created by Kbhargav on 4/21/2016.
 */
public class PinDescriptionActivity extends AppCompatActivity
{
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_description);

        tv = (TextView)findViewById(R.id.textView1);

        Intent i = getIntent();
        String pin_description = i.getStringExtra("pin_description");
        tv.setText(pin_description);

        String fontpath = "fonts/Quattrocento-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);

        tv.setTypeface(tf);

        //AdBuddiz.cacheAds(this);
        //AdBuddiz.showAd(this);
    }
}
