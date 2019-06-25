package com.grape.basic8086;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kbhargav on 12/15/2015.
 */
public class Programs extends AppCompatActivity
{
    TextView tvProgramName, tvProgram;
    RelativeLayout rela1;

    @ColorInt static final int darkGreen = 0xFF1B5E20;

    String program, title;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programs);

        tvProgram = findViewById(R.id.textView3);
        tvProgramName = findViewById(R.id.textView1);

        rela1 = findViewById(R.id.relalay1);
        rela1.setVisibility(View.GONE);
        tvProgramName.setVisibility(View.GONE);

        String fontpath = "fonts/Quattrocento-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);

        tvProgram.setTypeface(tf);
        tvProgramName.setTypeface(tf);

        Intent i = getIntent();
        String programName = i.getStringExtra("program_name");
        List<String> programNames = Arrays.asList(this.getResources().getStringArray(R.array.program_names));
        int index = programNames.indexOf(programName);
        title = programName;

        switch(index)
        {
            case 0:
                tvProgramName.setText(programName);
                program = ProgramData.program1;
                tvProgram.setText(program);
                break;
            case 1:
                tvProgramName.setText(programName);
                program = ProgramData.program2;
                tvProgram.setText(program);
                break;
            case 2:
                tvProgramName.setText(programName);
                program = ProgramData.program3;
                tvProgram.setText(program);
                break;
            case 3:
                tvProgramName.setText(programName);
                program = ProgramData.program4;
                tvProgram.setText(program);
                break;
            case 4:
                tvProgramName.setText(programName);
                program = ProgramData.program5;
                tvProgram.setText(program);
                break;
            case 5:
                tvProgramName.setText(programName);
                program = ProgramData.program6;
                tvProgram.setText(program);
                break;
            case 6:
                tvProgramName.setText(programName);
                program = ProgramData.program7;
                tvProgram.setText(program);
                break;
            case 7:
                tvProgramName.setText(programName);
                program = ProgramData.program8;
                tvProgram.setText(program);
                break;
            case 8:
                tvProgramName.setText(programName);
                program = ProgramData.program9;
                tvProgram.setText(program);
                break;
            case 9:
                tvProgramName.setText(programName);
                program = ProgramData.program10;
                tvProgram.setText(program);
                break;
            case 10:
                tvProgramName.setText(programName);
                program = ProgramData.program11;
                tvProgram.setText(program);
                break;
            case 11:
                tvProgramName.setText(programName);
                program = ProgramData.program12;
                tvProgram.setText(program);
                break;
            case 12:
                tvProgramName.setText(programName);
                program = ProgramData.program13;
                tvProgram.setText(program);
                break;
            case 13:
                tvProgramName.setText(programName);
                program = ProgramData.program14;
                tvProgram.setText(program);
                break;
            case 14:
                tvProgramName.setText(programName);
                program = ProgramData.program15;
                tvProgram.setText(program);
                break;
            case 15:
                tvProgramName.setText(programName);
                program = ProgramData.program16;
                tvProgram.setText(program);
                break;
            case 16:
                tvProgramName.setText(programName);
                program = ProgramData.program17;
                tvProgram.setText(program);
                break;
            case 17:
                tvProgramName.setText(programName);
                program = ProgramData.program18;
                tvProgram.setText(program);
                break;
            case 18:
                tvProgramName.setText(programName);
                program = ProgramData.program19;
                tvProgram.setText(program);
                break;
            case 19:
                tvProgramName.setText(programName);
                program = ProgramData.program20;
                tvProgram.setText(program);
                break;
            case 20:
                tvProgramName.setText(programName);
                program = ProgramData.program21;
                tvProgram.setText(program);
                break;
            case 21:
                tvProgramName.setText(programName);
                program = ProgramData.program22;
                tvProgram.setText(program);
                break;
            case 22:
                tvProgramName.setText(programName);
                program = ProgramData.program23;
                tvProgram.setText(program);
                break;
            case 23:
                tvProgramName.setText(programName);
                program = ProgramData.program24;
                tvProgram.setText(program);
                break;
            case 24:
                tvProgramName.setText(programName);
                program = ProgramData.program25;
                tvProgram.setText(program);
                break;
            case 25:
                tvProgramName.setText(programName);
                program = ProgramData.program26;
                tvProgram.setText(program);
                break;
            case 26:
                tvProgramName.setText(programName);
                program = ProgramData.program27;
                tvProgram.setText(program);
                break;
            case 27:
                tvProgramName.setText(programName);
                program = ProgramData.program28;
                tvProgram.setText(program);
                break;
            case 28:
                tvProgramName.setText(programName);
                program = ProgramData.program29;
                tvProgram.setText(program);
                break;
            case 29:
                tvProgramName.setText(programName);
                program = ProgramData.program30;
                tvProgram.setText(program);
                break;
            case 30:
                tvProgramName.setText(programName);
                program = ProgramData.program31;
                tvProgram.setText(program);
                break;
            case 31:
                tvProgramName.setText(programName);
                program = ProgramData.program32;
                tvProgram.setText(program);
                break;
            case 32:
                tvProgramName.setText(programName);
                program = ProgramData.program33;
                tvProgram.setText(program);
                break;
            case 33:
                tvProgramName.setText(programName);
                program = ProgramData.program34;
                tvProgram.setText(program);
                break;
            case 34:
                tvProgramName.setText(programName);
                program = ProgramData.program35;
                tvProgram.setText(program);
                break;
            case 35:
                tvProgramName.setText(programName);
                program = ProgramData.program36;
                tvProgram.setText(program);
                break;
            case 36:
                tvProgramName.setText(programName);
                program = ProgramData.program37;
                tvProgram.setText(program);
                break;
            case 37:
                tvProgramName.setText(programName);
                program = ProgramData.program38;
                tvProgram.setText(program);
                break;
            case 38:
                tvProgramName.setText(programName);
                program = ProgramData.program39;
                tvProgram.setText(program);
                break;
            case 39:
                tvProgramName.setText(programName);
                program = ProgramData.program40;
                tvProgram.setText(program);
                break;
            case 40:
                tvProgramName.setText(programName);
                program = ProgramData.program41;
                tvProgram.setText(program);
                break;
            case 41:
                tvProgramName.setText(programName);
                program = ProgramData.program42;
                tvProgram.setText(program);
                break;
            case 42:
                tvProgramName.setText(programName);
                program = ProgramData.program43;
                tvProgram.setText(program);
                break;
            case 43:
                tvProgramName.setText(programName);
                program = ProgramData.program44;
                tvProgram.setText(program);
                break;
            case 44:
                tvProgramName.setText(programName);
                program = ProgramData.program45;
                tvProgram.setText(program);
                break;
            case 45:
                tvProgramName.setText(programName);
                program = ProgramData.program46;
                tvProgram.setText(program);
                break;
            case 46:
                tvProgramName.setText(programName);
                program = ProgramData.program47;
                tvProgram.setText(program);
                break;
            default:
                tvProgramName.setText(" ");
                tvProgram.setText("No Program found");
                break;
        }

        String array[] = this.getResources().getStringArray(R.array.instructions_array);

        SpannableString ss = new SpannableString(program);

        for (int a = array.length - 1; a >= 0; a--)
        {
            int temp = a;
            //ss.setSpan(new URLSpan(temp))
            if (search(array[a]+ " ", program) >= 0){
                ss.setSpan(new CustomSpan(temp), search(array[a], program), search(array[a], program) + array[a].length(), 0);
            }
            tvProgram.setText(ss);
            tvProgram.setMovementMethod(LinkMovementMethod.getInstance());
        }

        // newly added code to highlight the comments
        int semiCounter = 0;
        int slashCounter = 0;
        int temp;

        for(int z=0; z<program.length(); z++)
        {
            if(program.charAt(z) == ';')
            {
                semiCounter = semiCounter + 1;
                Log.e("Semicolon", String.valueOf(semiCounter));
                temp = program.indexOf("\n", z);
                slashCounter = slashCounter + 1;
                Log.e("Slash", String.valueOf(temp));
                //0x1B5E20
                ss.setSpan(new ForegroundColorSpan(Color.rgb(27, 94, 32)), z, temp, Spanned.SPAN_INTERMEDIATE);
            }
        }

        tvProgram.setText(ss);
        tvProgram.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public int search(String pat, String txt)
    {
        return txt.indexOf(pat, 0);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    public class CustomSpan extends ClickableSpan
    {
        int i;
        public CustomSpan(int i) {
            super();
            this.i = i;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
        }

        @Override
        public void onClick(View widget)
        {
            int id = widget.getId();
            Intent intent = new Intent(Programs.this, InstructionDescriptionActivity.class);
            Log.e("You Clicked", String.valueOf(i));
            putIntent(intent, i);
            //Adbuddiz.showAd(Programs.this);
            startActivity(intent);

            Log.e("ID of the spannable", String.valueOf(id));
        }

        public void putIntent(Intent intent, int value)
        {
            switch(value)
            {
                case 0:
                    intent.putExtra("details", getResources().getString(R.string.aaa));
                    break;
                case 1:
                    intent.putExtra("details", getResources().getString(R.string.aad));
                    break;
                case 2:
                    intent.putExtra("details", getResources().getString(R.string.aam));
                    break;
                case 3:
                    intent.putExtra("details", getResources().getString(R.string.aas));
                    break;
                case 4:
                    intent.putExtra("details", getResources().getString(R.string.adc));
                    break;
                case 5:
                    intent.putExtra("details", getResources().getString(R.string.adc));
                    break;
                case 6:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 7:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 8:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 9:
                    intent.putExtra("details", getResources().getString(R.string.and));
                    break;
                case 10:
                    intent.putExtra("details", getResources().getString(R.string.call));
                    break;
                case 11:
                    intent.putExtra("details", getResources().getString(R.string.cbw));
                    break;
                case 12:
                    intent.putExtra("details", getResources().getString(R.string.cbw));
                    break;
                case 13:
                    intent.putExtra("details", getResources().getString(R.string.clc));
                    break;
                case 14:
                    intent.putExtra("details", getResources().getString(R.string.clc));
                    break;
                case 15:
                    intent.putExtra("details", getResources().getString(R.string.cld));
                    break;
                case 16:
                    intent.putExtra("details", getResources().getString(R.string.cld));
                    break;
                case 17:
                    intent.putExtra("details", getResources().getString(R.string.cli));
                    break;
                case 18:
                    intent.putExtra("details", getResources().getString(R.string.cli));
                    break;
                case 19:
                    intent.putExtra("details", getResources().getString(R.string.cmc));
                    break;
                case 20:
                    intent.putExtra("details", getResources().getString(R.string.cmp));
                    break;
                case 21:
                    intent.putExtra("details", getResources().getString(R.string.cmps));
                    break;
                case 22:
                    intent.putExtra("details", getResources().getString(R.string.cmps));
                    break;
                case 23:
                    intent.putExtra("details", getResources().getString(R.string.cmps));
                    break;
                case 24:
                    intent.putExtra("details", getResources().getString(R.string.daa));
                    break;
                case 25:
                    intent.putExtra("details", getResources().getString(R.string.das));
                    break;
                case 26:
                    intent.putExtra("details", getResources().getString(R.string.div));
                    break;
                case 27:
                    intent.putExtra("details", getResources().getString(R.string.div));
                    break;
                case 28:
                    intent.putExtra("details", getResources().getString(R.string.esc));
                    break;
                case 29:
                    intent.putExtra("details", getResources().getString(R.string.hlt));
                    break;
                case 30:
                    intent.putExtra("details", getResources().getString(R.string.in));
                    break;
                case 31:
                    intent.putExtra("details", getResources().getString(R.string.in));
                    break;
                case 32:
                    intent.putExtra("details", getResources().getString(R.string.inc));
                    break;
                case 33:
                    intent.putExtra("details", getResources().getString(R.string.inc));
                    break;
                case 34:
                    intent.putExtra("details", getResources().getString(R.string.interrupt));
                    break;
                case 35:
                    intent.putExtra("details", getResources().getString(R.string.interrupt));
                    break;
                case 36:
                    intent.putExtra("details", getResources().getString(R.string.iret));
                    break;
                case 37:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 38:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 39:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 40:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 41:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 42:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 43:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 44:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 45:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 46:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 47:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 48:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 49:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 50:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 51:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 52:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 53:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 54:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 55:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 56:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 57:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 58:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 59:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 60:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 61:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 62:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 63:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 64:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 65:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 66:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 67:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 68:
                    intent.putExtra("details", getResources().getString(R.string.jumps));
                    break;
                case 69:
                    intent.putExtra("details", getResources().getString(R.string.lahf));
                    break;
                case 70:
                    intent.putExtra("details", getResources().getString(R.string.lahf));
                    break;
                case 71:
                    intent.putExtra("details", getResources().getString(R.string.lds));
                    break;
                case 72:
                    intent.putExtra("details", getResources().getString(R.string.lds));
                    break;
                case 73:
                    intent.putExtra("details", getResources().getString(R.string.lea));
                    break;
                case 74:
                    intent.putExtra("details", getResources().getString(R.string.lock));
                    break;
                case 75:
                    intent.putExtra("details", getResources().getString(R.string.lods));
                    break;
                case 76:
                    intent.putExtra("details", getResources().getString(R.string.lods));
                    break;
                case 77:
                    intent.putExtra("details", getResources().getString(R.string.lods));
                    break;
                case 78:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 79:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 80:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 81:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 82:
                    intent.putExtra("details", getResources().getString(R.string.loops));
                    break;
                case 83:
                    intent.putExtra("details", getResources().getString(R.string.mov));
                    break;
                case 84:
                    intent.putExtra("details", getResources().getString(R.string.movs));
                    break;
                case 85:
                    intent.putExtra("details", getResources().getString(R.string.movs));
                    break;
                case 86:
                    intent.putExtra("details", getResources().getString(R.string.movs));
                    break;
                case 87:
                    intent.putExtra("details", getResources().getString(R.string.mul));
                    break;
                case 88:
                    intent.putExtra("details", getResources().getString(R.string.mul));
                    break;
                case 89:
                    intent.putExtra("details", getResources().getString(R.string.neg));
                    break;
                case 90:
                    intent.putExtra("details", getResources().getString(R.string.nop));
                    break;
                case 91:
                    intent.putExtra("details", getResources().getString(R.string.pop));
                    break;
                case 92:
                    intent.putExtra("details", getResources().getString(R.string.pop));
                    break;
                case 93:
                    intent.putExtra("details", getResources().getString(R.string.push));
                    break;
                case 94:
                    intent.putExtra("details", getResources().getString(R.string.push));
                    break;
                case 95:
                    intent.putExtra("details", getResources().getString(R.string.rcl));
                    break;
                case 96:
                    intent.putExtra("details", getResources().getString(R.string.rcl));
                    break;
                case 97:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 98:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 99:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 100:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 101:
                    intent.putExtra("details", getResources().getString(R.string.reps));
                    break;
                case 102:
                    intent.putExtra("details", getResources().getString(R.string.ret));
                    break;
                case 103:
                    intent.putExtra("details", getResources().getString(R.string.ret));
                    break;
                case 104:
                    intent.putExtra("details", getResources().getString(R.string.rol));
                    break;
                case 105:
                    intent.putExtra("details", getResources().getString(R.string.rol));
                    break;
                case 106:
                    intent.putExtra("details", getResources().getString(R.string.sal));
                    break;
                case 107:
                    intent.putExtra("details", getResources().getString(R.string.sal));
                    break;
                case 108:
                    intent.putExtra("details", getResources().getString(R.string.sar));
                    break;
                case 109:
                    intent.putExtra("details", getResources().getString(R.string.sar));
                    break;
                case 110:
                    intent.putExtra("details", getResources().getString(R.string.scas));
                    break;
                case 111:
                    intent.putExtra("details", getResources().getString(R.string.scas));
                    break;
                case 112:
                    intent.putExtra("details", getResources().getString(R.string.scas));
                    break;
                case 113:
                    intent.putExtra("details", getResources().getString(R.string.stos));
                    break;
                case 114:
                    intent.putExtra("details", getResources().getString(R.string.stos));
                    break;
                case 115:
                    intent.putExtra("details", getResources().getString(R.string.stos));
                    break;
                case 116:
                    intent.putExtra("details", getResources().getString(R.string.sub));
                    break;
                case 117:
                    intent.putExtra("details", getResources().getString(R.string.sub));
                    break;
                case 118:
                    intent.putExtra("details", getResources().getString(R.string.test));
                    break;
                case 119:
                    intent.putExtra("details", getResources().getString(R.string.test));
                    break;
                case 120:
                    intent.putExtra("details", getResources().getString(R.string.xchg));
                    break;
                case 121:
                    intent.putExtra("details", getResources().getString(R.string.xlat));
                    break;
                case 122:
                    intent.putExtra("details", getResources().getString(R.string.xlat));
                    break;

                default:
                    break;
            }
        }
    }
}
