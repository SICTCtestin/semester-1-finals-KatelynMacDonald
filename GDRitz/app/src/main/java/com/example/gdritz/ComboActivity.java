package com.example.gdritz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ComboActivity extends AppCompatActivity {
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
    private Button fourBTN;
    private Button fiveBTN;
    private Button sixBTN;
    private Button sevenBTN;
    public String order;
    public double total;

//    public String order=getIntent().getStringExtra("order");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combo_activity);
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
        fourBTN = findViewById(R.id.fourBTN);
        fiveBTN = findViewById(R.id.fiveBTN);
        sixBTN = findViewById(R.id.sixBTN);
        sevenBTN = findViewById(R.id.sevenBTN);


        //Side buttons
        iceCreamBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComboActivity.this,IceCreamActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        comboBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(ChilliActivity.this,ComboActivity.class);
//                startActivity(i);
                Toast.makeText(getApplicationContext(), "You're already on the Combo Menu!", Toast.LENGTH_SHORT).show();
            }
        });
        sandwichBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComboActivity.this,SandwichActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        hotDogsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComboActivity.this,HotDogsActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        chiliBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComboActivity.this,ChilliActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        specialBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComboActivity.this,SpecialActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        saladBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComboActivity.this,SaladActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        checkoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComboActivity.this,CheckoutActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });

        // Order Button
        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Combo #1\t\t\t\t$7.00\n";
                total+=7;
            }
        });
        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Combo #2\t\t\t\t$7.00\n";
                total+=7;
            }
        });
        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Combo #3\t\t\t\t$7.00\n";
                total+=7;
            }
        });
        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Combo #4\t\t\t\t$7.00\n";
                total+=7;
            }
        });
        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Ritz Combo Basket\t\t\t\t$9.00\n";
                total+=9;
            }
        });
        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Cool Deal\t\t\t\t$8.00\n";
                total+=8;
            }
        });
        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Itzy Ritzy\t\t\t\t$6.00\n";
                total+=6;
            }
        });
    }
}