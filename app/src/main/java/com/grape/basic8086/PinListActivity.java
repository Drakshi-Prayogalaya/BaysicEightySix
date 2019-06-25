package com.grape.basic8086;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.grape.basic8086.Adapters.PinAdapter;

import java.util.ArrayList;

/**
 * Created by Kbhargav on 4/21/2016.
 */
public class PinListActivity extends AppCompatActivity
{
    PinAdapter pinAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_list);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_pins);
        EditText etSearchPins = findViewById(R.id.et_pins);

        pinAdapter = new PinAdapter(this.getResources().getStringArray(R.array.pins));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(pinAdapter);

        etSearchPins.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });
    }

    private void filter(String enteredString) {
        ArrayList<String> filteredEntries = new ArrayList<>();
        for(String s : this.getResources().getStringArray(R.array.pins))
        {
            if(s.trim().toLowerCase().contains(enteredString.trim().toLowerCase()))
            {
                filteredEntries.add(s);
            }
        }

        pinAdapter.filterList(filteredEntries);
    }
}
