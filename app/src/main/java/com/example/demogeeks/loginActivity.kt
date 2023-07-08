package com.example.demogeeks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

lateinit var edtEmail:EditText
lateinit var edtPassword:EditText
lateinit var tvSignUp:Button
lateinit var strEmail:String
lateinit var strPassword:String
class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtEmail= findViewById(R.id.edtEmail)
        edtPassword= findViewById(R.id.edtPassword)
        tvSignUp=findViewById(R.id.tvSignUp)
    }
    private fun InputDatatype(){

        tvSignUp.setOnClickListener(){
            strEmail= edtEmail.text.toString()
            strPassword= edtPassword.text.toString()
            Toast.makeText(this, strEmail+" "+ strPassword, Toast.LENGTH_LONG).show()
        }
    }
}