package com.example.ai_driven_essay_application_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        ques = (EditText) findViewById(R.id.ques);
        tag = (EditText) findViewById(R.id.tag);
        lang = (Spinner) findViewById(R.id.lang);
        size = (EditText) findViewById(R.id.size);
        btn = findViewById(R.id.btn);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.language_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lang.setAdapter(adapter);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = ques.getText().toString();
                String tags = tag.getText().toString();
                String language = lang.getSelectedItem().toString();
                String wordsize = size.getText().toString();

                String final_question = question+" "+tags+" "+language+" "+wordsize+" "+"words";
                Intent intent = new Intent(MainActivity.this, output.class);
                intent.putExtra("question",final_question);
                startActivity(intent);
            }
        });



    }
}