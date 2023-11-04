package com.example.ai_driven_essay_application_java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText ques;
    EditText tag;
    Spinner lang;
    EditText size;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ques = findViewById(R.id.ques);
        tag = findViewById(R.id.tag);
        lang = (Spinner) findViewById(R.id.lang);
        size = findViewById(R.id.size);
        btn = findViewById(R.id.btn);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.language_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lang.setAdapter(adapter);

        String question = ques.getText().toString();
        String tags = tag.getText().toString();
        String language = lang.getSelectedItem().toString();
        String wordsize = size.getText().toString();

        String q = question+tags+language+wordsize+"words";



    }
}