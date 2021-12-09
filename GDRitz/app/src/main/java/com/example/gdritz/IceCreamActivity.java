package com.example.gdritz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class IceCreamActivity extends AppCompatActivity {

    private Button menuBTN;
    private Button checkoutBTN;
    public double total;
    private RadioGroup sizeRG;
    private RadioButton smallRB;
    private RadioButton mediumRB;
    private RadioButton largeRB;
    private Button addToCartBTN;
    private CheckBox scoopsCB;
    private CheckBox shakeCB;
    private CheckBox maltCB;
    private CheckBox bananaSplitCB;
    private CheckBox pintCB;
    private CheckBox quartCB;
    private CheckBox vanillaCB;
    private CheckBox cookieDoughCB;
    private CheckBox birthdayCakeCB;
    private CheckBox pbCB;
    private CheckBox chocolateCB;
    private CheckBox strawberryCB;
    private CheckBox chocoChipCB;
    private CheckBox butterPecanCB;
    private CheckBox butterscotchCB;
    private CheckBox carmelCB;
    public String order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icecream_activity);

        order=getIntent().getStringExtra("order");
        total=Double.parseDouble(getIntent().getStringExtra("total"));

        menuBTN = findViewById(R.id.menuBTN);
        checkoutBTN= findViewById(R.id.checkoutBTN);
        sizeRG = findViewById(R.id.sizeRG);
        smallRB = findViewById(R.id.singleRB);
        mediumRB = findViewById(R.id.doubleRB);
        largeRB = findViewById(R.id.tripleRB);
        addToCartBTN = findViewById(R.id.addToCartBTN);
        scoopsCB=findViewById(R.id.scoopsCB);
        shakeCB=findViewById(R.id.shakeCB);
        maltCB=findViewById(R.id.maltCB);
        bananaSplitCB=findViewById(R.id.bananaSplitCB);
        pintCB=findViewById(R.id.pintCB);
        quartCB=findViewById(R.id.quartCB);
        vanillaCB=findViewById(R.id.vanillaCB);
        cookieDoughCB=findViewById(R.id.cookieDoughCB);
        birthdayCakeCB=findViewById(R.id.birthdayCB);
        pbCB=findViewById(R.id.pBCB);
        chocolateCB=findViewById(R.id.chocolateCB);
        strawberryCB=findViewById(R.id.strawberryCB);
        chocoChipCB=findViewById(R.id.ChocolateChipCB);
        butterPecanCB=findViewById(R.id.butterPecanCB);
        butterscotchCB=findViewById(R.id.butterscotchCB);
        carmelCB=findViewById(R.id.carmelCB);



        menuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String ui = String.valueOf(secondUI.getText());
                Intent i = new Intent(IceCreamActivity.this,ComboActivity.class);
//                i.putExtra("input",valueOfIntent);
//                i.putExtra("input2",ui);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });
        checkoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String ui = String.valueOf(secondUI.getText());
                Intent i = new Intent(IceCreamActivity.this,CheckoutActivity.class);
