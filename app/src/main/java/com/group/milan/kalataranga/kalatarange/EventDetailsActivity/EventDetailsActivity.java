package com.group.milan.kalataranga.kalatarange.EventDetailsActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.group.milan.kalataranga.kalatarange.AboutKalatarangaActivity.AboutKalatarangActivity;
import com.group.milan.kalataranga.kalatarange.EventRegisterActivity.EventRegisterActivity;
import com.group.milan.kalataranga.kalatarange.EventRegistrationActivity.EventRegistrationActivity;
import com.group.milan.kalataranga.kalatarange.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventDetailsActivity extends AppCompatActivity {

    @BindView(R.id.activity_back_icon)
    ImageView backBtn;

    @BindView(R.id.adapter_event_particapate_btn)
    Button particapateButton;

    @BindView(R.id.adapter_event_contact_btn)
    Button callBtn;

    @BindView(R.id.event_details_title)
    TextView eventTitle;

    @BindView(R.id.adapter_amount)
    TextView eventAmount;

    @BindView(R.id.event_details_description)
    TextView eventDescription;

    @BindView(R.id.event_details_contact_name)
    TextView eventContactName;

    @BindView(R.id.adapter_event_instruction)
    TextView eventInstruction;

    String name, description, image, contactName, contactNumber, amount;

    private final int REQUEST_PHONE_CALL=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        ButterKnife.bind(this);

        name = getIntent().getStringExtra("name");
        description = getIntent().getStringExtra("description");
        contactName = getIntent().getStringExtra("contactName");
        contactNumber = getIntent().getStringExtra("contactNumber");
        amount=getIntent().getStringExtra("amount");
//        amount=getIntent().getStringExtra("");
//        image=getIntent().getStringExtra("");

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

        particapateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EventDetailsActivity.this, EventRegisterActivity.class);
                startActivity(intent);
            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (contactNumber == null) {
                    callBtn.setVisibility(View.GONE);
                } else {
                    if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling

                        ActivityCompat.requestPermissions(EventDetailsActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                        return;
                    }else{
                        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + contactNumber));
                        startActivity(intent);
                    }
                }
            }
        });

        eventTitle.setText(name);
        eventAmount.setText("RS "+amount);
        eventDescription.setText(description);
        eventInstruction.setText("asdasdsadsa");

        if (contactNumber == null) {
            eventContactName.setText("NA NA");
            callBtn.setVisibility(View.GONE);
        } else {
            eventContactName.setText(contactName);
        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode){
            case REQUEST_PHONE_CALL:
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(EventDetailsActivity.this,"Call Invoked",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(EventDetailsActivity.this,"Call not invoked",Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
