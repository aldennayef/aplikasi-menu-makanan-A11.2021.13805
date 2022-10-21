package com.example.aplikasimenumakananv2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {
    ImageView gambarMakanan_masuk;
    TextView nama_Makanan_masuk,ket_Makanan_masuk,harga_Makanan_masuk;

    int gambarMakanan;

    String namaMakanannya;
    String ketMakanannya;
    String hargaMakanannya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        gambarMakanan_masuk=findViewById(R.id.gambarterima);
        nama_Makanan_masuk=findViewById(R.id.nmMakanan);
        harga_Makanan_masuk=findViewById(R.id.hrMakanan);

       ket_Makanan_masuk=findViewById(R.id.ket_Makanan);
        if(getIntent().getExtras()!=null) {
            Bundle bundle = getIntent().getExtras();

            gambarMakanan = bundle.getInt(String.valueOf("gambarMakanan"));
            gambarMakanan_masuk.setImageResource(gambarMakanan);

            namaMakanannya = bundle.getString("namaMakanan");
        ketMakanannya=bundle.getString("keter");

            hargaMakanannya = bundle.getString("hargaMakanan");
            harga_Makanan_masuk.setText(hargaMakanannya);

            nama_Makanan_masuk.setText(namaMakanannya);
        ket_Makanan_masuk.setText(ketMakanannya);

        }
    }
}