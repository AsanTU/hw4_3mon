package com.example.hw4_3mon.COUNTRY;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw4_3mon.R;
import com.example.hw4_3mon.databinding.ItemCountryBinding;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    private ImageView imageCountry;

    private ItemCountryBinding binding;


    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name_country);
        imageCountry = itemView.findViewById(R.id.img_country);
        this.binding = binding;
    }

    public void onBind(CountryModel country){
        tvName.setText(country.getName());
        Glide.with(imageCountry).load(country.getImage()).into(imageCountry);
    }
}
