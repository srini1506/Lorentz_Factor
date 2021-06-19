package com.example.lorentzfactor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class lorentz_screen extends AppCompatActivity {
    private EditText velocity;
    private TextView lor_fac;
    private Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(velocity.getText().toString().length()==0){
            velocity.setText("Toast");
        }
        setContentView(R.layout.lorentz_screen);
        velocity = findViewById(R.id.velocity);
        lor_fac = findViewById(R.id.lor_fac);
        calc = findViewById(R.id.calc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float v1 = Float.parseFloat(velocity.getText().toString());
                float c = 300000000;
                double ans= 1/(Math.sqrt(1-((v1/c)*(v1/c))));

                lor_fac.setText(String.valueOf(ans));

            }
        });

    }
}
