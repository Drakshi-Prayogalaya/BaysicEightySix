package com.grape.basic8086.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.grape.basic8086.Programs;
import com.grape.basic8086.R;

import java.util.Arrays;
import java.util.List;

public class ProgramsListAdapter extends RecyclerView.Adapter<ProgramsListAdapter.ViewHolder>
{
    private List<String> programNames;

    public ProgramsListAdapter(List<String> programNames)
    {
        this.programNames = programNames;
    }

    public ProgramsListAdapter(String[] programsListStringArray)
    {
        this.programNames = Arrays.asList(programsListStringArray);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item_program_name, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final String programName = programNames.get(position);
        holder.button.setText(programName);
        holder.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, Programs.class);
                intent.putExtra("program_name", programNames.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return programNames.size();
    }

    public void filterList(List<String> filteredEntries)
    {
        this.programNames = filteredEntries;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        Button button;
        ViewHolder(View itemView)
        {
            super(itemView);
            button = itemView.findViewById(R.id.button_program_name);
        }
    }
}
