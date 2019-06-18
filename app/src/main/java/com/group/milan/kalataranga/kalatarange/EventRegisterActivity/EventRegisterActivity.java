package com.group.milan.kalataranga.kalatarange.EventRegisterActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.group.milan.kalataranga.kalatarange.R;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventRegisterActivity extends AppCompatActivity {

    @BindView(R.id.activity_back_icon)
    ImageView backBtn;

    @BindView(R.id.name)
    EditText name;

    @BindView(R.id.year)
    EditText year;

    @BindView(R.id.number)
    EditText number;

    @BindView(R.id.branch)
    EditText branch;

    @BindView(R.id.message)
    EditText message;

    @BindView(R.id.processed_btn)
    Button processedBtn;

    @BindView(R.id.spinner)
    Spinner spinner;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    String eventTitle=null;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_register);

        FirebaseApp.initializeApp(this);
        ButterKnife.bind(this);
        progressDialog=new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Registering...");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();

        initViews();

    }

    public void initViews(){
        final String array[]={
                "photography","tiktok","short movies","painting","mehendi","fireless cooking","collage","pot painting","gamming",
                "hair style","pencil sketching","wolf of wall street","vegetable and fruit carving","flower arrangment","pot pourri","rangoli","tattoo design","Treasure Hunt",
                "chess","carrom double","shuttle badmintion (mixed double)","throw ball","football","shuttle badmintion (single) girls","shuttle badmintion (single) boys",
                "tennicoit double","cricket","volley ball","100 MTR running race","200 MTR running race","4 X 100 MTR realy running","800 MTR running race","shot put","javelin throw",
                "slow bicycle race","Duet Singing (Team)","Instrumental (Team)","Fashion Show (Team)","Group Dance (Team)","Group Singing (Team)",
                "Mime (Team)","Rap Singing","Skit (Team)","Solo Dance","Solo Singing"
        };

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,array);
        spinner.setAdapter(adapter);

//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                eventTitle=array[i];
//            }
//        });

        processedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getName,getBranch,getYear,getNumber,getMessage;
                getBranch=branch.getText().toString().trim();
                getName=name.getText().toString().trim();
                getNumber=number.getText().toString().trim();
                getYear=year.getText().toString().trim();
                getMessage=message.getText().toString().trim();
                eventTitle=spinner.getSelectedItem().toString().trim();
                Date date=new Date();
                SimpleDateFormat ft=new SimpleDateFormat("yyyy/MM/dd");
                String getDate=ft.format(date);

                if(eventTitle == null){
                    Toast.makeText(getApplicationContext(),"please select event",Toast.LENGTH_LONG).show();
                }else if(getName.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter name",Toast.LENGTH_LONG).show();
                }else if(getBranch.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter branch",Toast.LENGTH_LONG).show();
                }else if(getNumber.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter number",Toast.LENGTH_LONG).show();
                }else if(getYear.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter year",Toast.LENGTH_LONG).show();
                }else if(getMessage.isEmpty()){
                    Toast.makeText(getApplicationContext(),"please enter message",Toast.LENGTH_LONG).show();
                }else{
                    progressDialog.show();
                    EventDetailsPojo eventDetailsPojo=new EventDetailsPojo(getName,getBranch,getNumber,getYear,getMessage,eventTitle,getDate);
                    databaseReference.child("registeration").push().setValue(eventDetailsPojo).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(getApplicationContext(),"Register",Toast.LENGTH_LONG).show();
                            branch.setText("");
                            name.setText("");
                            number.setText("");
                            year.setText("");
                            message.setText("");
                            progressDialog.hide();
                            progressDialog.dismiss();

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(),"Sorry cant register",Toast.LENGTH_LONG).show();
                            progressDialog.hide();
                            progressDialog.dismiss();
                        }
                    });
                }
            }
        });
    }

}
