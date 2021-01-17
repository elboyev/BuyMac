package com.example.buymac;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    int quant=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(quant);
        displayPrice(quant*1299);
    }
    private void display(int numb){
        TextView text = (TextView) findViewById(R.id.soni);
        text.setText(""+numb);
    }
    private void displayPrice(int number){
        TextView pricetextview = (TextView) findViewById(R.id.narx);
        pricetextview.setText(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(number));
    }

    public void decrement(View view) {
        display(--quant);
    }

    public void increment(View view) {
        display(++quant);
    }
}