package com.example.jumate;


import android.content.Intent;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class faculty extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        createExampleList();
        buildRecyclerView();

        EditText editText = findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }

    private void filter(String text) {
        ArrayList<ExampleItem> filteredList = new ArrayList<>();

        for (ExampleItem item : mExampleList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter.filterList(filteredList);
    }

    private void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.blank,"Mr.Naveen Hemrajani","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Shashi Sharma","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Bhavna Sharma","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Gajanand Sharma","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Kamlesh Lakhwani","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Girraj Khandelwal","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Pankaj Jain","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Mukesh Kumar","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Rishi Kumar Sharma","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Sameep Narain Sinha","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Sanat Jain","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Satyajeet Sharma","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Sheetal Kumar Dixit","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Tushar Vyas","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Dimpal Sharma","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Neha Mishra","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Nidhi Gour","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Nootan Verma","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Raminder Kaur","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Ruchi Kulshrestha","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Saibee Alam","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Shivangi Dheer","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Sonal Saxena","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Swikruti Nayak","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms.Shruti Mathur","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms.Laxmi Poonia","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "A","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "B","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "C","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "D","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "E","hsadbjf"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "F","hsadbjf"));


    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }



}

