package com.example.connectdadots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.MapView;

import java.lang.reflect.TypeVariable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapView Fluffles = (MapView)findViewById(R.id.mapView2);
        Fluffles.getLayoutParams().height = Fluffles.getLayoutParams().width;
    }
}
