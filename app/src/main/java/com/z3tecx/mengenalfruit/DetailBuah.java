package com.z3tecx.mengenalfruit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailBuah extends Activity {
    ImageView imgbuah;
    TextView detailbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgbuah = findViewById(R.id.imgDetail);
        detailbuah = findViewById(R.id.txtDetail);

        detailbuah.setText(getIntent().getStringExtra("detailb"));
        Glide.with(this).load(getIntent().getIntExtra("gambarb", 0)).into(imgbuah);

    }
}
