package com.example.zoom.mycontact.Weight;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.zoom.mycontact.R;

import java.util.ArrayList;

public class WeightFormFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weight_form, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initBackBtn();
        initSaveBtn();
    }

    void initSaveBtn() {
        Button saveBtn = (Button) getView().findViewById(R.id.weight_form_save_btn);
        EditText date = (EditText) getView().findViewById(R.id.weight_form_date);
        EditText weight = (EditText) getView().findViewById(R.id.weight_form_weight);

        String _date = date.getText().toString();
        String _weight = weight.getText().toString();


    }

    void initBackBtn() {
        Button backBtn = (Button) getView().findViewById(R.id.weight_form_back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_view, new WeightFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
