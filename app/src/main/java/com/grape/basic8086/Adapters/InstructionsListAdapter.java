package com.grape.basic8086.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.grape.basic8086.InstructionDescriptionActivity;
import com.grape.basic8086.R;

import java.util.Arrays;
import java.util.List;

public class InstructionsListAdapter extends RecyclerView.Adapter<InstructionsListAdapter.ViewHolder>
{
    private List<String> instructions;

    public InstructionsListAdapter(List<String> instructions)
    {
        this.instructions = instructions;
    }

    public InstructionsListAdapter(String[] instructionStringArray)
    {
        this.instructions = Arrays.asList(instructionStringArray);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item_instruction, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final String pin = instructions.get(position);
        holder.button.setText(pin);
        holder.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, InstructionDescriptionActivity.class);
                intent.putExtra("instruction_name", instructions.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return instructions.size();
    }

    public void filterList(List<String> filteredEntries)
    {
        this.instructions = filteredEntries;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        Button button;
        ViewHolder(View itemView)
        {
            super(itemView);
            button = itemView.findViewById(R.id.button_instruction);
        }
    }
}
