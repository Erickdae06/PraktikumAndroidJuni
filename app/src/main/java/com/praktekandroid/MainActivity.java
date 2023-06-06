package com.praktekandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    /* tekan Ctrl-Shift-/
    *  untuk membuat baris Comment sperti ini,
    * yang tidak akan ikut di eksekusi
    * */
    //ini comment hanya berlaku 1 line

    //deklarasikan obyek/class

    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        t3 = findViewById(R.id.text3);

        //coba ganti text ke3 obyek TView tadi
        t1.setText("Praktikum Android");
        t2.setText("NIM: 20830034888");
        t3.setText("Nama: Ini Budi");
        //......

        //CARA MEMBERI PERINTAH CLICK PADA OBJECT
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //disini coding perintahnya
//                Toast.makeText(MainActivity.this, "Ini Text 1", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Ini Teks 1", Toast.LENGTH_LONG).show();

                //pada saat di klik, warna teks berganti jadi Red
                t1.setTextColor(getResources().getColor(R.color.red));
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "Anda Klik Teks 2", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.purple_500));
                snackbar.show();
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar sb = Snackbar.make(findViewById(android.R.id.content),
                        "Anda klik teks 3",Snackbar.LENGTH_LONG);
                sb.getView().setBackgroundColor(getResources().getColor(R.color.red));
                sb.show();
            }
        });

    }
}