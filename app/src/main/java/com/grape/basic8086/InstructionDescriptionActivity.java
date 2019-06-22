package com.grape.basic8086;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

//import com.purplebrain.adbuddiz.sdk.AdBuddiz;

/**
 * Created by kbhargav on 2/26/2016.
 */
public class InstructionDescriptionActivity extends AppCompatActivity
{
    TextView textView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_description);

        textView = findViewById(R.id.textViewDescription);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Quattrocento-Regular.ttf");
        textView.setTypeface(tf);

        intent = getIntent();
        
        intentCheck("instruction");

        intentCheck("details");

        //AdBuddiz.cacheAds(this);
        //AdBuddiz.showAd(this);
        

    }

    public void intentCheck(String code)
    {
        if(intent.hasExtra(code))
        {
            textView.setText(intent.getStringExtra(code));
        }
    }
}
