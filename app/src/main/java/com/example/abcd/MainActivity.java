package com.example.abcd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private AdView adView;
    static int nCharVal = 65; //Starting with A
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView vText = (TextView)findViewById(R.id.sText);
        vText.setTextColor(Color.GREEN);
        String szString = (String)Character.toString((char)nCharVal);
        vText.setText(szString);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
        // values/strings.xml.
        adView = findViewById(R.id.adView1);
        //AdRequest adRequest = new AdRequest.Builder().build();

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("0C3B2F16993B787DFF1BDBF88E4B8EDD")
                .build();
        //final .Builder builder = AdRequest.Builder.addTestDevice("0C3B2F16993B787DFF1BDBF88E4B8EDD");
        adView.loadAd(adRequest);
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

       //assign the textview forecolor https://developers.google.com/admob/android/quick-start#initialize_mobile_ads  ca-app-pub-9546661915028941~2419598217
       // ca-app-pub-9546661915028941/9910790018
       //https://apps.admob.com/v2/apps/2419598217/adunits/list?utm_source=internal&utm_medium=et&utm_campaign=helpcentrecontextualopt&utm_term=http%3A%2F%2Fgoo.gl%2F6Xkfcf&subid=ww-ww-et-amhelpv4
       //https://github.com/googleads/googleads-mobile-android-examples/blob/master/java/admob/BannerExample/app/src/main/AndroidManifest.xml

       tv.setTextColor(Color.GREEN);
   }


}
