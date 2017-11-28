package sampleapp.pmsdk.com.sampleapppmsdk;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pokkt.sdk.pocketmoney.avail.PMSdk;


public class SampleActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        Button showOfferwall = findViewById(R.id.showOfferwalls);
        showOfferwall.setOnClickListener(this);

        PMSdk.initializePMSdk("78374919acfa960412febddb66b3c8ec", ContextCompat.getColor(this, R.color.colorPrimary),ContextCompat.getColor(this, android.R.color.white),"App Zone");
    }

    @Override
    public void onClick(View view) {

        PMSdk.showPMSdkOfferWall(this);
    }
}
