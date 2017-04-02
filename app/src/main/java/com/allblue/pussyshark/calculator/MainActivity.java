package com.allblue.pussyshark.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add,sub,mul,div;
        final EditText num1,num2;
        add = (Button)findViewById(R.id.add);
        sub  = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.multiply);
        div  = (Button)findViewById(R.id.divide);
        num1 = (EditText)findViewById(R.id.number1);
        num2 = (EditText)findViewById(R.id.number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                Toast.makeText(MainActivity.this,"Sum is "+(number1+number2),Toast.LENGTH_SHORT).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                Toast.makeText(MainActivity.this,"Sub is "+(number1-number2),Toast.LENGTH_SHORT).show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                Toast.makeText(MainActivity.this,"Mul is "+(number1*number2),Toast.LENGTH_SHORT).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                Toast.makeText(MainActivity.this,"Div is "+(number1/number2),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
