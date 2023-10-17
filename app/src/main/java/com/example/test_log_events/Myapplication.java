package com.example.test_log_events;

import android.app.Application;
import android.renderscript.ScriptGroup;


import com.google.firebase.BuildConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
public class Myapplication extends Application {

    FirebaseAnalytics firebaseAnalytics;
    @Override
    public void onCreate() {
        super.onCreate();
        firebaseAnalytics=FirebaseAnalytics.getInstance(this);
    }
}
