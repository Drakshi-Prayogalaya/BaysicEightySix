package com.grape.basic8086.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.grape.basic8086.PinDescriptionActivity;
import com.grape.basic8086.R;

public class PinAdapter extends RecyclerView.Adapter<PinAdapter.ViewHolder>
{
    private List<String> pins;

    public PinAdapter(List<String> pins)
    {
        this.pins = pins;
    }

    public PinAdapter(String[] pinStringArray)
    {
        this.pins = Arrays.asList(pinStringArray);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item_pin, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final String pin = pins.get(position);
        holder.button.setText(pin);
        holder.button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, PinDescriptionActivity.class);
                intent.putExtra("pin_name", pins.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pins.size();
    }

    public void filterList(List<String> filteredEntries)
    {
        this.pins = filteredEntries;
        notifyDataSetChanged();
    }


    class ViewHolder extends RecyclerView.ViewHolder
    {
        Button button;
        ViewHolder(View itemView)
        {
            super(itemView);
            button = itemView.findViewById(R.id.button_pin);
        }
    }
}
