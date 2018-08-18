package com.example.carlosjof.cursosavnz2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        MarcaCarros carros1 = new MarcaCarros();

        carros1.setMarca("Honda");
        carros1.setPais("Japon");

        MarcaCarros carros2 = new MarcaCarros();

        carros2.setMarca("Toyota");
        carros2.setPais("Japon");

        MarcaCarros carros3 = new MarcaCarros();

        carros3.setMarca("Nissan");
        carros3.setPais("Japon");

        MarcaCarros carros4 = new MarcaCarros();

        carros4.setMarca("Ford");
        carros4.setPais("Estados Unidos");

        MarcaCarros carros5 = new MarcaCarros();

        carros5.setMarca("Chevrolet");
        carros5.setPais("Estados Unidos");

        MarcaCarros carros6 = new MarcaCarros();

        carros6.setMarca("Kia");
        carros6.setPais("Coreo del Sur");

        MarcaCarros carros7 = new MarcaCarros();

        carros7.setMarca("Hyundai");
        carros7.setPais("Corea del Sur");

        MarcaCarros carros8 = new MarcaCarros();

        carros8.setMarca("Ferrari");
        carros8.setPais("Italia");

        MarcaCarros carros9 = new MarcaCarros();

        carros9.setMarca("Maserati");
        carros9.setPais("Italia");

        ArrayList<MarcaCarros> arrayList = new ArrayList<>();
        arrayList.add(carros1);
        arrayList.add(carros2);
        arrayList.add(carros3);
        arrayList.add(carros4);
        arrayList.add(carros5);
        arrayList.add(carros6);
        arrayList.add(carros7);
        arrayList.add(carros8);
        arrayList.add(carros9);

        RecyclerView rv = findViewById(R.id.myRecycleView);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv.setAdapter(new MyRecycleAdapter(arrayList, this));
    }
}
