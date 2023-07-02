package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    class Numbers{
        int num;

        //Perfect Square
        public boolean isPerfectsquare( ){
            int sqRoot = (int)Math.sqrt(num);
            if(sqRoot*sqRoot ==num){
                return true ;
                }else {
                return false;
            }
        }
        public boolean isPerfectsquare(int num ){
            int sqRoot = (int)Math.sqrt(num);
            if(sqRoot*sqRoot ==num){
                return true ;
            }else {
                return false;
            }
        }
        public boolean isFibonacciNumber(){
            return isPerfectsquare(5*num*num+4) || isPerfectsquare( 5*num*num-4);

        }
    }
    public void onButtonClick(View view)
    {
        EditText editText = findViewById(R.id.editTextTextPersonName);
        Numbers myNum = new Numbers();
        myNum.num = Integer.parseInt(editText.getText().toString());
        String message = editText.getText().toString();
        if (myNum.isPerfectsquare() && myNum.isFibonacciNumber()) {
            message += "is Square and Fibonacci";
        } else if (myNum.isPerfectsquare()) {
            message += " is Square not fibonacci";
        } else if (myNum.isFibonacciNumber()) {
            message += "is Fibonacci but not square ";
        }else {
            message += "is neither fibonacci nor square";
        }
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}