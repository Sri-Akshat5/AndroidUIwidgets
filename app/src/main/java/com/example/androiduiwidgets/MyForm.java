package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    EditText et_form1, et_pass, et_phone;
    RadioButton eb_male, eb_Female;
    CheckBox cb_Android, cb_Java, cb_Python;
    Spinner sp_cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);

        et_form1=(EditText) findViewById(R.id.et_form1);
        et_pass=(EditText) findViewById(R.id.et_pass);
        et_phone=(EditText)  findViewById(R.id.et_phone);

        eb_male=(RadioButton) findViewById(R.id.eb_male);
        eb_Female=(RadioButton) findViewById(R.id.eb_Female);

        cb_Android=(CheckBox) findViewById(R.id.cb_Android);
        cb_Java=(CheckBox) findViewById(R.id.cb_Java);
        cb_Python=(CheckBox) findViewById(R.id.cb_Python);

        sp_cities=(Spinner) findViewById(R.id.sp_cities);    }

    public void getAllValues(View view){

        String name = et_form1.getText().toString();
        String pass = et_pass.getText().toString();
        String phone = et_phone.getText().toString();

        String gender = "";
        if(eb_male.isChecked()){
            gender=eb_male.getText().toString();
        }
        if(eb_Female.isChecked()){
            gender=eb_Female.getText().toString();
        }


        String interest = "";
        if(cb_Android.isChecked()){
            interest+=cb_Android.getText().toString();

        }
        if(cb_Java.isChecked()){
            interest+=cb_Java.getText().toString();

        }
        if(cb_Python.isChecked()){
            interest+=cb_Python.getText().toString();

        }

        String city = sp_cities.getSelectedItem().toString();
        String res= name + phone + pass + gender + interest + city;
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }
}