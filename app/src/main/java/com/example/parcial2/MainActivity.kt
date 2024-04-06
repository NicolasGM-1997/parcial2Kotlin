package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var campo : EditText
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campo = findViewById(R.id.campo)
        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            val texto : String = campo.getText().toString()
            val intent : Intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putSerializable("texto-nuevo", texto)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}