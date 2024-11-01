package com.example.feeltherush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  // Import for Log
import android.widget.Button  // Import for Button
import android.widget.EditText  // Import for EditText

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput : EditText

    lateinit var passwordInput : EditText

    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.Login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials", "Username : $username and Password : $password")



        }
    }
}