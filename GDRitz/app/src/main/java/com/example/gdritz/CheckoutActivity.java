package com.example.gdritz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {
    private Button thirdBTN;
    private TextView orderLBL;
    private TextView totalLBL;
//    private TextView thirdLBL2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout_activity);
        thirdBTN = findViewById(R.id.thirdBTN);
        orderLBL = findViewById(R.id.orderLBL);
        totalLBL = findViewById(R.id.totalLBL);
//        thirdLBL2 = findViewById(R.id.thirdLBL2);

        String order = getIntent().getStringExtra("order");
        double total = Double.parseDouble(getIntent().getStringExtra("total"));
//        String valueOfIntent2 = getIntent().getStringExtra("input2");
        orderLBL.setText(order);
        totalLBL.setText("$"+Double.toString(total));
//        thirdLBL2.setText(valueOfIntent2);

        thirdBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CheckoutActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}