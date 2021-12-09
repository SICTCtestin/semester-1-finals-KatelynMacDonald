package com.example.gdritz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SaladActivity extends AppCompatActivity {

    //Side Button
    private Button iceCreamBTN;
    private Button comboBTN;
    private Button sandwichBTN;
    private Button hotDogsBTN;
    private Button chiliBTN;
    private Button specialBTN;
    private Button saladBTN;
    private Button checkoutBTN;

    // Order Buttons
    private Button cGardenBTN;
    private Button dGardenBTN;
    private Button sSaladBTN;
    private Button tSaladBTN;
    private Button cSaladBTN;

    public String order;
    public double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salad_activity);

        order=getIntent().getStringExtra("order");
        total=Double.parseDouble(getIntent().getStringExtra("total"));

        //Side Button
        iceCreamBTN = findViewById(R.id.iceCreamBTN);
        comboBTN = findViewById(R.id.combosBTN);
        sandwichBTN = findViewById(R.id.sandwichBTN);
        hotDogsBTN = findViewById(R.id.hotDogsBTN);
        chiliBTN = findViewById(R.id.chiliBTN);
        specialBTN = findViewById(R.id.specialBTN);
        saladBTN = findViewById(R.id.saladBTN);
        checkoutBTN = findViewById(R.id.checkOutBTN);

        // Order Button
        cGardenBTN = findViewById(R.id.cGardenBTN);
        dGardenBTN = findViewById(R.id.dGardenBTN);
        sSaladBTN = findViewById(R.id.sSaladBTN);
        tSaladBTN = findViewById(R.id.tSaladBTN);
        cSaladBTN = findViewById(R.id.cSaladBTN);


        //Side buttons
        iceCreamBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaladActivity.this,IceCreamActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        comboBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaladActivity.this,ComboActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        sandwichBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaladActivity.this,SandwichActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        hotDogsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaladActivity.this,HotDogsActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        chiliBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaladActivity.this,ChilliActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        specialBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaladActivity.this,SpecialActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        saladBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You're already on the Salad Menu!", Toast.LENGTH_SHORT).show();
            }
        });
        checkoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SaladActivity.this,CheckoutActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });

        // Order Button
        cGardenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Choice Garden Salad\t\t\t\t$5.00\n";
                total+=5;
            }
        });
        dGardenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Deluxe Garden Salad\t\t\t\t$7.00\n";
                total+=7;
            }
        });
        sSaladBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Side Salad\t\t\t\t$3.00\n";
                total+=3;
            }
        });
        tSaladBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Taco Salad\t\t\t\t$6.00\n";
                total+=6;
            }
        });
        cSaladBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Chicken Salad\t\t\t\t$7.00\n";
                total+=7;
            }
        });
    }
}