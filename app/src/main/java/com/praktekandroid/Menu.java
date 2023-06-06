package com.praktekandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    ImageButton btninputdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //1. panggil button pada layout activity_content_menu.xml
        btninputdata = findViewById(R.id.btntambahdata);

        //2. beri prosedur click pada button
        btninputdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gunakan INTENT untuk memanggil activity lain
                Intent intent =new Intent(Menu.this,inputdata.class);
                startActivity(intent);
            }
        });



    }
}