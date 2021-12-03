package com.example.madfi.ui.number;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.madfi.R;

public class GuessNumberFragment extends Fragment {

    private SeekBar numberGuess;
    private TextView valueOfGuess;
    private TextView strikes;
    private Button guessButton;
    int randoInt=(int) (Math.random()*100);
    int strikesNum=5;
    int points=0;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_number, container, false);

        numberGuess= rootView.findViewById(R.id.seekBar);
        valueOfGuess=rootView.findViewById(R.id.numberTXT);
        strikes=rootView.findViewById(R.id.strikes);
        guessButton=rootView.findViewById(R.id.compare);


        numberGuess.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                valueOfGuess.setText(Integer.toString(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guessNumber();
            }
        });

        return rootView;

    }
    private void guessNumber(){
        int guess = numberGuess.getProgress();
        if (strikesNum!=0){
            if (guess==randoInt){
                points=((strikesNum)*5)+50;
                strikes.setText("That's correct!!!\nYour points are "+points);
            }
            else if(guess>randoInt){
                strikes.setText("That is too high. Please try again\nYou have "+strikesNum+" tries left");
                strikesNum-=1;

            }
            else{

                strikes.setText("That is too low. Please try again\nYou have "+(strikesNum-1)+" tries left");
                strikesNum-=1;
            }
        }
        else{
            strikes.setText("You are out of tries. Game over\nThe number was"+randoInt);
            guessButton.setVisibility(View.GONE);

        }


    }


    }
