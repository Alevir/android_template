package com.example.elvor.template;

import android.app.Application;

import com.example.elvor.template.dagger.Injector;

public class TemplateApplication extends Application{
    @Override
    public void onCreate() {
        Injector.init(this);
        super.onCreate();

    }
}
