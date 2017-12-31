package com.example.user.myapplicationsport;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityfirst extends AppCompatActivity {

    TextView t1;
    ImageView i1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityfirst);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView);
        i1=(ImageView)findViewById(R.id.imageView);

        b1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View arg0) {




                    }});

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent it = new Intent();
                it.setClass(MainActivityfirst.this,
                        MainActivityhome.class);
                startActivity(it);


            }});
    }
}
