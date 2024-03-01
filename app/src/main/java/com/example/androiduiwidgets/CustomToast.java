package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Toast;

public class CustomToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
    }

    public void opentoast(View view){
        LayoutInflater lf = getLayoutInflater();

        android.view.View layout = lf.inflate(R.layout.layoutcustomtoastdesign,findViewById(R.id.cst_toast));

        Toast t = new Toast(getApplicationContext());
       // t.setGravity(Gravity.CENTER);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layout);
        t.show();

    }
}