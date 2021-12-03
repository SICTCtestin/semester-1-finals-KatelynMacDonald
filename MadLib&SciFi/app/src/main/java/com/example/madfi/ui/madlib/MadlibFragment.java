package com.example.madfi.ui.madlib;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.madfi.R;

public class MadlibFragment extends Fragment {
    //Defining the widget variables
    EditText Input1TXT;
    EditText Input2TXT;
    EditText Input3TXT;
    EditText Input4TXT;
    EditText Input5TXT;
    EditText Input6TXT;
    EditText Input7TXT;
    EditText Input8TXT;
    TextView Input1LBL;
    TextView Input2LBL;
    TextView Input3LBL;
    TextView Input4LBL;
    TextView Input5LBL;
    TextView Input6LBL;
    TextView Input7LBL;
    TextView Input8LBL;
    Button generatorBTN;
    TextView output;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_madlib,container,false);

        //findViewById is a method of View

        Input1TXT= rootView.findViewById(R.id.input1TXT);

        Input2TXT= rootView.findViewById(R.id.input2TXT);
        Input3TXT= rootView.findViewById(R.id.input3TXT);
        Input4TXT= rootView.findViewById(R.id.input4TXT);
        Input5TXT= rootView.findViewById(R.id.input5TXT);
        Input6TXT= rootView.findViewById(R.id.input6TXT);
        Input7TXT= rootView.findViewById(R.id.input7TXT);
        Input8TXT= rootView.findViewById(R.id.input8TXT);
        Input1LBL= rootView.findViewById(R.id.input1LBL);
        Input2LBL= rootView.findViewById(R.id.input2LBL);
        Input3LBL= rootView.findViewById(R.id.input3LBL);
        Input4LBL= rootView.findViewById(R.id.input4LBL);
        Input5LBL= rootView.findViewById(R.id.input5LBL);
        Input6LBL= rootView.findViewById(R.id.input6LBL);
        Input7LBL= rootView.findViewById(R.id.input7LBL);
        Input8LBL= rootView.findViewById(R.id.input8LBL);

        generatorBTN=rootView.findViewById(R.id.generator);
        output = rootView.findViewById(R.id.output);


        //utilize an onClickListener to connect to the button
        generatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                generate();
            }
        });
        

        return rootView;

    }


    private void setContentView(int activity_main) {
    }

    //generate the sci fi name
    private void generate() {

        String input1 = String.valueOf(Input1TXT.getText());
        String input2 = String.valueOf(Input2TXT.getText());
        String input3 = String.valueOf(Input3TXT.getText());
        String input4 = String.valueOf(Input4TXT.getText());
        String input5 = String.valueOf(Input5TXT.getText());
        String input6 = String.valueOf(Input6TXT.getText());
        String input7 = String.valueOf(Input7TXT.getText());
        String input8 = String.valueOf(Input8TXT.getText());

        //removes all the text inputs and the labels so that you can fully read the story
        Input1TXT.setVisibility(View.GONE);
        Input2TXT.setVisibility(View.GONE);
        Input3TXT.setVisibility(View.GONE);
        Input4TXT.setVisibility(View.GONE);
        Input5TXT.setVisibility(View.GONE);
        Input6TXT.setVisibility(View.GONE);
        Input7TXT.setVisibility(View.GONE);
        Input8TXT.setVisibility(View.GONE);
        Input1LBL.setVisibility(View.GONE);
        Input2LBL.setVisibility(View.GONE);
        Input3LBL.setVisibility(View.GONE);
        Input4LBL.setVisibility(View.GONE);
        Input5LBL.setVisibility(View.GONE);
        Input6LBL.setVisibility(View.GONE);
        Input7LBL.setVisibility(View.GONE);
        Input8LBL.setVisibility(View.GONE);



        //generate a random number to choose which madlib to use
        int num = (int) (Math.random() * 3);


        //print out a madlib

        if (num == 0) {
            output.setText(String.format("The majestic %s has roamed the forests of %s for thousands of years. Today, she wanders in search of %s. She must find food to survive. While hunting for %s, she found a/an %s hidden behind a %s. She has never seen anything like this before. What will she do? With the device in her teeth, she tries to %s, but nothing happens. She takes it back to her family. When her family sees it the device becomes %s, and the family decides to put it back where they found it.", input1, input2, input3, input4, input5, input6, input7, input8));
        } else if (num == 1) {
            output.setText(String.format("I woke up to the %s smell of %s roasting downstairs. I ran down the stairs to see if I could help %s the dinner. My mom said, 'See if %s needs a fresh %s.' So I carried a tray of glasses full of %s into the %s room. When I got there, I couldn't believe my eyes! It was %s around the room! ", input1, input2, input3, input4, input5, input6, input7, input8));
        } else {
            output.setText(String.format("Yesterday, I went to the beach, I had such a %s time! When I arrived to the beach I couldn't help but notice the %s sand. My friend loved my %s bathing suit I was wearing. I looked at the ocean and couldn't believe my eyes! I saw %s swimming around! I wanted to go swimming with them but I was afraid they were going to %s me! Instead I decided to build a %s castle. I used a shovel,pail,and %s to help me build it. The sun started to set, and it was time to go home. I had the %s time at the beach!", input1, input2, input3, input4, input5, input6, input7, input8));
        }


    }

}
