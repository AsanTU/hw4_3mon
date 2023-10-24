package com.example.hw4_3mon.CONTINENT;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw4_3mon.OnClick;
import com.example.hw4_3mon.R;
import com.example.hw4_3mon.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class CotinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    private ArrayList<ContinentModel> continentsList = new ArrayList<>();
    private com.example.hw4_3mon.OnClick onClick;


    public CotinentAdapter(ArrayList<ContinentModel> continentsList, OnClick onClick) {
        this.continentsList = continentsList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(continentsList.get(position));
        holder.itemView.setOnClickListener(view ->
                onClick.onClick(position));
    }

    @Override
    public int getItemCount() {
        return continentsList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    private ImageView imageContinent;

    private ItemContinentBinding binding;


    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
        imageContinent = itemView.findViewById(R.id.img_continent);
        this.binding = binding;
    }

    public void onBind(ContinentModel model){
        tvName.setText(model.getName());
        Glide.with(imageContinent).load(model.getImage()).into(imageContinent);
    }
}
