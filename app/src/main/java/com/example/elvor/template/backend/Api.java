package com.example.elvor.template.backend;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import retrofit2.Retrofit;


public class Api {
    Retrofit rest;

    public Api(final Firebase firebase) {
        firebase.child("apiEndpoint").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                rest = new Retrofit.Builder().baseUrl(dataSnapshot.getValue().toString()).build();
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
}
