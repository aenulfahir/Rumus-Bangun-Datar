package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Lingkaran : AppCompatActivity() {
    private lateinit var editjarijari: EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas: TextView

    var jarijari: Double? = null
    var Keliling: Double? =null
    var luas: Double? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)


        editjarijari = findViewById(R.id.etjarijari)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener{
            if (editjarijari.getText().toString().trim().isEmpty()){
                Toast.makeText(this@Lingkaran, "Formtidak boleh kosong",Toast.LENGTH_SHORT).show();

            }else{
                jarijari = editjarijari.getText().toString().toDouble()
                Keliling=2 * 3.14 * jarijari!!
                TVkeliling.setText(Keliling.toString())

            }
        }
        btnluas.setOnClickListener{
            if (editjarijari.getText().toString().trim().isEmpty()){
                Toast.makeText(this@Lingkaran, "Form tidak boleh kosong",Toast.LENGTH_SHORT).show();

            }else{
                jarijari=editjarijari.getText().toString().toDouble()
                luas=3.14 * jarijari!! * jarijari!!
                TVluas.setText(luas.toString())
            }
        }
    }
}