//                i.putExtra("input",valueOfIntent);
//                i.putExtra("input2",ui);
                i.putExtra("order",order);
                i.putExtra("total",Double.toString(total));
                startActivity(i);
            }
        });

        addToCartBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //quick example on checkboxes
                if (bananaSplitCB.isChecked()){
                    //Toast.makeText(which activity, message,length).show()
                    //Toast.makeText(MainActivity.this,"anchoives", Toast.LENGTH_SHORT).show();
                    total+=6.25;
                    order+="Banana Split\t\t\t\t$6.25\n";
                }

                else if(pintCB.isChecked()){
                    total+=7.00;
                    if(vanillaCB.isChecked()){
                        order+= "Vanilla Pint\t\t\t\t$7.00\n";
                    }
                    else if(cookieDoughCB.isChecked()){
                        order+="Cookie Dough Pint\t\t\t\t$7.00\n";
                    }
                    else if(birthdayCakeCB.isChecked()){
                        order+="Birthday Cake Pint\t\t\t\t$7.00\n";
                    }
                    else if(pbCB.isChecked()){
                        order+="Peanut Butter Pint\t\t\t\t$7.00\n";
                    }
                    else if(chocolateCB.isChecked()){
                        order+="Chocolate Pint\t\t\t\t$7.00\n";
                    }
                    else if(strawberryCB.isChecked()){
                        order+="Strawberry Pint\t\t\t\t$7.00\n";
                    }
                    else if(chocoChipCB.isChecked()){
                        order+="Chocolate Chip Pint\t\t\t\t$7.00\n";
                    }
                    else if(butterPecanCB.isChecked()){
                        order+="Butter Pecan Pint\t\t\t\t$7.00\n";
                    }
                    else if(butterscotchCB.isChecked()){
                        order+="Butterscotch Pint\t\t\t\t$7.00\n";
                    }
                    else if(carmelCB.isChecked()){
                        order+="Carmel Pint\t\t\t\t$7.00\n";
                    }


                }
                else if(quartCB.isChecked()){
                    total+=10.00;
                    if(vanillaCB.isChecked()){
                        order+= "Vanilla Quart\t\t\t\t$10.00\n";
                    }
                    else if(cookieDoughCB.isChecked()){
                        order+="Cookie Dough Quart\t\t\t\t$10.00\n";
                    }
                    else if(birthdayCakeCB.isChecked()){
                        order+="Birthday Cake Quart\t\t\t\t$10.00\n";
                    }
                    else if(pbCB.isChecked()){
                        order+="Peanut Butter Quart\t\t\t\t$10.00\n";
                    }
                    else if(chocolateCB.isChecked()){
                        order+="Chocolate Quart\t\t\t\t$10.00\n";
                    }
                    else if(strawberryCB.isChecked()){
                        order+="Strawberry Quart\t\t\t\t$10.00\n";
                    }
                    else if(chocoChipCB.isChecked()){
                        order+="Chocolate Chip Quart\t\t\t\t$10.00\n";
                    }
                    else if(butterPecanCB.isChecked()){
                        order+="Butter Pecan Quart\t\t\t\t$10.00\n";
                    }
                    else if(butterscotchCB.isChecked()){
                        order+="Butterscotch Quart\t\t\t\t$10.00\n";
                    }
                    else if(carmelCB.isChecked()){
                        order+="Carmel Quart\t\t\t\t$10.00\n";
                    }

                }
                else if(scoopsCB.isChecked()){
                    addSizeToCart("scoop");
                }
                else if(shakeCB.isChecked()){
                    addSizeToCart("shake");
                }
                else if(maltCB.isChecked()){
                    addSizeToCart("malt");
                }
                else{
                    Toast.makeText(IceCreamActivity.this, "Choose a type", Toast.LENGTH_SHORT).show();
                }



            }
        });




        sizeRG.setOnCheckedChangeListener((radioGroup, id) -> {
            //get the selected Radio Button
            RadioButton rb = (RadioButton) sizeRG.findViewById(id);
        });




    }
    public void addSizeToCart(String type){
        double price = 0;
        Log.d("RadioButton Test", "triggered");
        int selectedId = sizeRG.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(IceCreamActivity.this, "Choose a size", Toast.LENGTH_SHORT).show();
        }
        else {
            RadioButton radioButton = (RadioButton) sizeRG.findViewById(selectedId);
            Toast.makeText(IceCreamActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
            if (radioButton.getText().equals("Single Scoop/Small")) {
                total += 5;
                price=5.00;
            } else if (radioButton.getText().equals("Double Scoop/Medium")) {
                total += 6;
                price=6.00;
            } else {
                total += 7;
                price=7.00;
            }
            if(vanillaCB.isChecked()){
                order+= "Vanilla "+radioButton.getText()+type;
            }
            else if(cookieDoughCB.isChecked()){
                order+="Cookie Dough "+radioButton.getText()+type;
            }
            else if(birthdayCakeCB.isChecked()){
                order+="Birthday Cake "+radioButton.getText()+type;
            }
            else if(pbCB.isChecked()){
                order+="Peanut Butter "+radioButton.getText()+type;
            }
            else if(chocolateCB.isChecked()){
                order+="Chocolate "+radioButton.getText()+type;
            }
            else if(strawberryCB.isChecked()){
                order+="Strawberry "+radioButton.getText()+type;
            }
            else if(chocoChipCB.isChecked()){
                order+="Chocolate Chip "+radioButton.getText()+type;
            }
            else if(butterPecanCB.isChecked()){
                order+="Butter Pecan "+radioButton.getText()+type;
            }
            else if(butterscotchCB.isChecked()){
                order+="Butterscotch "+radioButton.getText()+type;
            }
            else if(carmelCB.isChecked()){
                order+="Carmel "+radioButton.getText()+type;
            }
        }
    }




}
