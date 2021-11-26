package com.example.notes


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.notes.activities.MainActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //01. bikin fungsi kaya yg ada di layoutnya,apa yang kita butuhin
        val inputUsername: EditText = findViewById(R.id.username)
        val inputPassword: EditText = findViewById(R.id.password)
        val btnlogin: Button = findViewById(R.id.btnlogin)
        val username = "Twizzly"
        val password = "Twizzly"

        //02. Bikin if else statatement untuk menampilan toast kalo bener inputan namanya
        btnlogin.setOnClickListener {
            if (inputUsername.length() == 0) {
                val toast = Toast.makeText(this,"Harap masukkan username", Toast.LENGTH_SHORT)
                toast.show()
                if (inputPassword.length() == 0) {
                    val toast2 = Toast.makeText(this,"Harap masukkan password", Toast.LENGTH_SHORT)
                    toast2.show()}


            }else{
                //toString untuk convert ke tipe data string
                val inputusername = inputUsername.getText().toString()
                if(inputusername==username){
                    val toast = Toast.makeText(this,"Twizzly", Toast.LENGTH_SHORT)
                    toast.show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)




                }else{
                    val toast = Toast.makeText(this, "Username dan Password tidak terdaftar", Toast.LENGTH_SHORT)
                    toast.show()

                }

            }


            if (inputUsername.length() == 0) {
                val toast = Toast.makeText(this,"Harap masukkan password", Toast.LENGTH_SHORT)
                toast.show()

            }else{
                //toString untuk convert ke tipe data string
                val inputPassword = inputPassword.getText().toString()
                if(inputPassword==password){
                    val toast = Toast.makeText(this,"Selamat datang", Toast.LENGTH_SHORT)
                    toast.show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)


                }else{

                }
            }
        }
    }

}