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
        mExampleList.add(new ExampleItem(R.drawable.blank,"sarfaraz"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Shashi Sharma"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Bhavna Sharma"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Gajanand Sharma"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Dr. Kamlesh Lakhwani"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Girraj Khandelwal"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Pankaj Jain"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Mukesh Kumar"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Rishi Kumar Sharma"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Sameep Narain Sinha"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Sanat Jain"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Satyajeet Sharma"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Sheetal Kumar Dixit"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Mr. Tushar Vyas"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Dimpal Sharma"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Neha Mishra"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Nidhi Gour"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Nootan Verma"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Raminder Kaur"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Ruchi Kulshrestha"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Saibee Alam"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Shivangi Dheer"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Sonal Saxena"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms. Swikruti Nayak"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms.Shruti Mathur"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "Ms.Laxmi Poonia"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "A"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "B"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "C"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "D"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "E"));
        mExampleList.add(new ExampleItem(R.drawable.blank, "F"));


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

