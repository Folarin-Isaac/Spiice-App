package com.example.spiiceapp.models;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.spiiceapp.R;


public class SendYourWorkFragment extends Fragment {
    ImageView image1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_send_your_work, container, false);
        image1=view.findViewById(R.id.image1);
        Glide.with(view).load(R.drawable.image).circleCrop().into(image1);

    return view;}
}