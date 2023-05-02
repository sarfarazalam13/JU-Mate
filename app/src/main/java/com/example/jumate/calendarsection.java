package com.example.jumate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class calendarsection extends AppCompatActivity {

    private CalendarView calendarView;
    private EditText eventEditText;
    private String selectedDate;
    private Button saveButton;
    private DatabaseReference databaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendarsection);

        calendarView = findViewById(R.id.calendarView);
        eventEditText = findViewById(R.id.CalandertextView);
        saveButton = findViewById(R.id.savebutton);


        databaseRef = FirebaseDatabase.getInstance().getReference("Calendar");


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveEvent();
            }
        });


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {// Construct a string representing the selected date (e.g. "20220501" for May 1st, 2022)
                selectedDate = String.format("%04d%02d%02d", year, month + 1, dayOfMonth);

                getEventForSelectedDate();
            }
        });
    }


    private void getEventForSelectedDate() {
        databaseRef.child(selectedDate).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {

                    eventEditText.setText(snapshot.getValue().toString());
                } else {

                    eventEditText.setText("");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }


    private void saveEvent() {
        String eventText = eventEditText.getText().toString();
        if (!eventText.isEmpty()) {
            databaseRef.child(selectedDate).setValue(eventText);
        } else {

            databaseRef.child(selectedDate).removeValue();
        }
    }
}