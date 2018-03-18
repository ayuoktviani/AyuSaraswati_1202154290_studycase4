package com.example.android.ayusaraswati_1202154290_studycase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PencarianGambar extends AppCompatActivity {
    ImageView picture;
    EditText sumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian_gambar);

        picture = (ImageView) findViewById(R.id.foto);
        sumber = (EditText) findViewById(R.id.link);
    }
    public void Cari(View view) {
        //loading gambar dari internet ke imageview
        Picasso.with(PencarianGambar.this).load(sumber.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(picture);
    }
}
