package com.example.spiiceapp.models;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.spiiceapp.R;


public class WireFrameFragment extends Fragment {
    ImageView image;
    Button sendYourWork;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_wire_frame, container, false);
       image=view.findViewById(R.id.image);
        Glide.with(view).load(R.drawable.image).circleCrop().into(image);
        sendYourWork=view.findViewById(R.id.send_your_work);
        sendYourWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_container,new SendYourWorkFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


    return view;}
}