package com.z3tecx.mengenalfruit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvbuah;
    String[] namab, detailb;
    int[] gambarb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvbuah = findViewById(R.id.RecyclerViewBuah);

        rvbuah.setHasFixedSize(true);

        rvbuah.setLayoutManager(new LinearLayoutManager(this));

        namab = getResources().getStringArray(R.array.namabuah);
        detailb = getResources().getStringArray(R.array.deskripsibuah);
        gambarb = new int[]{
                R.drawable.alpukat,
                R.drawable.apel,
                R.drawable.ceri,
                R.drawable.durian,
                R.drawable.jambuair,
                R.drawable.manggis,
                R.drawable.strawberry,
        };

        AdapterBuah adapter = new AdapterBuah(MainActivity.this, gambarb, namab, detailb);
        rvbuah.setAdapter(adapter);
    }
}
