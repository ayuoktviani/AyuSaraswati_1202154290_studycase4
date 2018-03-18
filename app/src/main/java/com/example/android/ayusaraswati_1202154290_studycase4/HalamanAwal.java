package com.example.android.ayusaraswati_1202154290_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HalamanAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
        setTitle("AsyncTask");
    }
    public void ListMahasiswa(View view) {
        //untuk berpindah ke aktivitas mahasiswa//
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    //method saat button ditekan
    public void CariGambar(View view) {
        //untuk berpindah ke aktivitas gambar//
        Intent intent = new Intent(this, PencarianGambar.class);
        startActivity(intent);
    }
}
