package com.example.android.fajarbagaskara_1202150085_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    // Initialize the views & button
    ImageView imgLogo, imgBattery;
    TextView textTitle, textLiter;
    ImageButton btnMinus, btnPlus;

    // ada 7 level liter 0 - 6 (full)
    int liter;

    // Initializes the activity, filling in the data from the Intent
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // mengambil intent dari activity list menu
        Intent intent = getIntent();

        imgLogo = findViewById(R.id.imageView);
        imgBattery = findViewById(R.id.imageBottle);
        textTitle = findViewById(R.id.textTitle);
        textLiter = findViewById(R.id.textLiter);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);

        int image = intent.getIntExtra("image", 0);
        imgLogo.setImageResource(image);
        textTitle.setText(intent.getStringExtra("title"));

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liter--;
                update_gambar(liter);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liter++;
                update_gambar(liter);
            }
        });
    }

    // method untuk isi air
    private void update_gambar(int liter) {
        switch (liter) {
            case 0:
                btnMinus.setEnabled(false);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_battery_20);
                textLiter.setText(String.valueOf(liter) + "L");

                Toast.makeText(getApplicationContext(),
                        "Air Sedikit",
                        Toast.LENGTH_SHORT)
                        .show();
                break;
            case 1:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_battery_30);
                textLiter.setText(String.valueOf(liter) + "L");
                break;
            case 2:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_battery_50);
                textLiter.setText(String.valueOf(liter) + "L");
                break;
            case 3:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_battery_60);
                textLiter.setText(String.valueOf(liter) + "L");
                break;
            case 4:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_battery_80);
                textLiter.setText(String.valueOf(liter) + "L");
                break;
            case 5:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_battery_90);
                textLiter.setText(String.valueOf(liter) + "L");
                break;
            case 6:
                btnPlus.setEnabled(false);
                btnMinus.setEnabled(true);

                imgBattery.setImageResource(R.drawable.ic_battery_full);
                textLiter.setText(String.valueOf(liter) + "L");

                Toast.makeText(getApplicationContext(),
                        "Air Sudah Full",
                        Toast.LENGTH_SHORT)
                        .show();
                break;
        }
    }
}
