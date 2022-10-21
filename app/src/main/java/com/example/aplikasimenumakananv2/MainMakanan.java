package com.example.aplikasimenumakananv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMakanan extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_makanan);

        String nama_Makanan[]={"Pecel Lele",
                            "Nasi Goreng Mercon",
                            "Ayam Geprek Keju",
                            "Kari Ayam",
                            "Tahu Bulat",
                            "Salad Buah"};

        int harga_Makanan[]={ 15000,
                            14500,
                            20000,
                            17500,
                            500,
                            12000};

        int gambar_Makanan[]={R.drawable.pecellele,
                            R.drawable.nasgor,
                            R.drawable.geprekkeju,
                            R.drawable.kariayam,
                            R.drawable.tahubulat,
                            R.drawable.salad};

        String keterangan[]={"Pecel lele bukan pecel ayam.",
                            "Nasi goreng mercon tidak bisa meledak karena bukan petasan.",
                            "Ayam yang digeprek yang ditambahi keju.",
                            "Kari ayam enak pol pokoknya.",
                            "Tahu bulat bukan kotak gurih yoy.",
                            "Salad buah isinya buah buah.",
                            };

        listview=findViewById(R.id.listdataMakanan);

        com.example.aplikasimenumakananv2.AdapterMakanan adapterMakanan=new com.example.aplikasimenumakananv2.AdapterMakanan(this,nama_Makanan,harga_Makanan,gambar_Makanan,keterangan);
        listview.setAdapter(adapterMakanan);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String nm_Makanan=nama_Makanan[position].toString();
                int hr_Makanan=harga_Makanan[position];
                int gbr_Makanan=gambar_Makanan[position];
                String ket=keterangan[position].toString();

                Intent intent=new Intent(MainMakanan.this,DetailMakanan.class);
                intent.putExtra("namaMakanan",nm_Makanan);
                intent.putExtra("hargaMakanan",""+hr_Makanan);
                intent.putExtra("gambarMakanan",gbr_Makanan);
                intent.putExtra("keter",ket);
                startActivity(intent);
            }
        });
    }
}