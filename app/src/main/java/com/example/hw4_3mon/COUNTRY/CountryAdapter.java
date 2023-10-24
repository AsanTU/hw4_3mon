package com.example.hw4_3mon.COUNTRY;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw4_3mon.R;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<CountryModel> countryList = new ArrayList<>();
    public CountryAdapter(ArrayList<CountryModel> countryList) {
        this.countryList = countryList;
    }
    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
