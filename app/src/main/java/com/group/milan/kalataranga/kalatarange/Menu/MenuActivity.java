package com.group.milan.kalataranga.kalatarange.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.group.milan.kalataranga.kalatarange.AboutDevelopersActivity.AboutDevelopersActivity;
import com.group.milan.kalataranga.kalatarange.AboutInstutions.AboutInstutionsActivity;
import com.group.milan.kalataranga.kalatarange.AboutKalatarangaActivity.AboutKalatarangActivity;
import com.group.milan.kalataranga.kalatarange.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.activity_home_menu_icon)
    ImageView backBtn;

    @BindView(R.id.about_kalataranga)
    RelativeLayout kalataranga;

    @BindView(R.id.about_collage)
    RelativeLayout collage;

    @BindView(R.id.about_developer)
    RelativeLayout developer;

    @BindView(R.id.review_app)
    RelativeLayout reviewApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViews();
    }

    public void initViews(){
        kalataranga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this, AboutKalatarangActivity.class);
                startActivity(intent);
            }
        });

        collage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this, AboutInstutionsActivity.class);
                startActivity(intent);
            }
        });

        reviewApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this, AboutKalatarangActivity.class);
                startActivity(intent);
            }
        });

        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this, AboutDevelopersActivity.class);
                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
