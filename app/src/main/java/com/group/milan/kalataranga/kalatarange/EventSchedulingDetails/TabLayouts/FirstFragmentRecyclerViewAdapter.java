package com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.group.milan.kalataranga.kalatarange.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FirstFragmentRecyclerViewAdapter extends RecyclerView.Adapter<FirstFragmentRecyclerViewAdapter.MyViewHolder> {

    ArrayList<String> eventTimeDutarion=new ArrayList<>();
    ArrayList<String> eventTitle=new ArrayList<>();
    ArrayList<String> eventVenue=new ArrayList<>();

    public FirstFragmentRecyclerViewAdapter(ArrayList<String> time,ArrayList<String> title,ArrayList<String> venue){
        this.eventTimeDutarion=time;
        this.eventTitle=title;
        this.eventVenue=venue;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.adapter_event_scheduling,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.eventTimeDuration.setText(eventTimeDutarion.get(i));
        myViewHolder.eventName.setText(eventTitle.get(i));
        myViewHolder.eventVenue.setText(eventVenue.get(i));
    }

    @Override
    public int getItemCount() {
        return eventTimeDutarion.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.adapter_event_time_duration)
        TextView eventTimeDuration;

        @BindView(R.id.adapter_event_name)
        TextView eventName;

        @BindView(R.id.adapter_event_venue)
        TextView eventVenue;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

    }
}
