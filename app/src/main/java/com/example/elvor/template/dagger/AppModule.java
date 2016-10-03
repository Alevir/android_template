package com.example.elvor.template.dagger;


import android.content.Context;

import com.bumptech.glide.Glide;
import com.example.elvor.template.R;
import com.example.elvor.template.backend.Api;
import com.example.elvor.template.ui.base.BaseActivity;
import com.example.elvor.template.ui.main.MainActivity;
import com.firebase.client.Firebase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                BaseActivity.class,
                MainActivity.class,
        },
        library = true
)
class AppModule {

    private Context appContext;

    AppModule(final Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    @Singleton
    Bus provideBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().create();
    }

    @Provides
    @Singleton
    Glide provideGlide() {
        return Glide.get(appContext);
    }

    @Provides
    @Singleton
    Context provideAppContext() {
        return appContext;
    }

    @Provides
    @Singleton
    Firebase provideFirebase(final Context appContext) {
        return new Firebase(appContext.getString(R.string.config_endpoint));
    }

    @Provides
    @Singleton
    Api provideApi(final Firebase firebase) {
        return new Api(firebase);
    }


}
