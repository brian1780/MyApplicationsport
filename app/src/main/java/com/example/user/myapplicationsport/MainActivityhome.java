package com.example.user.myapplicationsport;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityhome extends AppCompatActivity {
    Button b3,b5;
    TextView t2,t3,t4,t5;
    EditText e3,e5,e7,e8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityhome);

        b3=(Button)findViewById(R.id.button3);
        b5=(Button)findViewById(R.id.button5);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        e3=(EditText)findViewById(R.id.editText3);
        e5=(EditText)findViewById(R.id.editText5);
        e7=(EditText)findViewById(R.id.editText7);
        e8=(EditText)findViewById(R.id.editText8);



    }

}
