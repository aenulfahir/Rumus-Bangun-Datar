package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SegitigaSikuSiku : AppCompatActivity() {
    private lateinit var editSisi: EditText
    private lateinit var editTinggi: EditText
    private lateinit var editAlas: EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas: TextView

    var Sisi: Double? = null
    var Alas: Double? = null
    var Tinggi: Double? = null
    var keliling: Double? = null
    var luas: Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga_siku_siku)

        editSisi = findViewById(R.id.etSisi)
        editTinggi = findViewById(R.id.etTinggi)
        editAlas = findViewById(R.id.etAlas)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener(){
            if (editSisi.getText().toString().trim().isEmpty()
                ||(editTinggi.getText().toString().trim().isEmpty())
                ||(editAlas.getText().toString().trim().isEmpty())
            ){
                Toast.makeText(this@SegitigaSikuSiku,"Form tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }else{
                Alas = editAlas.getText().toString().toDouble()
                Sisi = editSisi.getText().toString().toDouble()
                Tinggi = editTinggi.getText().toString().toDouble()
                keliling = Tinggi!! + Sisi!! + Alas!!
                TVkeliling.setText(keliling.toString())
            }
        }
        btnluas.setOnClickListener(){
            if (editSisi.getText().toString().trim().isEmpty()
                ||(editTinggi.getText().toString().trim().isEmpty())
                ||(editAlas.getText().toString().trim().isEmpty())
            ){
                Toast.makeText(this@SegitigaSikuSiku,"Form tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }else{
                Alas = editAlas.getText().toString().toDouble()
                Tinggi = editTinggi.getText().toString().toDouble()
                luas = Tinggi!! * Alas!! /2
                TVluas.setText(luas.toString())
            }
        }
    }
}