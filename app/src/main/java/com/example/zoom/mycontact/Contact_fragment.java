package com.example.zoom.mycontact;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Contact_fragment extends Fragment {

    ArrayList<String> contacts = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact,container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ListView contactList = getView().findViewById(R.id.listView);
        final ArrayAdapter<String> contactAdapter = new ArrayAdapter<String>
                (
                        getActivity(),
                        R.layout.support_simple_spinner_dropdown_item,
                        contacts);
        contactList.setAdapter(contactAdapter);

        Button addBtn = (Button)getView().findViewById(R.id.addBtn);
        EditText nameLabel = (EditText)getView().findViewById(R.id.nameLabel);

        final String _name = nameLabel.toString();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contacts.add(_name);
                contactAdapter.notifyDataSetChanged();
            }
        });
    }


}
