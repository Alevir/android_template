package com.example.elvor.template;

import android.app.Application;

import com.example.elvor.template.dagger.Injector;
import com.firebase.client.Firebase;
import com.google.firebase.database.FirebaseDatabase;

public class TemplateApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Injector.init(this);
        Firebase.setAndroidContext(this);

    }
}
