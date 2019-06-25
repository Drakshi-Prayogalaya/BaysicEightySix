package com.grape.basic8086;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

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

        tv = findViewById(R.id.textView1);

        Intent i = getIntent();
        String pinName = i.getStringExtra("pin_name");
        List<String> pins = Arrays.asList(this.getResources().getStringArray(R.array.pins));
        int index = pins.indexOf(pinName);

        switch(index)
        {
            case 0:
                tv.setText(this.getResources().getString(R.string.describe1));
                break;
            case 1:
                tv.setText(this.getResources().getString(R.string.describe2));
                break;
            case 2:
                tv.setText(this.getResources().getString(R.string.describe3));
                break;
            case 3:
                tv.setText(this.getResources().getString(R.string.describe4));
                break;
            case 4:
                tv.setText(this.getResources().getString(R.string.describe5));
                break;
            case 5:
                tv.setText(this.getResources().getString(R.string.describe6));
                break;
            case 6:
                tv.setText(this.getResources().getString(R.string.describe7));
                break;
            case 7:
                tv.setText(this.getResources().getString(R.string.describe8));
                break;
            case 8:
                tv.setText(this.getResources().getString(R.string.describe9));
                break;
            case 9:
                tv.setText(this.getResources().getString(R.string.describe10));
                break;
            case 10:
                tv.setText(this.getResources().getString(R.string.describe11));
                break;
            case 11:
                tv.setText(this.getResources().getString(R.string.describe12));
                break;
            case 12:
                tv.setText(this.getResources().getString(R.string.describe13));
                break;
            case 13:
                tv.setText(this.getResources().getString(R.string.describe14));
                break;
            case 14:
                tv.setText(this.getResources().getString(R.string.describe15));
                break;
            case 15:
                tv.setText(this.getResources().getString(R.string.describe16));
                break;
            case 16:
                tv.setText(this.getResources().getString(R.string.describe17));
                break;
            case 17:
                tv.setText(this.getResources().getString(R.string.describe18));
                break;
            case 18:
                tv.setText(this.getResources().getString(R.string.describe19));
                break;
            case 19:
                tv.setText(this.getResources().getString(R.string.describe20));
                break;
            case 20:
                tv.setText(this.getResources().getString(R.string.describe21));
                break;
            case 21:
                tv.setText(this.getResources().getString(R.string.describe22));
                break;
            case 22:
                tv.setText(this.getResources().getString(R.string.describe23));
                break;
            case 23:
                tv.setText(this.getResources().getString(R.string.describe24));
                break;
            case 24:
                tv.setText(this.getResources().getString(R.string.describe25));
                break;
            case 25:
                tv.setText(this.getResources().getString(R.string.describe26));
                break;
            default:
                tv.setText(" ");
                break;
        }

        //tv.setText(pin_description);

        String fontpath = "fonts/Quattrocento-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);

        tv.setTypeface(tf);
    }
}
