package com.example.toastlenguajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb_java;
    CheckBox cb_js,cb_go,cb_kotlin,cb_python,cb_cc,cb_scala,cb_ruby,cb_swift,cb_Dart;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb_java = findViewById(R.id.check_java);
        cb_js = findViewById(R.id.check_JS);
        cb_go = findViewById(R.id.check_Go);
        cb_kotlin = findViewById(R.id.check_Kotlin);
        cb_python = findViewById(R.id.check_Python);
        cb_cc = findViewById(R.id.check_CC);
        cb_scala = findViewById(R.id.check_Scala);
        cb_ruby = findViewById(R.id.check_Ruby);
        cb_swift = findViewById(R.id.check_Swift);
        cb_Dart = findViewById(R.id.check_Dart);
        btn_ok = findViewById(R.id.button_ok);
        CheckBox[] botones = {cb_java, cb_js, cb_go, cb_kotlin, cb_python, cb_cc, cb_scala, cb_ruby, cb_swift, cb_Dart};
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(CheckBox t: botones){
                    if(t.isChecked()){
                        Toast toast1 = Toast.makeText(getApplicationContext(), t.getText(), Toast.LENGTH_SHORT);
                        toast1.show();
                    }
                }
            }
        });
    }
}