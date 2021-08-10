package com.example.android13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private ArrayList<CountryModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crateList();

        recyclerView = findViewById(R.id.mainRecylcler);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setList(list);
    }

    private void crateList() {
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
        list.add( new CountryModel(R.drawable.argentina, "Argentina","Buenes Aylance"));
    }


}