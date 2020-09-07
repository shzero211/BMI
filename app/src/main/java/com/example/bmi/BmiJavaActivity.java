package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        //findviewByid 는 효율이 않좋기때문에 먼저 선언.
    tallField=findViewById(R.id.tall);
    weightField=findViewById(R.id.weight);
    resultLabel=findViewById(R.id.result);
    bmiButton=findViewById(R.id.bmibutton);

    bmiButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String tall=tallField.getText().toString();

            String weight=weightField.getText().toString();

            double bmi=Double.parseDouble(weight)/Math.pow(Double.parseDouble(tall)/100.0,2);
            resultLabel.setText("키:"+tall+",체중:"+weight+",BMI:"+bmi);
        }
    });
    }
}