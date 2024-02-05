package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ButtonClickEventOne extends AppCompatActivity {


    EditText et_one;
    Button btn_one;
    TextView tv_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_event_one);

        et_one =(EditText) findViewById(R.id.et_name);
        btn_one=(Button) findViewById(R.id.btn_name);
        tv_one=(TextView) findViewById(R.id.tv_name);

        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name =  et_one.getText().toString();
                tv_one.setText("Name:" + name);
            }
        });
    }
}