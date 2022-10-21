package com.example.aplikasimenumakananv2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterMakanan extends ArrayAdapter{
    String namaMakanan[];
    int hargaMakanan[];
    String ket_Makanan[];
    int gambar_Makanan[];
    Activity activity;

    public AdapterMakanan(MainMakanan activity, String[] nama_Makanan, int[] harga_Makanan, int[] gambar_Makanan, String[] keterangan) {
        super(activity,R.layout.list_item,nama_Makanan);
        this.namaMakanan = nama_Makanan;
        this.hargaMakanan = harga_Makanan;
        this.ket_Makanan = ket_Makanan;
        this.gambar_Makanan = gambar_Makanan;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item,null);

        ImageView gambarnya;
        TextView nama_Makanan, harga_Makanan;

        gambarnya=v.findViewById(R.id.gambar_Makanan);
        nama_Makanan=v.findViewById(R.id.nama_Makanan);
        harga_Makanan=v.findViewById(R.id.harga_Makanan);

        gambarnya.setImageResource(gambar_Makanan[position]);
        nama_Makanan.setText(namaMakanan[position]);
        harga_Makanan.setText(""+hargaMakanan[position]);

        return v;
    }
}
