package com.example.abcd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    static int nCharVal = 65; //Starting with A
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView vText = (TextView)findViewById(R.id.sText);
        vText.setTextColor(Color.GREEN);
        String szString = (String)Character.toString((char)nCharVal);
        vText.setText(szString);
    }
  // @Override
  public void perform_action(View V)
   {
       TextView tv= (TextView) findViewById(R.id.sText);

       //alter text of textview widget
       nCharVal++;
       String szString = (String)Character.toString((char)nCharVal);

       tv.setText(szString);
       if (nCharVal-65 == 25)
       {
           nCharVal = 64;
       }

       //assign the textview forecolor https://developers.google.com/admob/android/quick-start#initialize_mobile_ads

       tv.setTextColor(Color.GREEN);
   }


}
