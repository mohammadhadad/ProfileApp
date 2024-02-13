package com.example.profileapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button editProfile=findViewById(R.id.editProfile_btn);
        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , edit_name.class);
                TextView nameTv=findViewById(R.id.nameTv);
                String fullname=nameTv.getText().toString();
                intent.putExtra("fullname" , fullname);
                startActivityForResult(intent , 1001);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1001 && resultCode == RESULT_OK && data != null) {
            String fullname = data.getStringExtra("fullname");
            TextView nameTv = findViewById(R.id.nameTv);
            nameTv.setText(fullname);
        }
    }
}