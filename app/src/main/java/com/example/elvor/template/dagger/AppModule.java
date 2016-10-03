package com.example.elvor.template.dagger;


import com.example.elvor.template.ui.base.BaseActivity;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                BaseActivity.class,
        },
        library = true
)


public class AppModule {
    @Provides
    @Singleton
    public Bus provideBus() {
        return new Bus();
    }


}
