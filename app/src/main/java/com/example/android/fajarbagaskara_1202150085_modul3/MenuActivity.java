package com.example.android.fajarbagaskara_1202150085_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MenuActivity extends AppCompatActivity {

    // Untuk deklarasi objek
    private final LinkedList<String> menuTitle = new LinkedList<>();
    private final LinkedList<String> menuSub = new LinkedList<>();
    private final LinkedList<Integer> menuImage = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Menambah menu
        menuTitle.addLast("Ades");
        menuTitle.addLast("Amidis");
        menuTitle.addLast("Aqua");
        menuTitle.addLast("Cleo");
        menuTitle.addLast("Club");
        menuTitle.addLast("Equil");
        menuTitle.addLast("Evian");
        menuTitle.addLast("Leminerale");
        menuTitle.addLast("Nestle");
        menuTitle.addLast("Pristine");
        menuTitle.addLast("Vit");

        // Menambah subtitle
        menuSub.addLast("Ini air minum bermerek Ades");
        menuSub.addLast("Ini air minum bermerek Amidis");
        menuSub.addLast("Ini air minum bermerek Aqua");
        menuSub.addLast("Ini air minum bermerek Cleo");
        menuSub.addLast("Ini air minum bermerek Club");
        menuSub.addLast("Ini air minum bermerek Equil");
        menuSub.addLast("Ini air minum bermerek Evian");
        menuSub.addLast("Ini air minum bermerek Leminerale");
        menuSub.addLast("Ini air minum bermerek Nestle");
        menuSub.addLast("Ini air minum bermerek Pristine");
        menuSub.addLast("Ini air minum bermerek Vit");

        // Menambah gambar
        menuImage.addLast(R.drawable.ades);
        menuImage.addLast(R.drawable.amidis);
        menuImage.addLast(R.drawable.aqua);
        menuImage.addLast(R.drawable.cleo);
        menuImage.addLast(R.drawable.club);
        menuImage.addLast(R.drawable.equil);
        menuImage.addLast(R.drawable.evian);
        menuImage.addLast(R.drawable.leminerale);
        menuImage.addLast(R.drawable.nestle);
        menuImage.addLast(R.drawable.pristine);
        menuImage.addLast(R.drawable.vit);

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerView);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, menuTitle, menuSub, menuImage);
        // menghubungkan adaptor dengan RecyclerView
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // setlayoutmanager untuk recyclerview
        if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            // kalau landscape jadi grid 2 kolom
            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        }
        else{
            // kalau portrait jadi linear
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}