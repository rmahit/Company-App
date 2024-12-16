
package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AddEmployee extends AppCompatActivity {
    EditText et3,et4,et5,et6,et7;
    Button b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_employee);

        et3=(EditText) findViewById(R.id.empcode);
        et4=(EditText) findViewById(R.id.empname);
        et5=(EditText) findViewById(R.id.desg);
        et6=(EditText) findViewById(R.id.emi);
        et7=(EditText) findViewById(R.id.sal);
        b5=(Button) findViewById(R.id.subbut);
        b6=(Button) findViewById(R.id.bckmen);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3=new Intent(getApplicationContext(), Menu.class);
                startActivity(ob3);
            }
        });
    }
}
