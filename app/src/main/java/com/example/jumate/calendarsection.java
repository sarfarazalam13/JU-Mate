package com.example.jumate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
       private CalendarView cs;
       private EditText et;
    private String str;
    private Button save;
    private DatabaseReference d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendarsection);
     cs=findViewById(R.id.calendarView);
     save=findViewById(R.id.savebutton);
     et=findViewById(R.id.CalandertextView);
     save.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

                 SaveEvent(v);

         }
     });
     cs.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

         @Override

         public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
       str=Integer.toString(year)+Integer.toString(month)+Integer.toString(dayOfMonth);
         calendarClicked();}
     });
     d= FirebaseDatabase.getInstance().getReference("Calendar");
    }
    private void calendarClicked()
    {
      d.child(str).addListenerForSingleValueEvent(new ValueEventListener() {
          @Override
          public void onDataChange(@NonNull DataSnapshot snapshot) {
              if(snapshot.getValue()!=null)
              {
                  et.setText(snapshot.getValue().toString());
              }
              else
              {
                  et.setText("null");
              }
          }

          @Override
          public void onCancelled(@NonNull DatabaseError error) {

          }
      });
    }
    public void SaveEvent(View view)
    {
        try
        {
        d.child(str).setValue(et.getText().toString());
    }
catch(Exception e)
    {

    }
        d = FirebaseDatabase.getInstance().getReference("Calendar");

    }
}