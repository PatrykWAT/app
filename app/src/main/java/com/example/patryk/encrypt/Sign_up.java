package com.example.patryk.encrypt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void signup_click(View view){
        EditText number = (EditText)findViewById(R.id.number);
        // wysłanie na serwer telefonu
        //Message message = new Message();

        Intent intent = new Intent(Sign_up.this, main_menu.class);
        try {
            Socket socket = Socket_Class.SingletonHelper.getInstance();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            objectOutputStream.writeObject(new Message());


        } catch (IOException e) {
           e.printStackTrace();
        }

        startActivity(intent);


    }
}
