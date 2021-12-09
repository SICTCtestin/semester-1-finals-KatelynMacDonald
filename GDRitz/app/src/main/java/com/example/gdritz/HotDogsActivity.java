package com.example.gdritz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HotDogsActivity extends AppCompatActivity {
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
    private Button oneBTN;
    private Button twoBTN;
    private Button threeBTN;

    public String order;
    public double total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotdog_activity);

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
        oneBTN = findViewById(R.id.oneBTN);
        twoBTN = findViewById(R.id.twoBTN);
        threeBTN = findViewById(R.id.threeBTN);



        //Side buttons
        iceCreamBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotDogsActivity.this,IceCreamActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        comboBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotDogsActivity.this,ComboActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        sandwichBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotDogsActivity.this,SandwichActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        hotDogsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You're already on the Hot Dog Menu!", Toast.LENGTH_SHORT).show();
            }
        });
        chiliBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotDogsActivity.this,ChilliActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        specialBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotDogsActivity.this,SpecialActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        saladBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotDogsActivity.this,SaladActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        checkoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HotDogsActivity.this,CheckoutActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });

        // Order Button
        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"All-American Hot Dog\t\t\t\t$3.00\n";
                total+=3;
            }
        });
        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Coney Dog\t\t\t\t$4.00\n";
                total+=4;
            }
        });
        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Coney Dog w/ Cheese\t\t\t\t$4.50\n";
                total+=4.5;
            }
        });

    }
}