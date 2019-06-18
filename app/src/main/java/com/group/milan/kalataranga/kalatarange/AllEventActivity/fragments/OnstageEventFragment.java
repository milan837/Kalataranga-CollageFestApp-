package com.group.milan.kalataranga.kalatarange.AllEventActivity.fragments;

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

import com.group.milan.kalataranga.kalatarange.AllEventActivity.AllEventAdapter;
import com.group.milan.kalataranga.kalatarange.AllEventActivity.EventPojo;
import com.group.milan.kalataranga.kalatarange.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OnstageEventFragment extends Fragment {
    ArrayList<EventPojo> list=new ArrayList<>();

    @BindView(R.id.all_event_recyclerview)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onstage_event,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
        setData();
        initViews();
    }

    public void initViews(){
        AllEventAdapter adapter=new AllEventAdapter(list,getActivity());
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void setData(){

        //chess
        EventPojo eventList=new EventPojo();
        eventList.setTitle("Duet Singing (Team)");
        eventList.setContactName("Vani H M");
        eventList.setContactNumber("9535345183");
        eventList.setAmount("100");
        eventList.setDescription("A duet is a musical composition for two performers in which the performers have equal importance to the piece, often a composition involving two singers or two pianists.\n");
        list.add(eventList);

        //photography
        EventPojo eventList1=new EventPojo();
        eventList1.setTitle("Instrumental (Team)");
        eventList1.setContactName("Dr.sunitha");
        eventList1.setContactNumber("8123208653");
        eventList1.setAmount("200");
        eventList1.setDescription("An instrumental is a musical composition or recording without lyrics, or singing, although it might include some inarticulate vocals, such as shouted backup vocals in a Big Band setting. Through semantic widening, a broader sense of the word song may refer to instrumentals.");
        list.add(eventList1);

        //badmintion
        EventPojo eventList2=new EventPojo();
        eventList2.setTitle("Fashion Show (Team)");
        eventList2.setContactName("Shruthi");
        eventList2.setContactNumber("9731553398");
        eventList2.setAmount("2000");
        eventList2.setDescription("A fashion show (French défilé de mode) is an event put on by a fashion designer to showcase their upcoming line of clothing and/or accessories during Fashion Week. ... In a typical fashion show, models walk the catwalk dressed in the clothing created by the designer.");
        list.add(eventList2);

        //
        EventPojo eventList3=new EventPojo();
        eventList3.setTitle("Group Dance (Team)");
        eventList3.setContactName("Joya KP");
        eventList3.setContactNumber("7411929577");
        eventList3.setAmount("1000");
        eventList3.setDescription("Group dances are danced by groups of people simultaneously, as opposed to individuals dancing alone or individually, and as opposed to couples dancing together but independently of others dancing at the same time, if any.");
        list.add(eventList3);

        //
        EventPojo eventList4=new EventPojo();
        eventList4.setTitle("Group Singing (Team)");
        eventList4.setContactName("Gnana ruba priya");
        eventList4.setContactNumber("7899484642");
        eventList4.setAmount("200");
        eventList4.setDescription("Sing-along, also called community singing or group singing, is an event of singing together at gatherings or parties, less formally than choir singing. One can use a songbook. Common genres are folk songs, patriotic songs, hymns and drinking songs. Children across the world usually sing nursery rhymes togethe");
        list.add(eventList4);

        //
        EventPojo eventList5=new EventPojo();
        eventList5.setTitle("Mime (Team)");
        eventList5.setContactName("Mr.Harikrisha.A");
        eventList5.setContactNumber("8088509569");
        eventList5.setAmount("1000");
        eventList5.setDescription("A mime or mime artist is a person who uses mime as a theatrical medium or as a performance art. Miming involves acting out a story through body motions, without the use of speech. In earlier times, in English, such a performer would typically be referred to as a mummer.");
        list.add(eventList5);

        //
        EventPojo eventList6=new EventPojo();
        eventList6.setTitle("Rap Singing");
        eventList6.setContactName("Dr.Sunitha");
        eventList6.setContactNumber("8123208653");
        eventList6.setAmount("100");
        eventList6.setDescription("Rapping (or rhyming, spitting, emceeing, MCing) is a musical form of vocal delivery that incorporates \"rhyme, rhythmic speech, and street vernacular\", which is performed or chanted in a variety of ways, usually over a backing beat or musical accompaniment.\n");
        list.add(eventList6);

        //
        EventPojo eventList7=new EventPojo();
        eventList7.setTitle("Skit (Team)");
        eventList7.setContactName("Ms.sanala");
        eventList7.setContactNumber("7204608170");
        eventList7.setAmount("1000");
        eventList7.setDescription("A short comedy sketch or piece of humorous writing, especially a parody.");
        list.add(eventList7);

        //
        EventPojo eventList8=new EventPojo();
        eventList8.setTitle("Solo Dance");
        eventList8.setContactName("Divya");
        eventList8.setContactNumber("9731018425");
        eventList8.setAmount("100");
        eventList8.setDescription("About 7,07,00,000 results (0.51 seconds) \n" +
                "Search Results\n" +
                "Featured snippet from the web\n" +
                "A solo dance is danced by an individual dancing alone, as opposed to couples dancing together but independently of others dancing at the same time, if any, and as opposed to groups of people dancing simultaneously in a coordinated manner. Solo dancers are usually the best dancers in a group or dance school.");
        list.add(eventList8);

        //
        EventPojo eventList9=new EventPojo();
        eventList9.setTitle("Solo Singing");
        eventList9.setContactName("Gnana ruba priya");
        eventList9.setContactNumber("7899484642");
        eventList9.setAmount("50");
        eventList9.setDescription("A solo singing is to sing for expressing your thoughts in front of audience not to impress them. ... The word is also used for the act of performing a solo (\"to solo\"), and sometimes for the performer (more often a soloist). The plural is soli or the anglicised form solos.");
        list.add(eventList9);

    }

}
