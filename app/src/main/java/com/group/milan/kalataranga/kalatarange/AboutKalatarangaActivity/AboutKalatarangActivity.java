package com.group.milan.kalataranga.kalatarange.AboutKalatarangaActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.group.milan.kalataranga.kalatarange.EventDetailsActivity.EventDetailsActivity;
import com.group.milan.kalataranga.kalatarange.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AboutKalatarangActivity extends AppCompatActivity {
    @BindView(R.id.activity_back_icon)
    ImageView backBtn;

    @BindView(R.id.suman_call_btn)
    Button sumanCallBtn;

    @BindView(R.id.vani_call_btn)
    Button vaniCallBtn;

    @BindView(R.id.uttam_call_btn)
    Button uttamCallBtn;

    @BindView(R.id.rakshitha_call_btn)
    Button rakshitaCallBtn;

    private final int REQUEST_PHONE_CALL=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_kalatarang);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViews();

    }

    private void initViews() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        sumanCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ActivityCompat.checkSelfPermission(AboutKalatarangActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    ActivityCompat.requestPermissions(AboutKalatarangActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);

                    return;

                }else{
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9845184928"));
                    startActivity(intent);
                }

            }
        });

        vaniCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityCompat.checkSelfPermission(AboutKalatarangActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    ActivityCompat.requestPermissions(AboutKalatarangActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);

                    return;

                }else{
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9986292092"));
                    startActivity(intent);
                }
            }
        });

        uttamCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityCompat.checkSelfPermission(AboutKalatarangActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    ActivityCompat.requestPermissions(AboutKalatarangActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);

                    return;

                }else{
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9066603364"));
                    startActivity(intent);
                }
            }
        });

        //students coordinators
        rakshitaCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityCompat.checkSelfPermission(AboutKalatarangActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    ActivityCompat.requestPermissions(AboutKalatarangActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);

                    return;

                }else{
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9141772826"));
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode){
            case REQUEST_PHONE_CALL:
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(AboutKalatarangActivity.this,"Call Invoked",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(AboutKalatarangActivity.this,"Call not invoked",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
