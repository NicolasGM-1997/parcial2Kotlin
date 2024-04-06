package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var mostrar : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mostrar = findViewById(R.id.mostrar)
        setContentView(R.layout.activity_main2)
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            val texto : String = bundle.getSerializable("texto").toString()
            mostrar.setText(texto)
        }
    }
}