package com.group.milan.kalataranga.kalatarange.HomeActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.group.milan.kalataranga.kalatarange.AboutDevelopersActivity.AboutDevelopersActivity;
import com.group.milan.kalataranga.kalatarange.AboutInstutions.AboutInstutionsActivity;
import com.group.milan.kalataranga.kalatarange.AboutKalatarangaActivity.AboutKalatarangActivity;
import com.group.milan.kalataranga.kalatarange.AllEventActivity.AllEventActivity;
import com.group.milan.kalataranga.kalatarange.EventRegisterActivity.EventRegisterActivity;
import com.group.milan.kalataranga.kalatarange.EventRegistrationActivity.EventRegistrationActivity;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.EventSchedulingActivity;
import com.group.milan.kalataranga.kalatarange.Menu.MenuActivity;
import com.group.milan.kalataranga.kalatarange.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.menu_first)
    LinearLayout firstMenu;

    @BindView(R.id.menu_second)
    LinearLayout secondMenu;

    @BindView(R.id.menu_third)
    LinearLayout thirdMenu;

    @BindView(R.id.menu_fourth)
    LinearLayout fourthMenu;

    @BindView(R.id.menu_fifth)
    LinearLayout fifthMenu;

    @BindView(R.id.menu_sixth)
    LinearLayout sixthMenu;

    @BindView(R.id.activity_home_menu_icon)
    ImageView menuIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //butter knife
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initViews();
    }

    private void initViews(){
        firstMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, AllEventActivity.class);
                startActivity(intent);
            }
        });

        secondMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, EventSchedulingActivity.class);
                startActivity(intent);
            }
        });

        thirdMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, EventRegisterActivity.class);
                startActivity(intent);
            }
        });

        fourthMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.facebook.com/rrinstitute");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        fifthMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.youtube.com/watch?v=eGS2qapieFs");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        sixthMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, AboutDevelopersActivity.class);
                startActivity(intent);
            }
        });

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }

}
