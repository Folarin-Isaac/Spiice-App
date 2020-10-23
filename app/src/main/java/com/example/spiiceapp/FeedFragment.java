package com.example.spiiceapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.spiiceapp.models.WireFrameFragment;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.Objects;

public class FeedFragment extends Fragment {
    BarChart barChart;
    Button viewAll;
    CardView wireframe;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_feed, container, false);
        barChart=view.findViewById(R.id.chart);
        String[] percent={"1%","2%","3%","4%","5%","6%","7%","8%","9%","10%","11%","12%","13%","14%","15%","16%","17%","18%","19%","20%","21%","22%","23%","24%","25%","26%","27%","28%","29%","30%","31%","32%","33%","34%","35%","36%","37%","38%","39%","40%","41%","42%","43%","44%","45%","46%","47%","48%","49%","50%","51%","52%","53%","54%","55%","56%","57%","58%","59%","60%","61%","62%","63%","64%","65%","66%","67%","68%","69%","70%","71%","72%","73%","74%","75%","76%","77%","78%","79%","80%","81%","82%","83%","84%","85%","86%","87%","88%","89%","90%","91%","92%","93%","94%","95%","96%","97%","98%","99%"};
        final Spinner percentSpinner=view.findViewById(R.id.percentSpinner);


        ArrayAdapter adapter=new ArrayAdapter(Objects.requireNonNull(getActivity()),
                android.R.layout.simple_spinner_item,
                percent);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        percentSpinner.setAdapter(adapter);

        /*percentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                TextView percentText=view.findViewById(R.id.percentTextView);
                percentText.setText("20%");

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

        ArrayList<BarEntry> entries=new ArrayList<>();
        entries.add(new BarEntry(2f, (float) 4.6));
        entries.add(new BarEntry(3f, (float) 4.8));
        entries.add(new BarEntry(4f,5));
        entries.add(new BarEntry(5f, (float) 4.8));

        BarDataSet barDataSet=new BarDataSet(entries,"");
        BarData bardata=new BarData(barDataSet);
        bardata.setBarWidth(0.7f);
        barChart.setData(bardata);

        barChart.setDescription(null);
        barChart.getXAxis().setEnabled(false);
        barChart.getAxisLeft().setEnabled(false);
        barChart.getAxisLeft().setDrawAxisLine(false);
        barChart.getAxisRight().setDrawAxisLine(false);
        barChart.getAxisRight().setEnabled(false);
        barDataSet.setColors(new int[]{Color.rgb(251,234,255),Color.rgb(251,234,255),Color.rgb(251,234,255),Color.rgb(147,120,255)});


        viewAll=view.findViewById(R.id.viewAll);
        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_container,new DetailFeedFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        wireframe=view.findViewById(R.id.wireframeCardview);
        wireframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assert getFragmentManager() != null;
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_container,new WireFrameFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });



        return view;
    }

}

