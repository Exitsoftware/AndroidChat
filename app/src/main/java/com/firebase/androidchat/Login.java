package com.firebase.androidchat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class Login extends AppCompatActivity {
    DB firebase = new DB();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Create Database

//        final Firebase mFirebaseRef = firebase.db.child("users");
//        final Firebase mFirebaseRef = firebase.db;

        Button btn_next = (Button) findViewById(R.id.btn_next);
        final EditText input_id = (EditText) findViewById(R.id.input_id);
        final EditText input_pw = (EditText) findViewById(R.id.input_pw);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = input_id.getText().toString();
                String pw = input_pw.getText().toString();

//                mFirebaseRef.createUser(id, pw, new Firebase.ResultHandler() {
//                    @Override
//                    public void onSuccess() {
//                        Toast.makeText(Login.this, "Success", Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onError(FirebaseError firebaseError) {
//                        Toast.makeText(Login.this, "Fail!" + firebaseError.toString(), Toast.LENGTH_LONG).show();
//                        System.out.println(firebaseError.toString());
//                    }
//                });
////                Toast.makeText(Login.this, id+", "+pw, Toast.LENGTH_SHORT).show();

                final Firebase mFirebaseRef = firebase.db.child("users").child(id);

                User user = new User(id,pw);
                mFirebaseRef.push().setValue(user);
                Toast.makeText(Login.this, "?", Toast.LENGTH_SHORT).show();


//                Intent intent = new Intent(Login.this, MainActivity.class);
//                startActivity(intent);
            }
        });




    }
}
