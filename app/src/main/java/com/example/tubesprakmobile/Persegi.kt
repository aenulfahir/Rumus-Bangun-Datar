package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Persegi : AppCompatActivity() {
    private lateinit var editsisi: EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas:TextView

    var sisipersegi: Double? = null
    var Keliling: Double? =null
    var luas: Double? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)


        editsisi = findViewById(R.id.etsisi)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener{
            if (editsisi.getText().toString().trim().isEmpty()){
                Toast.makeText(this@Persegi, "Sisi tidak boleh kosong",Toast.LENGTH_SHORT).show();

            }else{
                sisipersegi = editsisi.getText().toString().toDouble()
                Keliling=sisipersegi!! * 4
                TVkeliling.setText(Keliling.toString())

            }
        }
        btnluas.setOnClickListener{
            if (editsisi.getText().toString().trim().isEmpty()){
                Toast.makeText(this@Persegi, "Sisi tidak boleh kosong",Toast.LENGTH_SHORT).show();

            }else{
                sisipersegi=editsisi.getText().toString().toDouble()
                luas=sisipersegi!! * sisipersegi!!
                TVluas.setText(luas.toString())
            }
        }
    }
}