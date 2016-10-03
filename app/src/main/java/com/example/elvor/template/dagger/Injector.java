package com.example.elvor.template.dagger;


import android.content.Context;

import dagger.ObjectGraph;

public class Injector {
    private static ObjectGraph objectGraph;



    public static void init(final Context appContext) {
        final AppModule appModule = new AppModule(appContext);
        objectGraph = ObjectGraph.create(appModule);
    }


    public static void inject(final Object object) {
        objectGraph.inject(object);
    }
}
