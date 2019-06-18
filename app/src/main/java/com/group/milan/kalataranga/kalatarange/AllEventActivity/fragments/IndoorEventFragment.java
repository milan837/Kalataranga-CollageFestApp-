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

public class IndoorEventFragment extends Fragment {
    ArrayList<EventPojo> list=new ArrayList<>();

    @BindView(R.id.all_event_recyclerview)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_indoor_event,container,false);
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
        eventList.setTitle("Chess");
        eventList.setContactName("Ms.Pooja KM");
        eventList.setContactNumber("8123594905");
        eventList.setAmount("50");
        eventList.setDescription("Chess is a two-player strategy board game played on a chessboard, a checkered gameboard with 64 squares arranged in an 8×8 grid. The game is played by millions of people worldwide. Chess is believed to be derived from the Indian game chaturanga some time before the 7th century. ");
        list.add(eventList);

        //photography
        EventPojo eventList1=new EventPojo();
        eventList1.setTitle("Carrom Doubles");
        eventList1.setContactName("Mr Chandrahas");
        eventList1.setContactNumber("9880971036");
        eventList1.setAmount("100");
        eventList1.setDescription("Carrom (also spelled carom) is a cue sport-based tabletop game of South Asian origin. ... In South Asia, many clubs and cafés hold regular tournaments. Carrom is very commonly played by families, including children, and at social functions.");
        list.add(eventList1);

        //badmintion
        EventPojo eventList2=new EventPojo();
        eventList2.setTitle("Shuttle Badmintion Mixed Doubles");
        eventList2.setContactName("Manjunath B S");
        eventList2.setContactNumber("7411852055");
        eventList2.setAmount("200");
        eventList2.setDescription("Badminton is a racquet sport played using racquets to hit a shuttlecock across a net. Although it may be played with larger teams, the most common forms of the game are \"singles\" and \"doubles\".");
        list.add(eventList2);

        //
        EventPojo eventList3=new EventPojo();
        eventList3.setTitle("Throw ball");
        eventList3.setContactName("Mrs.Vani K");
        eventList3.setContactNumber("9986292092");
        eventList3.setAmount("1000");
        eventList3.setDescription("Throwball is a non-contact ball sport played across a net between two teams of nine players on a rectangular court. It is popular in Asia, especially on the Indian subcontinent, and was first played in India as a women's sport in Chennai during the 1940s. Like volleyball, the game's roots are linked with the YMCA");
        list.add(eventList3);

        //
        EventPojo eventList4=new EventPojo();
        eventList4.setTitle("Football");
        eventList4.setContactName("Mr.Sumantha");
        eventList4.setContactNumber("9845184928");
        eventList4.setAmount("1500");
        eventList4.setDescription("Association football, more commonly known as football or soccer, is a team sport played with a spherical ball between two teams of eleven players. It is played by 250 million players in over 200 countries and dependencies, making it the world's most popular sport.");
        list.add(eventList4);

        //
        EventPojo eventList5=new EventPojo();
        eventList5.setTitle("shuttle Badmintion Single (Girls)");
        eventList5.setContactName("Manjunath B S");
        eventList5.setContactNumber("7411852055");
        eventList5.setAmount("100");
        eventList5.setDescription("Badminton is a racquet sport played using racquets to hit a shuttlecock across a net. Although it may be played with larger teams, the most common forms of the game are \"singles\" and \"doubles\"");
        list.add(eventList5);

        //
        EventPojo eventList6=new EventPojo();
        eventList6.setTitle("Tennicoit Doubles");
        eventList6.setContactName("Manjunath B S");
        eventList6.setContactNumber("7411852055");
        eventList6.setAmount("200");
        eventList6.setDescription("Tennikoit, also called ring tennis or tenniquoits, is game played on a tennis-style court, with a circular rubber ring hurled over a net separating the two players, with each endeavoring to catch and return the hurled ring into the opponent's court. ");
        list.add(eventList6);

        //
        EventPojo eventList7=new EventPojo();
        eventList7.setTitle("Cricket");
        eventList7.setContactName("Pooja K M & Roopa V");
        eventList7.setContactNumber("8123594905");
        eventList7.setAmount("1500");
        eventList7.setDescription("Cricket is a bat-and-ball game played between two teams of eleven players on a field at the centre of which is a 20-metre (22-yard) pitch with a wicket at each end, each comprising two bails balanced on three stumps. The batting side scores runs by striking the ball bowled at the wicket with the bat, while the bowling and fielding side tries to prevent this and dismiss each player (so they are \"out\"). Means of dismissal include being bowled, when the ball hits the stumps and dislodges the bails, and by the fielding side catching the ball after it is hit by the bat, but before it hits the ground. When ten players have been dismissed, the innings ends and the teams swap roles. The game is adjudicated by two umpires, aided by a third umpire and match referee in international matches. They communicate with two off-field scorers who record the match's statistical information.");
        list.add(eventList7);

        //
        EventPojo eventList8=new EventPojo();
        eventList8.setTitle("Shuttle Badmintion (Singles) Boys");
        eventList8.setContactName("Manjunath B S");
        eventList8.setContactNumber("7411852055");
        eventList8.setAmount("100");
        eventList8.setDescription("Badminton is a racquet sport played using racquets to hit a shuttlecock across a net. Although it may be played with larger teams, the most common forms of the game are \"singles\" and \"doubles\"");
        list.add(eventList8);

        //
        EventPojo eventList9=new EventPojo();
        eventList9.setTitle("Volley Ball");
        eventList9.setContactName("MR.Subash");
        eventList9.setContactNumber("9886176133");
        eventList9.setAmount("1000");
        eventList9.setDescription("Volleyball is a popular team sport in which two teams of six players are separated by a net. Each team tries to score points by grounding a ball on the other team's court under organized rules.[1] It has been a part of the official program of the Summer Olympic Games since Tokyo 1964.");
        list.add(eventList9);

        //
        EventPojo eventList10=new EventPojo();
        eventList10.setTitle("100 MTR Running Race");
        eventList10.setContactName("Mr.Sumanth");
        eventList10.setContactNumber("9845184928");
        eventList10.setAmount("50");
        eventList10.setDescription("Sprints are short running events in athletics and track and field. Races over short distances are among the oldest running competitions.");
        list.add(eventList10);

        //
        EventPojo eventList11=new EventPojo();
        eventList11.setTitle("200 MTR Running Race");
        eventList11.setContactName("Mr.Sumanth");
        eventList11.setContactNumber("9845184928");
        eventList11.setAmount("50");
        eventList11.setDescription("Sprints are short running events in athletics and track and field. Races over short distances are among the oldest running competitions.");
        list.add(eventList11);

        //
        EventPojo eventList12=new EventPojo();
        eventList12.setTitle("4 X 100 MTR Relay Running");
        eventList12.setContactName("Mr.Sowmya");
        eventList12.setContactNumber("9845184928");
        eventList12.setAmount("200");
        eventList12.setDescription("Sprints are short running events in athletics and track and field. Races over short distances are among the oldest running competitions.");
        list.add(eventList12);

        //
        EventPojo eventList13=new EventPojo();
        eventList13.setTitle("800 MTR Running Race");
        eventList13.setContactName("Mr.Uttam Roy");
        eventList13.setContactNumber("9066603364");
        eventList13.setAmount("50");
        eventList13.setDescription("Sprints are short running events in athletics and track and field. Races over short distances are among the oldest running competitions.");
        list.add(eventList13);

        //
        EventPojo eventList14=new EventPojo();
        eventList14.setTitle("Shot Put");
        eventList14.setContactName("Mr.Uttam Roy");
        eventList14.setContactNumber("9066603364");
        eventList14.setAmount("50");
        eventList14.setDescription("The shot put is a track and field event involving \"putting\" (pushing rather than throwing) a heavy spherical object—the shot—as far as possible. The shot put competition for men has been a part of the modern Olympics since their revival in 1896, and women's competition began in 1948.");
        list.add(eventList14);

        //
        EventPojo eventList15=new EventPojo();
        eventList15.setTitle("Javelin Throw");
        eventList15.setContactName("Mr.Uttam Roy");
        eventList15.setContactNumber("9066603364");
        eventList15.setAmount("50");
        eventList15.setDescription("The javelin throw is a track and field event where the javelin, a spear about 2.5 m (8 ft 2 in) in length, is thrown. The javelin thrower gains momentum by running within a predetermined area. Javelin throwing is an event of both the men's decathlon and the women's heptathlon.");
        list.add(eventList15);

        //
        EventPojo eventList16=new EventPojo();
        eventList16.setTitle("Slow Bicycle Race");
        eventList16.setContactName("Mr.Sumanth");
        eventList16.setContactNumber("9845184928");
        eventList16.setAmount("100");
        eventList16.setDescription("Cycle sport is competitive physical activity using bicycles. ");
        list.add(eventList16);

    }

}
