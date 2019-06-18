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

public class OffstageEventFragment extends Fragment {
    ArrayList<EventPojo> list=new ArrayList<>();

    @BindView(R.id.all_event_recyclerview)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_offstage_event,container,false);
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
        eventList.setTitle("Photography");
        eventList.setContactName("Subhash");
        eventList.setContactNumber("9886176133");
        eventList.setAmount("100");
        eventList.setDescription("Photography is the art, application and practice of creating durable images by recording light or other electromagnetic radiation, either electronically by means of an image sensor, or chemically by means of a light-sensitive material such as photographic film");
        list.add(eventList);

        //photography
        EventPojo eventList1=new EventPojo();
        eventList1.setTitle("TikTok");
        eventList1.setContactName("Harikrishna A.V");
        eventList1.setContactNumber("8088509569");
        eventList1.setAmount("100");
        eventList1.setDescription("TikTok, also known as Douyin in China, is a media app for creating and sharing short videos. Owned by ByteDance, the media app was launched as Douyin in China in September 2016 and introduced to the overseas market as TikTok one year later. ");
        list.add(eventList1);

        //badmintion
        EventPojo eventList2=new EventPojo();
        eventList2.setTitle("Short Movies");
        eventList2.setContactName("Gunasheela");
        eventList2.setContactNumber("9844183");
        eventList2.setAmount("500");
        eventList2.setDescription("Short film. A short film is any motion picture not long enough to be considered a feature film. The Academy of Motion Picture Arts and Sciences defines a short film as \"an original motion picture that has a running time of 40 minutes or less, including all credits\".");
        list.add(eventList2);

        //
        EventPojo eventList3=new EventPojo();
        eventList3.setTitle("Painting");
        eventList3.setContactName("Deepthi");
        eventList3.setContactNumber("9916564747");
        eventList3.setAmount("50");
        eventList3.setDescription("Painting is the practice of applying paint, pigment, color or other medium to a solid surface (support base). The medium is commonly applied to the base with a brush, but other implements, such as knives, sponges, and airbrushes, can be used.");
        list.add(eventList3);

        //
        EventPojo eventList4=new EventPojo();
        eventList4.setTitle("Mehendi");
        eventList4.setContactName("Aparna.A.S");
        eventList4.setContactNumber("7204189565");
        eventList3.setAmount("50");
        eventList4.setDescription("Mehndi is a form of body art originating from the Indian subcontinent, in which decorative designs are created on a person's body, using a paste, created from the powdered dry leaves of the henna plant (Lawsonia inermis). ... The use of mehndi and turmeric is described in the earliest Hindu Vedic ritual books.");
        list.add(eventList4);

        //
        EventPojo eventList5=new EventPojo();
        eventList5.setTitle("Fireless CookingFireless Cooking");
        eventList5.setContactName("Divya");
        eventList5.setContactNumber("9731018425");
        eventList5.setAmount("100");
        eventList5.setDescription("fireless cooker in British. noun. an insulated container that retains enough heat to cook food or keep it warm.");
        list.add(eventList5);

        //
        EventPojo eventList6=new EventPojo();
        eventList6.setTitle("Collage");
        eventList6.setContactName("Mrs.Nandini.K.C");
        eventList6.setContactNumber("9535814417");
        eventList6.setAmount("100");
        eventList6.setDescription("Collage is a technique of an art production, primarily used in the visual arts, where the artwork is made from an assemblage of different forms, thus creating a new whole.");
        list.add(eventList6);

        //
        EventPojo eventList7=new EventPojo();
        eventList7.setTitle("Pot Pourri");
        eventList7.setContactName("Abdulrahman Muhammadi");
        eventList7.setContactNumber("8073264537");
        eventList7.setAmount("200");
        eventList7.setDescription("Potpourri is a mixture of dried, naturally fragrant plant material, used to provide a gentle natural scent, commonly in residential settings. It is often placed in a decorative bowl or tied in small sachet made from sheer fabric. The word \"potpourri\" comes into English from the French word pot-pourri.");
        list.add(eventList7);

        //
        EventPojo eventList8=new EventPojo();
        eventList8.setTitle("Tattoo Design");
        eventList8.setContactName("Mrs.Sumithra.A.B");
        eventList8.setContactNumber("7259501986");
        eventList8.setAmount("50");
        eventList8.setDescription("A tattoo is a form of body modification where a design is made by inserting ink, dyes and pigments, either indelible or temporary, into the dermis layer of the skin to change the pigment. The art of making tattoos is tattooing.");
        list.add(eventList8);

        //
        EventPojo eventList9=new EventPojo();
        eventList9.setTitle("Treasure Hunt");
        eventList9.setContactName("Shruthi");
        eventList9.setContactNumber("9731553398");
        eventList9.setAmount("500");
        eventList9.setDescription("A treasure hunt is one of many different types of games for players who try to find hidden objects or places by following a series of clues. Treasure hunt games may be an indoor or outdoor activity.");
        list.add(eventList9);

        //
        EventPojo eventList10=new EventPojo();
        eventList10.setTitle("Pot Painting");
        eventList10.setContactName("Gnanaruba Priya");
        eventList10.setContactNumber("7899484642");
        eventList10.setAmount("100");
        eventList10.setDescription("NANA");
        list.add(eventList10);

        //
        EventPojo eventList11=new EventPojo();
        eventList11.setTitle("Gamming");
        eventList11.setContactName("Bharath Kalbugi");
        eventList11.setContactNumber("9743026173");
        eventList11.setAmount("100");
        eventList11.setDescription("Gaming is the running of specialized applications known as electronic games or video games on game consoles like X-box and Playstation or on personal computers (in which case the activity is known as online gaming).");
        list.add(eventList11);

        //
        EventPojo eventList12=new EventPojo();
        eventList12.setTitle("Hair Style");
        eventList12.setContactName("Kokila");
        eventList12.setContactNumber("7204665935");
        eventList12.setAmount("50");
        eventList12.setDescription("A hair cut refers to the length of your hair more than anything else, while the hair style refers to the way in which you wear your hair.");
        list.add(eventList12);

        //
        EventPojo eventList13=new EventPojo();
        eventList13.setTitle("Pencil Sketching");
        eventList13.setContactName("Riba Shisha");
        eventList13.setContactNumber("9148641189");
        eventList13.setAmount("50");
        eventList13.setDescription("Sketches can be made in any drawing medium. The term is most often applied to graphic work executed in a dry medium such as silverpoint, graphite, pencil, charcoal or pastel.");
        list.add(eventList13);

        //
        EventPojo eventList14=new EventPojo();
        eventList14.setTitle("Wolf of Wall Street");
        eventList14.setContactName("Mr.Gangadharaiah");
        eventList14.setContactNumber("9481136449");
        eventList14.setAmount("50");
        eventList14.setDescription("NANA");
        list.add(eventList14);

        //
        EventPojo eventList15=new EventPojo();
        eventList15.setTitle("Vegetable and fruit carving");
        eventList15.setContactName("Gnanaruba Priya");
        eventList15.setContactNumber("7899484642");
        eventList15.setAmount("50");
        eventList15.setDescription("Fruit carving is the art of carving fruit, a very common technique in Europe and Asian countries, and particularly popular in Thailand, China and Japan. There are many fruits that can be used in this process; the most popular one that artists use are watermelons, apples, strawberries, pineapples, and cantaloupes.");
        list.add(eventList15);

        //
        EventPojo eventList16=new EventPojo();
        eventList16.setTitle("Flower Arrangement");
        eventList16.setContactName("Visya");
        eventList16.setContactNumber("9916726802");
        eventList16.setAmount("50");
        eventList16.setDescription("Flower Arrangements Flower arrangements are an important part of the ambience on any occasion, weddings, birthdays, parties or any other events in life. Flower arrangement is an organization of design and color towards creating an ambience using flowers, foliage and other floral accessories.");
        list.add(eventList16);

        //
        EventPojo eventList17=new EventPojo();
        eventList17.setTitle("Rongoli");
        eventList17.setContactName("Shwetha");
        eventList17.setContactNumber("9986660236");
        eventList17.setAmount("50");
        eventList17.setDescription("Rangoli is an art form, originating in the Indian subcontinent, in which patterns are created on the floor or the ground using materials such as colored rice, dry flour, colored sand or flower petals.");
        list.add(eventList17);

    }

}
