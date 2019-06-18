package com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.group.milan.kalataranga.kalatarange.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FifthFragment extends Fragment {
    @BindView(R.id.first_recyclerview)
    RecyclerView recyclerView;

    ArrayList<String> eventTimeDuration;
    ArrayList<String> eventTitle;
    ArrayList<String> eventVenue;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fifth,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //14 TH MARCH GAMES

        ButterKnife.bind(this,view);
        eventTimeDuration=new ArrayList<>();
        eventTitle=new ArrayList<>();
        eventVenue=new ArrayList<>();

        //setting time duration
        eventTimeDuration.add("9:30 Onwards");
        eventTimeDuration.add("9:30 Onwards");
        eventTimeDuration.add("9:30 Onwards");
        eventTimeDuration.add("9:30 Onwards");
        eventTimeDuration.add("9:30 Onwards");
        eventTimeDuration.add("9:30 Onwards");
        eventTimeDuration.add("9:30 Onwards");

        //setting event title
        eventTitle.add("100 MTR RUNNING RACE");
        eventTitle.add("200 MTR RUNNING RACE");
        eventTitle.add("4 X 100 MTR REALY RUNNING");
        eventTitle.add("800 MTR RUNNING RACE");
        eventTitle.add("SHOT PUT");
        eventTitle.add("JAVELIN THROW");
        eventTitle.add("SLOW BICYCLE RACE");

        //setting event venue
        eventVenue.add("RR Institutions Ground");
        eventVenue.add("RR Institutions Ground");
        eventVenue.add("RR Institutions Ground");
        eventVenue.add("RR Institutions Ground");
        eventVenue.add("RR Institutions Ground");
        eventVenue.add("RR Institutions Ground");
        eventVenue.add("RR Institutions Ground");

        FirstFragmentRecyclerViewAdapter adapter=new FirstFragmentRecyclerViewAdapter(eventTimeDuration,eventTitle,eventVenue);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
