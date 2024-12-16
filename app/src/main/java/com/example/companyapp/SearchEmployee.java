
package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SearchEmployee extends AppCompatActivity {
    EditText et8;
    Button b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_employee);

        et8=(EditText) findViewById(R.id.emc);
        b7=(Button) findViewById(R.id.serbut);
        b8=(Button) findViewById(R.id.bm);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob6=new Intent(getApplicationContext(), Menu.class);
                startActivity(ob6);
            }
        });

    }
}
