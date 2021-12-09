package com.example.gdritz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class SandwichActivity extends AppCompatActivity {
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
    private Button cBurgerBTN;
    private CheckBox checkBoxCBurgerT;
    private CheckBox checkBoxCBurgerL;
    private CheckBox checkBoxCBurgerO;
    private CheckBox checkBoxCBurgerC;
    private CheckBox checkBoxCBurgerP;
    private Button dRitzBTN;
    private CheckBox checkBoxDRitzT;
    private CheckBox checkBoxDRitzL;
    private CheckBox checkBoxDRitzP;
    private CheckBox checkBoxDRitzC;
    private CheckBox checkBoxDRitzO;
    private Button fSandwichBTN;
    private CheckBox checkBoxFSandwichT;
    private CheckBox checkBoxFSandwichL;
    private CheckBox checkBoxFSandwichP;
    private CheckBox checkBoxFSandwichO;
    private CheckBox checkBoxFSandwichC;
    private Button cGrillBTN;
    private CheckBox checkBoxCGrillT;
    private CheckBox checkBoxCGrillL;
    private CheckBox checkBoxCGrillP;
    private CheckBox checkBoxCGrillO;
    private CheckBox checkBoxCGrillC;
    private Button pBjBTN;

    public String order;
    public double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sandwiches_activity);

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
        cBurgerBTN = findViewById(R.id.cBurgerBTN);
        dRitzBTN = findViewById(R.id.dRitzBTN);
        fSandwichBTN = findViewById(R.id.fSandwichBTN);
        cGrillBTN = findViewById(R.id.cGrillBTN);
        pBjBTN = findViewById(R.id.pBjBTN);


        //Side buttons
        iceCreamBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SandwichActivity.this,IceCreamActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        comboBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SandwichActivity.this,ComboActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        sandwichBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You're already on the Sandwich Menu!", Toast.LENGTH_SHORT).show();
            }
        });
        hotDogsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SandwichActivity.this,HotDogsActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        chiliBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SandwichActivity.this,ChilliActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        specialBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SandwichActivity.this,SpecialActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        saladBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SandwichActivity.this,SaladActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        checkoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SandwichActivity.this,CheckoutActivity.class);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });

        // Order Button
        cBurgerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Hamburger\t\t\t\t$4.00\n";
                total+=4;
            }

        });
        dRitzBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Double Ritz\t\t\t\t$5.50\n";
                total+=5.5;
            }
        });
        fSandwichBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Fish Sandwich\t\t\t\t$4.00\n";
                total+=4;
            }
        });
        cGrillBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"Chicken Grill\t\t\t\t$6.00\n";
                total+=6;
            }
        });
        pBjBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order=order+"World's Best PB&J\t\t\t\t$5.00\n";
                total+=5;
            }
        });
    }
}