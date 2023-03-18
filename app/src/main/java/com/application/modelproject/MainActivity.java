package com.application.modelproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                RadioButton radioButton=findViewById(i);
//                Toast.makeText(getApplicationContext(),"你选了："+
//                        radioButton.getText(),Toast.LENGTH_LONG).show();
//            }
//        });
        Button button=findViewById(R.id.submit);
        RadioGroup radioGroup=findViewById(R.id.radioGroup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<radioGroup.getChildCount();i++){
                    RadioButton radioButton= (RadioButton) radioGroup.getChildAt(i);
                    if (radioButton.isChecked()){
                        Toast.makeText(getApplicationContext(),"你选择的是："
                        +radioButton.getText(),Toast.LENGTH_LONG).show();
                        break;
                    }
                }
            }
        });
    }

}