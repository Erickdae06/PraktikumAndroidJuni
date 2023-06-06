package com.praktekandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TampilData extends AppCompatActivity {

    TextView tKdmatkul, tnamamatkul;
    String kdmatkul, namamatkul;

    @Override
    protected void onStart() {
        super.onStart();
        //menerima transfer data dari intent
        Intent intent = getIntent();
        kdmatkul = intent.getStringExtra("transferkdmatkul");
        namamatkul = intent.getStringExtra("transfernamamatkul");
        //TAMPILKAN DI TEXT
        tKdmatkul.setText(kdmatkul);
        tnamamatkul.setText(namamatkul);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampildata);

        tKdmatkul = findViewById(R.id.text_kdmatkul);
        tnamamatkul = findViewById(R.id.text_namamatkul);
    }
}
