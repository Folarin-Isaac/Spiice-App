package com.example.spiiceapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class DetailFeedFragment extends Fragment {
    ImageButton dropdownButton;
    CardView dropremove;
    int i=0;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_detail_feed, container, false);
        dropremove=view.findViewById(R.id.dropdown_cardview);
        dropremove.setVisibility(View.GONE);
        dropdownButton =view.findViewById(R.id.dropdownbutton);
        dropdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    dropdownButton.setBackgroundResource(R.drawable.dropup_button);
                    dropremove.setVisibility(View.VISIBLE);
                    i++;}else if(i==1){
                    dropdownButton.setBackgroundResource(R.drawable.drop_down_button);
                    dropremove.setVisibility(View.GONE);
                    i=0;
                }
            }
        });





        return view;

    }
}