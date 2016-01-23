package com.firebase.androidchat;

/**
 * Created by nayunhwan on 16. 1. 22..
 */
public class User {
    String id;
    String pw;

    User(String id, String pw){
        this.id = id;
        this.pw = pw;
    }

    public String getId() {return this.id;}
    public String getPw() {return this.pw;}
}
