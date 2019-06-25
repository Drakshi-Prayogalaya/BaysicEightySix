package com.grape.basic8086;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.grape.basic8086.Adapters.InstructionsListAdapter;
import com.grape.basic8086.Adapters.PinAdapter;

import java.util.ArrayList;

public class InstructionsListActivity extends AppCompatActivity
{
    InstructionsListAdapter instructionsListAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        EditText etSearchInstructions = findViewById(R.id.et_search_instructions);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_instructions);

        instructionsListAdapter = new InstructionsListAdapter(this.getResources().getStringArray(R.array.instruction_names));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(instructionsListAdapter);

        etSearchInstructions.addTextChangedListener(new TextWatcher() {
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
        for(String s : this.getResources().getStringArray(R.array.instruction_names))
        {
            if(s.trim().toLowerCase().contains(enteredString.trim().toLowerCase()))
            {
                filteredEntries.add(s);
            }
        }

        instructionsListAdapter.filterList(filteredEntries);
    }
}
