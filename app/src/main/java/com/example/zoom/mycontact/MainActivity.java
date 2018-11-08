package com.example.zoom.mycontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zoom.mycontact.Weight.WeightFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        setContentView(R.layout.fragment_weight);


        setContentView(R.layout.activity_main);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.main_view, new WeightFragment()).commit();
        }
    }
}
