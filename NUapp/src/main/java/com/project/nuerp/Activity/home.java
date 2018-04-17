package com.project.nuerp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.project.nuerp.AdminActivity.adminHome;
import com.project.nuerp.R;

public class home extends AppCompatActivity {
    Button c1,c2,c3,c4,adminbtn;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imageView=(ImageView)findViewById(R.id.imageView2);
        c1=(Button) findViewById(R.id.cd1);
        c2=(Button) findViewById(R.id.cd2);
        c3=(Button) findViewById(R.id.cd3);
        c4=(Button) findViewById(R.id.cd4);

        /*c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,student_login.class));
            }
        });*/
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,student_login.class));
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,student_login.class));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,student_login.class));
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,student_login.class));
            }
        });


    }
}
