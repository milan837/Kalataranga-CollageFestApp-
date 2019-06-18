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

public class EightFragment extends Fragment {

    @BindView(R.id.first_recyclerview)
    RecyclerView recyclerView;

    ArrayList<String> eventTimeDuration;
    ArrayList<String> eventTitle;
    ArrayList<String> eventVenue;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_eight,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //15 TH MARCH GAMES

        ButterKnife.bind(this,view);
        eventTimeDuration=new ArrayList<>();
        eventTitle=new ArrayList<>();
        eventVenue=new ArrayList<>();

        //setting time duration
        eventTimeDuration.add("15-3-19 \n2:00 - 2:30pm");
        eventTimeDuration.add("15-3-19 \n3:00 - 3:30pm");
        eventTimeDuration.add("15-3-19 \n3:00 - 4:00pm");

        //setting event title
        eventTitle.add("Photography");
        eventTitle.add("TikTok");
        eventTitle.add("Short Movies");

        //setting event venur
        eventVenue.add("RRP");
        eventVenue.add("RRAHS");
        eventVenue.add("RRIT");

        ///--------- 20th
        //setting time duration
        eventTimeDuration.add("20-3-19 \n2:00 - 4:00pm");
        eventTimeDuration.add("20-3-19 \n11:00 - 1:00pm");
        eventTimeDuration.add("20-3-19 \n11:00 - 1:00pm");

        //setting event title
        eventTitle.add("Painting");
        eventTitle.add("Mehendi");
        eventTitle.add("Fireless Cooking");

        //setting event venur
        eventVenue.add("MCON");
        eventVenue.add("RRCOP");
        eventVenue.add("RRSA");

        ///--------- 21th
        //setting time duration
        eventTimeDuration.add("21-3-19 \n11:00 - 1:00pm");
        eventTimeDuration.add("21-3-19 \n2:00 - 4:00pm");

        //setting event title
        eventTitle.add("Collage");
        eventTitle.add("Pot Pouring");

        //setting event venur
        eventVenue.add("RRIMS");
        eventVenue.add("RRIMS");

        ///--------- 22th
        //setting time duration
        eventTimeDuration.add("22-3-19 \n11:00 - 12:00pm");
        eventTimeDuration.add("22-3-19 \n12:00 - 4:00pm");
        eventTimeDuration.add("22-3-19 \n11:00 - 1:00pm");


        //setting event title
        eventTitle.add("Tattoo Design");
        eventTitle.add("Treasure Hunt");
        eventTitle.add("Pot Painting");

        //setting event venur
        eventVenue.add("RRIMS");
        eventVenue.add("RRIT");
        eventVenue.add("RRP");

        ///--------- 26th
        //setting time duration
        eventTimeDuration.add("26-3-19 \n12:00 - 3:00pm");
        eventTimeDuration.add("26-3-19 \n2:00 - 3:00pm");

        //setting event title
        eventTitle.add("Gamming");
        eventTitle.add("Hair Style");

        //setting event venur
        eventVenue.add("RRIT");
        eventVenue.add("RRICON");

        ///--------- 27th
        //setting time duration
        eventTimeDuration.add("27-3-19 \n11:00 - 1:00pm");
        eventTimeDuration.add("27-3-19 \n2:00 - 4:00pm");

        //setting event title
        eventTitle.add("Pencil Sketching");
        eventTitle.add("Wolf of wall street");

        //setting event venur
        eventVenue.add("RRCON");
        eventVenue.add("RRIMS");

        ///--------- 28th
        //setting time duration
        eventTimeDuration.add("28-3-19 \n10:00 - 12:00pm");
        eventTimeDuration.add("28-3-19 \n12:00 - 2:00pm");

        //setting event title
        eventTitle.add("Vegitable and friut carving");
        eventTitle.add("Flower arrangement");

        //setting event venur
        eventVenue.add("RRCON");
        eventVenue.add("MCON");


        FirstFragmentRecyclerViewAdapter adapter=new FirstFragmentRecyclerViewAdapter(eventTimeDuration,eventTitle,eventVenue);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
