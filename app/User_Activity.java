package com.example.recyclerview_task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class User_Activity extends AppCompatActivity {
    private TextView tvtitle, tvdescription;//tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        tvtitle = (TextView) findViewById(R.id.txttitle);
//        tvcategory = (TextView) findViewById(R.id.txtcat);
        tvdescription = (TextView) findViewById(R.id.txtdesc);
        img = (ImageView) findViewById(R.id.userthumbnail);

        //Recieve data

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");


        //string values
        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);


    }
}
