package com.example.test_log_events;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    Button btn_add;
    FirebaseAnalytics mFirebaseAnalytics;
    Button btn_cash;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add=findViewById(R.id.add);
        btn_cash=findViewById(R.id.cash);
        mFirebaseAnalytics=FirebaseAnalytics.getInstance(this);

        btn_add.setOnClickListener(v -> {
            Bundle bundle=new Bundle();
            bundle.putString(FirebaseAnalytics.Param.ITEM_ID,"1");
            bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,"Mohadeseh");
            mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT,bundle);
        });

        btn_cash.setOnClickListener(v -> {
            Bundle bundle=new Bundle();
            bundle.putString("cash","cashButton");
            mFirebaseAnalytics.logEvent("cash_button",bundle);
        });
    }
}