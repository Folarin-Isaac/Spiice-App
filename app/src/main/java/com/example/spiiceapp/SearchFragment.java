package com.example.spiiceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class SearchFragment extends Fragment {
    ImageView searchImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_search, container, false);
        searchImage=view.findViewById(R.id.search_profile_image);
        Glide.with(view).load(R.drawable.serach_image_avatar).circleCrop().into(searchImage);


    return view;}
}
