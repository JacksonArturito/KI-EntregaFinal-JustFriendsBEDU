package com.example.justfriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class registerActivity : AppCompatActivity() {

    private lateinit var btnRegister2: MaterialButton
    private lateinit var regiName: TextInputEditText
    private lateinit var regiLastname: TextInputEditText
    private lateinit var regiPhone: TextInputEditText
    private lateinit var regiEmail: TextInputEditText
    private lateinit var regiPassword: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister2 = findViewById(R.id.btnRegister2)
        regiName = findViewById(R.id.registerUser)
        regiLastname = findViewById(R.id.registerLastname)
        regiPhone = findViewById(R.id.registerNumphone)
        regiEmail = findViewById(R.id.registerEmail)
        regiPassword = findViewById(R.id.registerPassw)

        val bundleR = intent.extras

        btnRegister2.setOnClickListener{
            val bundlereg = Bundle()

            if (regiName.getText()!!.isEmpty() || regiLastname.getText()!!.isEmpty() || regiEmail.getText()!!.isEmpty() || regiPassword.getText()!!.isEmpty()){
                Toast.makeText(applicationContext, "No pueden existir campos vacios", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(applicationContext, "Datos Ingresados", Toast.LENGTH_LONG).show()

                bundlereg.putString(USER_NAME, regiName.toString())
                bundlereg.putString(EMAIL, regiLastname.toString())
                bundlereg.putString(EMAIL, regiPhone.toString())
                bundlereg.putString(EMAIL, regiEmail.toString())
                bundlereg.putString(PASSWORD, regiPassword.toString())

                val intent =
                    Intent(this, principalScreenActivity::class.java).apply { putExtras(bundlereg) }

                startActivity(intent)
                //finish()
            }
        }
    }
}