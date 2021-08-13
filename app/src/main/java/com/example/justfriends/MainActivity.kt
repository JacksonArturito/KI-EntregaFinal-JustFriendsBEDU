package com.example.justfriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

const val USER_NAME = "com.example.bedu_project_application.USER_NAME"
const val EMAIL = "com.example.bedu_project_application.EMAIL"
const val PASSWORD = "com.example.bedu_project_application.PASSWORD"

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogIn: MaterialButton
    private lateinit var btnRegister: MaterialButton
    private lateinit var inputName: TextInputEditText
    private lateinit var inputEmail: TextInputEditText
    private lateinit var inputPassword: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogIn = findViewById(R.id.buttonLogin)
        btnRegister = findViewById(R.id.btnRegister1)
        inputName = findViewById(R.id.inputName)
        inputEmail = findViewById(R.id.inputEmail)
        inputPassword = findViewById(R.id.inputPassword)

        btnLogIn.setOnClickListener {
            val bundleMain = Bundle()

            if (inputName.getText().toString() == "usuario" && inputEmail.getText().toString()=="correo@email.com" && inputPassword.getText().toString() == "54321"){
                Toast.makeText(applicationContext, "Datos Ingresados", Toast.LENGTH_LONG).show()

                bundleMain.putString(USER_NAME, inputName.toString())
                bundleMain.putString(EMAIL, inputEmail.toString())
                bundleMain.putString(PASSWORD, inputPassword.toString())

                val intent =
                    Intent(this, principalScreenActivity::class.java).apply { putExtras(bundleMain) }

                startActivity(intent)
                //finish()

            } else {
                Toast.makeText(applicationContext, "Dato(s) Incorrectos", Toast.LENGTH_LONG).show()
            }
        }

        btnRegister.setOnClickListener{
            val bundleReg = Bundle()
            val intent = Intent(this, registerActivity::class.java).apply { putExtras(bundleReg) }

            startActivity(intent)
        }
    }
}