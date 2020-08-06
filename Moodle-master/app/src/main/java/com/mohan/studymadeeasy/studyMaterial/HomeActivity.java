package com.mohan.studymadeeasy.studyMaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohan.studymadeeasy.R;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout class6layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        class6layout = findViewById(R.id.class_layout);
        class6layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,courseDescription.class));
            }
        });
    }
}
