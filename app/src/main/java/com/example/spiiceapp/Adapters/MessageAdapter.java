package com.example.spiiceapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spiiceapp.R;
import com.example.spiiceapp.models.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    String firstData[], secondData[];
    int images[];
    Context context;

    public MessageAdapter(Context ct, String name[], String message[], int profileImage[]){
        context = ct;
        firstData = name;
        secondData = message;
        images = profileImage;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.messages_item, parent, false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


    }

    //return the number of images available
    @Override
    public int getItemCount() {
        return images.length;
    }

    private class MyViewholder extends RecyclerView.ViewHolder {
        TextView chatName, chatIntro;
        ImageView profileIcon;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            chatName = itemView.findViewById(R.id.chatName);
            chatIntro = itemView.findViewById(R.id.chatIntro);
            profileIcon = itemView.findViewById(R.id.profileIcon);
        }
    }
}