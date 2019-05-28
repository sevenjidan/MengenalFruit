package com.z3tecx.mengenalfruit;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterBuah extends RecyclerView.Adapter<AdapterBuah.ViewHolder> {
    Context context;
    int[] gambarBuah;
    String[] namaBuah, detailBuah;

    //
    public AdapterBuah(Context context, int[] gambarBuah, String[] namaBuah, String[] detailBuah) {
        this.context = context;
        this.gambarBuah = gambarBuah;
        this.namaBuah = namaBuah;
        this.detailBuah = detailBuah;
    }

    //
    @NonNull
    @Override
    public AdapterBuah.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.txt.setText(namaBuah[i]);
        Glide.with(context)
                .load(gambarBuah[i])
                .into(viewHolder.img);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent move = new Intent(context, DetailBuah.class);
                move.putExtra("gambarb", gambarBuah[i]);
                move.putExtra("detailb", detailBuah[i]);
                context.startActivity(move);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarBuah.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgBuah);
            txt = itemView.findViewById(R.id.txtBuah);
        }

        }
    }
