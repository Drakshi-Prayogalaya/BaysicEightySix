package com.grape.basic8086.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.grape.basic8086.Adapters.ProgramsListAdapter;
import com.grape.basic8086.R;

import java.util.ArrayList;

public class ProgramsListFragment extends Fragment
{
    ProgramsListAdapter programsListAdapter;
    public ProgramsListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_programs_list, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view_program_names);
        EditText etSearchPrograms = rootView.findViewById(R.id.et_search_program_names);

        programsListAdapter = new ProgramsListAdapter(this.getResources().getStringArray(R.array.program_names));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
        recyclerView.setAdapter(programsListAdapter);

        etSearchPrograms.addTextChangedListener(new TextWatcher() {
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

        // Inflate the layout for this fragment
        return rootView;
    }

    private void filter(String enteredString) {
        ArrayList<String> filteredEntries = new ArrayList<>();
        for(String s : this.getResources().getStringArray(R.array.program_names))
        {
            if(s.trim().toLowerCase().contains(enteredString.trim().toLowerCase()))
            {
                filteredEntries.add(s);
            }
        }

        programsListAdapter.filterList(filteredEntries);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
