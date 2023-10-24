package com.example.hw4_3mon.COUNTRY;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4_3mon.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private ArrayList<CountryModel> countryList = new ArrayList<>();
    private FragmentCountryBinding binding;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        CountryAdapter adapter = new CountryAdapter(countryList);
        binding.countryRv.setAdapter(adapter);
    }

    private void checkPosition(int position) {
        if (position == 0) {
            loadEurope();
        } else if (position == 1) {
            loadAfrica();
        } else if (position == 2) {
            loadNorthAmerica();
        } else if (position == 3) {
            loadSouthAmerica();
        } else if (position == 4) {
            loadEvrazia();
        }
    }

    private void loadEurope() {
        countryList.add(new CountryModel("Италия", "https://upload.wikimedia.org/wikipedia/commons/0/03/Flag_of_Italy.svg"));
        countryList.add(new CountryModel("Германия", "https://upload.wikimedia.org/wikipedia/commons/b/ba/Flag_of_Germany.svg"));
        countryList.add(new CountryModel("Великобритания", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/1200px-Flag_of_the_United_Kingdom_%281-2%29.svg.png"));
        countryList.add(new CountryModel("Франция", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSG24QVtqDWYqBksVSyK1yULlQWKw_HXQ853vdS-3M5dwS_n4MdgL35AF2WfI&s=10"));
        countryList.add(new CountryModel("Швейцария", "https://upload.wikimedia.org/wikipedia/commons/0/08/Flag_of_Switzerland_%28Pantone%29.svg"));
    }

    private void loadAfrica(){
        countryList.add(new CountryModel("Нигерия", "https://upload.wikimedia.org/wikipedia/commons/7/79/Flag_of_Nigeria.svg"));
        countryList.add(new CountryModel("Кения", "https://upload.wikimedia.org/wikipedia/commons/4/49/Flag_of_Kenya.svg"));
        countryList.add(new CountryModel("Нигер", "https://upload.wikimedia.org/wikipedia/commons/f/f4/Flag_of_Niger.svg"));
        countryList.add(new CountryModel("Марокко", "https://upload.wikimedia.org/wikipedia/commons/2/2c/Flag_of_Morocco.svg"));
        countryList.add(new CountryModel("Гана", "https://upload.wikimedia.org/wikipedia/commons/1/19/Flag_of_Ghana.svg"));
    }

    private void loadNorthAmerica(){
        countryList.add(new CountryModel("Соединенные Штаты Америки", "https://upload.wikimedia.org/wikipedia/commons/a/a4/Flag_of_the_United_States.svg"));
        countryList.add(new CountryModel("Канада", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Flag_of_Canada_%28Pantone%29.svg"));
        countryList.add(new CountryModel("Мексика", "https://upload.wikimedia.org/wikipedia/commons/f/fc/Flag_of_Mexico.svg"));
        countryList.add(new CountryModel("Гренландия", "https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_Greenland.svg"));
        countryList.add(new CountryModel("Куба", "https://upload.wikimedia.org/wikipedia/commons/b/bd/Flag_of_Cuba.svg"));
    }

    private void loadSouthAmerica(){
        countryList.add(new CountryModel("Бразилия", "https://upload.wikimedia.org/wikipedia/commons/0/05/Flag_of_Brazil.svg"));
        countryList.add(new CountryModel("Аргентина", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Argentina.svg"));
        countryList.add(new CountryModel("Колумбия", "https://upload.wikimedia.org/wikipedia/commons/2/21/Flag_of_Colombia.svg"));
        countryList.add(new CountryModel("Перу", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/800px-Flag_of_Peru_%28state%29.svg.png"));
        countryList.add(new CountryModel("Чили", "https://upload.wikimedia.org/wikipedia/commons/7/78/Flag_of_Chile.svg"));
    }

    private void loadEvrazia(){
        countryList.add(new CountryModel("Кыргызстан", "https://upload.wikimedia.org/wikipedia/commons/f/f3/Flag_of_Russia.svg"));
        countryList.add(new CountryModel("Россия", "https://upload.wikimedia.org/wikipedia/commons/c/c7/Flag_of_Kyrgyzstan.svg"));
        countryList.add(new CountryModel("Армения", "https://upload.wikimedia.org/wikipedia/commons/2/2f/Flag_of_Armenia.svg"));
        countryList.add(new CountryModel("Казахстан", "https://upload.wikimedia.org/wikipedia/commons/d/d3/Flag_of_Kazakhstan.svg"));
        countryList.add(new CountryModel("Беларусь", "https://upload.wikimedia.org/wikipedia/commons/8/85/Flag_of_Belarus.svg"));
    }
}