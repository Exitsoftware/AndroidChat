package com.firebase.androidchat;

import com.firebase.client.Firebase;

/**
 * Created by nayunhwan on 16. 1. 22..
 */
public class DB {
    private static final String FIREBASE_URL = "https://smashchat.firebaseio.com/";

    Firebase db;

    public DB(){
        db = new Firebase(FIREBASE_URL);
    }
}
