package com.grape.basic8086;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

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
        String instructionDescription = intent.getStringExtra("details");
        if(instructionDescription != null)
        {
            textView.setText(instructionDescription);
        }

        String instructionName = intent.getStringExtra("instruction_name");
        if(instructionName != null)
        {
            List<String> instructions = Arrays.asList(this.getResources().getStringArray(R.array.instruction_names));
            int index = instructions.indexOf(instructionName);

            switch(index)
            {
                case 0:
                    textView.setText(this.getResources().getString(R.string.aaa));
                    break;
                case 1:
                    textView.setText(this.getResources().getString(R.string.aad));
                    break;
                case 2:
                    textView.setText(this.getResources().getString(R.string.aam));
                    break;
                case 3:
                    textView.setText(this.getResources().getString(R.string.aas));
                    break;
                case 4:
                    textView.setText(this.getResources().getString(R.string.adc));
                    break;
                case 5:
                    textView.setText(this.getResources().getString(R.string.and));
                    break;
                case 6:
                    textView.setText(this.getResources().getString(R.string.call));
                    break;
                case 7:
                    textView.setText(this.getResources().getString(R.string.cbw));
                    break;
                case 8:
                    textView.setText(this.getResources().getString(R.string.clc));
                    break;
                case 9:
                    textView.setText(this.getResources().getString(R.string.cld));
                    break;
                case 10:
                    textView.setText(this.getResources().getString(R.string.cli));
                    break;
                case 11:
                    textView.setText(this.getResources().getString(R.string.cmc));
                    break;
                case 12:
                    textView.setText(this.getResources().getString(R.string.cmp));
                    break;
                case 13:
                    textView.setText(this.getResources().getString(R.string.cmps));
                    break;
                case 14:
                    textView.setText(this.getResources().getString(R.string.daa));
                    break;
                case 15:
                    textView.setText(this.getResources().getString(R.string.das));
                    break;
                case 16:
                    textView.setText(this.getResources().getString(R.string.div));
                    break;
                case 17:
                    textView.setText(this.getResources().getString(R.string.esc));
                    break;
                case 18:
                    textView.setText(this.getResources().getString(R.string.hlt));
                    break;
                case 19:
                    textView.setText(this.getResources().getString(R.string.in));
                    break;
                case 20:
                    textView.setText(this.getResources().getString(R.string.inc));
                    break;
                case 21:
                    textView.setText(this.getResources().getString(R.string.interrupt));
                    break;
                case 22:
                    textView.setText(this.getResources().getString(R.string.iret));
                    break;
                case 23:
                    textView.setText(this.getResources().getString(R.string.jumps));
                    break;
                case 24:
                    textView.setText(this.getResources().getString(R.string.lahf));
                    break;
                case 25:
                    textView.setText(this.getResources().getString(R.string.lds));
                    break;
                case 26:
                    textView.setText(this.getResources().getString(R.string.lea));
                    break;
                case 27:
                    textView.setText(this.getResources().getString(R.string.lock));
                    break;
                case 28:
                    textView.setText(this.getResources().getString(R.string.lods));
                    break;
                case 29:
                    textView.setText(this.getResources().getString(R.string.loops));
                    break;
                case 30:
                    textView.setText(this.getResources().getString(R.string.mov));
                    break;
                case 31:
                    textView.setText(this.getResources().getString(R.string.movs));
                    break;
                case 32:
                    textView.setText(this.getResources().getString(R.string.mul));
                    break;
                case 33:
                    textView.setText(this.getResources().getString(R.string.neg));
                    break;
                case 34:
                    textView.setText(this.getResources().getString(R.string.nop));
                    break;
                case 35:
                    textView.setText(this.getResources().getString(R.string.pop));
                    break;
                case 36:
                    textView.setText(this.getResources().getString(R.string.push));
                    break;
                case 37:
                    textView.setText(this.getResources().getString(R.string.rcl));
                    break;
                case 38:
                    textView.setText(this.getResources().getString(R.string.reps));
                    break;
                case 39:
                    textView.setText(this.getResources().getString(R.string.ret));
                    break;
                case 40:
                    textView.setText(this.getResources().getString(R.string.rol));
                    break;
                case 41:
                    textView.setText(this.getResources().getString(R.string.sal));
                    break;
                case 42:
                    textView.setText(this.getResources().getString(R.string.sar));
                    break;
                case 43:
                    textView.setText(this.getResources().getString(R.string.scas));
                    break;
                case 44:
                    textView.setText(this.getResources().getString(R.string.stos));
                    break;
                case 45:
                    textView.setText(this.getResources().getString(R.string.sub));
                    break;
                case 46:
                    textView.setText(this.getResources().getString(R.string.test));
                    break;
                case 47:
                    textView.setText(this.getResources().getString(R.string.xchg));
                    break;
                case 48:
                    textView.setText(this.getResources().getString(R.string.xlat));
                    break;
                default:
                    textView.setText("");
                    break;
            }
        }
    }
}
