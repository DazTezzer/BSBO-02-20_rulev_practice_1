package com.example.task_6_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = (Button) findViewById(R.id.button2);
        TextView myTextView = (TextView) findViewById(R.id.textView2);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox4);
        View.OnClickListener clicked = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("You trying to cross the border? right ");
                checkBox.setChecked(false);
            }
        };
        button2.setOnClickListener(clicked);
    }

    public void onClickBut1(View view){
        Toast.makeText(this, "Hey... you", Toast.LENGTH_SHORT).show();
        TextView myTextView = (TextView) findViewById(R.id.textView2);
        myTextView.setText("You finally awake");
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox4);
        checkBox.setChecked(true);
    }
}