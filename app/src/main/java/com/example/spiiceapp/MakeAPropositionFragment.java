package com.example.spiiceapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.spiiceapp.models.SendYourWorkFragment;


public class MakeAPropositionFragment extends Fragment {

    ImageView image1;
    Button makeAProposition;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_make_a_proposition, container, false);
        image1=view.findViewById(R.id.search_profile_image1);
        Glide.with(view).load(R.drawable.serach_image_avatar).circleCrop().into(image1);

        makeAProposition=view.findViewById(R.id.make_a_proposition);
        makeAProposition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_container,new PropositionMessageBoardFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });



    return view;}
}