package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        List<card> item = new ArrayList<card>();
        item.add(new card("Olivia Wilson","SOme Text","Princess",R.drawable.a));
        item.add(new card("Claudia Wilson","SOme Text","Abandoned Kingdom",R.drawable.b));
        item.add(new card("Greta Mae Evans","This was Something We Needed","This Is The First Poem I Wrote",R.drawable.c));
        item.add(new card("Avery Davis","SOme Text","By Your Side",R.drawable.d));
        item.add(new card("Claudia Wilson","SOme Text","Our Last Summer",R.drawable.e));
        item.add(new card("Olivia Wilson","SOme Text","Princess",R.drawable.a));
        item.add(new card("Claudia Wilson","SOme Text","Abandoned Kingdom",R.drawable.b));
        item.add(new card("Greta Mae Evans","This was Something We Needed","This Is The First Poem I Wrote",R.drawable.c));
        item.add(new card("Avery Davis","SOme Text","By Your Side",R.drawable.d));
        item.add(new card("Claudia Wilson","SOme Text","Our Last Summer",R.drawable.e));
        item.add(new card("Olivia Wilson","SOme Text","Princess",R.drawable.a));
        item.add(new card("Claudia Wilson","SOme Text","Abandoned Kingdom",R.drawable.b));
        item.add(new card("Greta Mae Evans","This was Something We Needed","This Is The First Poem I Wrote",R.drawable.c));
        item.add(new card("Avery Davis","SOme Text","By Your Side",R.drawable.d));
        item.add(new card("Claudia Wilson","SOme Text","Our Last Summer",R.drawable.e));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ImageAdapter(getApplicationContext(),item));
    }


}