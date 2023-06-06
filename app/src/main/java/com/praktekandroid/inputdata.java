package com.praktekandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inputdata extends AppCompatActivity {

    Button btnsimpan;
    EditText tkdmatkul, tnamamatkul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputdata);
        //MENAMBAHKAN TOMBOL BACK ARROW
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // -- add back arrow to toolbar -------------------------------------------------------
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(inputdata.this, Menu.class));
                finish();
            }
        });
        //--------------------------------------------------------------------------
        btnsimpan = findViewById(R.id.btnsimpan);
        //inisiasikan obyek edittext agar inputan dapat
        // disimpan di variabel
        tkdmatkul = findViewById(R.id.txtkodematkul);
        tnamamatkul = findViewById(R.id.txtnamamatkul);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(inputdata.this, "Simpan", Toast.LENGTH_LONG).show();
                //panggil FUNCTION KONFIRMASI AlertDialog utk konfirmasi SIMPAN atau BATAL
                //...
                konfirmasiSimpan();
            }
        });
    }

    private void konfirmasiSimpan(){
        final AlertDialog.Builder dialog = new AlertDialog.Builder(inputdata.this);
        dialog.setTitle("Konfirmasi")
                .setMessage("Apakah data akan disimpan?")
                .setPositiveButton("YA", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        //LETAKKAN API SIMPAN DATA DISINI

                        //Simpan data input ke variabel
                        String kdmatkul, nama_matkul;
                        kdmatkul = tkdmatkul.getText().toString().trim();
                        nama_matkul = tnamamatkul.getText().toString().trim();

                        //BUAT INTENT UNTUK MEMANGGIL ACTIVITY TAMPIL DATA
                        Intent tampilData = new Intent(inputdata.this,TampilData.class);
                        tampilData.putExtra("transferkdmatkul",kdmatkul);
                        tampilData.putExtra("transfernamamatkul",nama_matkul);
                        startActivity(tampilData);

                        Toast.makeText(inputdata.this, "Simpan Selesai", Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        Toast.makeText(inputdata.this, "Simpan BATAL", Toast.LENGTH_LONG).show();
                    }
                });
        dialog.show();
    }


}