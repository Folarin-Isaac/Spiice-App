package com.example.spiiceapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class PropositionMessageBoardFragment extends Fragment {
    ImageView image2;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_proposition_message_board, container, false);
        image2=view.findViewById(R.id.search_profile_image2);
        Glide.with(view).load(R.drawable.serach_image_avatar).circleCrop().into(image2);
    return view;}
}