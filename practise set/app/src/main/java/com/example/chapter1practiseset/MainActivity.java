package com.example.chapter1practiseset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText,editText1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1= findViewById(R.id.editText1);
        editText= findViewById(R.id.editText);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(editText1.getText().toString())+Integer.parseInt(editText.getText().toString());
                textView.setText("The sum is "+sum);
            }
        });
        textView= findViewById(R.id.textView);
    }
}