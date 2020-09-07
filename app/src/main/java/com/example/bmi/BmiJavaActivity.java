package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);
        findViewById(R.id.bmibutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText tallField=findViewById(R.id.tall);
                String tall=tallField.getText().toString();

                EditText weightField=findViewById(R.id.weight);
                String weight=weightField.getText().toString();
                //bmi공식=체중/키*키(키는 미터로 계산하기때문에 100으로 나눠주고 실행)
                double bmi=Double.parseDouble(weight)/Math.pow(Double.parseDouble(tall)/100.0,2);

                TextView resultLabel=findViewById(R.id.result);
                resultLabel.setText("키:"+tall+",체중:"+weight+",BMI:"+bmi);

            }
        });
    }
}