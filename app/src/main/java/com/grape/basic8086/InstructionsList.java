package com.grape.basic8086;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.grape.basic8086.Adapters.InstructionAdapter;

/**
 * Created by kbhargav on 2/26/2016.
 */
public class InstructionsList extends AppCompatActivity
{
    ListView listView;
    InstructionAdapter instructionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_instructions);

        listView = (ListView) findViewById(R.id.listViewInstructions);

        instructionAdapter = new InstructionAdapter(this);
        listView.setAdapter(instructionAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        intentCaller("instruction", R.string.aaa);
                        break;

                    case 1:
                        intentCaller("instruction", R.string.aad);
                        break;

                    case 2:
                        intentCaller("instruction", R.string.aam);
                        break;

                    case 3:
                        intentCaller("instruction", R.string.aas);
                        break;

                    case 4:
                        intentCaller("instruction", R.string.adc);
                        break;

                    case 5:
                        intentCaller("instruction", R.string.and);
                        break;

                    case 6:
                        intentCaller("instruction", R.string.call);
                        break;

                    case 7:
                        intentCaller("instruction", R.string.cbw);
                        break;

                    case 8:
                        intentCaller("instruction", R.string.clc);
                        break;
                    case 9:
                        intentCaller("instruction", R.string.cld);
                        break;
                    case 10:
                        intentCaller("instruction", R.string.cli);
                        break;
                    case 11:
                        intentCaller("instruction", R.string.cmc);
                        break;
                    case 12:
                        intentCaller("instruction", R.string.cmp);
                        break;
                    case 13:
                        intentCaller("instruction", R.string.cmps);
                        break;
                    case 14:
                        intentCaller("instruction", R.string.daa);
                        break;
                    case 15:
                        intentCaller("instruction", R.string.das);
                        break;
                    case 16:
                        intentCaller("instruction", R.string.div);
                        break;
                    case 17:
                        intentCaller("instruction", R.string.esc);
                        break;
                    case 18:
                        intentCaller("instruction", R.string.hlt);
                        break;
                    case 19:
                        intentCaller("instruction", R.string.in);
                        break;
                    case 20:
                        intentCaller("instruction", R.string.inc);
                        break;
                    case 21:
                        intentCaller("instruction", R.string.interrupt);
                        break;
                    case 22:
                        intentCaller("instruction", R.string.iret);
                        break;
                    case 23:
                        intentCaller("instruction", R.string.jumps);
                        break;
                    case 24:
                        intentCaller("instruction", R.string.lahf);
                        break;
                    case 25:
                        intentCaller("instruction", R.string.lds);
                        break;
                    case 26:
                        intentCaller("instruction", R.string.lea);
                        break;
                    case 27:
                        intentCaller("instruction", R.string.lock);
                        break;
                    case 28:
                        intentCaller("instruction", R.string.lods);
                        break;
                    case 29:
                        intentCaller("instruction", R.string.loops);
                        break;
                    case 30:
                        intentCaller("instruction", R.string.mov);
                        break;
                    case 31:
                        intentCaller("instruction", R.string.movs);
                        break;
                    case 32:
                        intentCaller("instruction", R.string.mul);
                        break;
                    case 33:
                        intentCaller("instruction", R.string.neg);
                        break;
                    case 34:
                        intentCaller("instruction", R.string.nop);
                        break;
                    case 35:
                        intentCaller("instruction", R.string.pop);
                        break;
                    case 36:
                        intentCaller("instruction", R.string.push);
                        break;
                    case 37:
                        intentCaller("instruction", R.string.rcl);
                        break;
                    case 38:
                        intentCaller("instruction", R.string.reps);
                        break;
                    case 39:
                        intentCaller("instruction", R.string.ret);
                        break;
                    case 40:
                        intentCaller("instruction", R.string.rol);
                        break;
                    case 41:
                        intentCaller("instruction", R.string.sal);
                        break;
                    case 42:
                        intentCaller("instruction", R.string.sar);
                        break;
                    case 43:
                        intentCaller("instruction", R.string.scas);
                        break;
                    case 44:
                        intentCaller("instruction", R.string.stos);
                        break;
                    case 45:
                        intentCaller("instruction", R.string.sub);
                        break;
                    case 46:
                        intentCaller("instruction", R.string.test);
                        break;
                    case 47:
                        intentCaller("instruction", R.string.xchg);
                        break;
                    case 48:
                        intentCaller("instruction", R.string.xlat);
                        break;
                    
                    default:

                }
            }
        });

    }

    public void intentCaller(String code, int id)
    {
        Log.e("You clicked this id",String.valueOf(id));
        Intent intent = new Intent(InstructionsList.this, InstructionDescriptionActivity.class);
        intent.putExtra(code, getResources().getString(id));
        startActivity(intent);
    }
    
}
