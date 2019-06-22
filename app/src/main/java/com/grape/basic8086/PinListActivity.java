package com.grape.basic8086;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import com.purplebrain.adbuddiz.sdk.AdBuddiz;

/**
 * Created by Kbhargav on 4/21/2016.
 */
public class PinListActivity extends AppCompatActivity implements View.OnClickListener
{
    Button b[] = new Button[26];
    TextView tv;
    int button_id[] = {R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9,
            R.id.button10,
            R.id.button11,
            R.id.button12,
            R.id.button13,
            R.id.button14,
            R.id.button15,
            R.id.button16,
            R.id.button17,
            R.id.button18,
            R.id.button19,
            R.id.button20,
            R.id.button21,
            R.id.button22,
            R.id.button23,
            R.id.button24,
            R.id.button25,
            R.id.button26};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_list);

        tv = (TextView)findViewById(R.id.textView1);
        for(int i = 0;i < 26;i++)
        {
            b[i] = (Button)findViewById(button_id[i]);
        }

        //AdBuddiz.cacheAds(this);

        //AdBuddiz.showAd(this);
    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        Intent i;
        Log.e("View ID", String.valueOf(id));
        Log.e("button1 ID", String.valueOf(R.id.button1));

        switch(id)
        {
            case R.id.button1:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe1));
                startActivity(i);
                break;
            case R.id.button2:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe2));
                startActivity(i);
                break;
            case R.id.button3:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe3));
                startActivity(i);
                break;
            case R.id.button4:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe4));
                startActivity(i);
                break;
            case R.id.button5:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe5));
                startActivity(i);
                break;
            case R.id.button6:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe6));
                startActivity(i);
                break;
            case R.id.button7:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe7));
                startActivity(i);
                break;
            case R.id.button8:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe8));
                startActivity(i);
                break;
            case R.id.button9:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe9));
                startActivity(i);
                break;
            case R.id.button10:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe10));
                startActivity(i);
                break;
            case R.id.button11:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe11));
                startActivity(i);
                break;
            case R.id.button12:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe12));
                startActivity(i);
                break;
            case R.id.button13:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe13));
                startActivity(i);
                break;
            case R.id.button14:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe14));
                startActivity(i);
                break;
            case R.id.button15:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe15));
                startActivity(i);
                break;
            case R.id.button16:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe16));
                startActivity(i);
                break;
            case R.id.button17:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe17));
                startActivity(i);
                break;
            case R.id.button18:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe18));
                startActivity(i);
                break;
            case R.id.button19:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe19));
                startActivity(i);
                break;
            case R.id.button20:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe20));
                startActivity(i);
                break;
            case R.id.button21:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe21));
                startActivity(i);
                break;
            case R.id.button22:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe22));
                startActivity(i);
                break;
            case R.id.button23:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe23));
                startActivity(i);
                break;
            case R.id.button24:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe24));
                startActivity(i);
                break;
            case R.id.button25:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe25));
                startActivity(i);
                break;
            case R.id.button26:
                i = new Intent(PinListActivity.this,PinDescriptionActivity.class); i.putExtra("pin_description", this.getResources().getString(R.string.describe26));
                startActivity(i);
                break;
            default:
                break;
        }

        //AdBuddiz.showAd(this);
        
    }
}
