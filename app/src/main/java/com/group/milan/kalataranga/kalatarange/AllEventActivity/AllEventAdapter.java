package com.group.milan.kalataranga.kalatarange.AllEventActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.group.milan.kalataranga.kalatarange.EventDetailsActivity.EventDetailsActivity;
import com.group.milan.kalataranga.kalatarange.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllEventAdapter extends RecyclerView.Adapter<AllEventAdapter.MyViewHolder> {
    ArrayList<EventPojo> list;
    Context ctx;

    public AllEventAdapter(ArrayList<EventPojo> list,Context context){
        this.list=list;
        this.ctx=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.adapter_all_event,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.name.setText(list.get(i).getTitle());
        myViewHolder.summary.setText(list.get(i).getDescription());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=list.get(i).getTitle();
                String description=list.get(i).getDescription();
                String contactName=list.get(i).getContactName();
                String contactNumber=list.get(i).getContactNumber();
                String amount=list.get(i).getAmount();

                Intent intent=new Intent(ctx, EventDetailsActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("description",description);
                intent.putExtra("contactName",contactName);
                intent.putExtra("contactNumber",contactNumber);
                intent.putExtra("amount",amount);
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.adapter_event_summary)
        TextView summary;

        @BindView(R.id.adapter_event_name)
        TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
