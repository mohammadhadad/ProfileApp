package com.example.profileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class edit_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        String fullname=getIntent().getStringExtra("fullname");
        EditText nameEt=findViewById(R.id.newName_et);
        nameEt.setText(fullname);
        Button done=findViewById(R.id.btn_done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String fullname=nameEt.getText().toString();
                    Intent intent=new Intent();
                    intent.putExtra("fullname" , fullname);
                    setResult(RESULT_OK ,intent);
                    finish();

            }
        });


    }
}