package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SegitigaSamaSisi : AppCompatActivity() {

    private lateinit var editSisi: EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas: TextView

    var Sisi: Double? = null
    var SisiBagi2: Double? = null
    var Tinggi: Double? = null
    var keliling: Double? = null
    var luas: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga_sama_sisi)

        editSisi = findViewById(R.id.etSisi)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener(){
            if(editSisi.getText().toString().trim().isEmpty()){
                Toast.makeText(this@SegitigaSamaSisi, "Form tidak boleh kosong",Toast.LENGTH_SHORT).show()
            }else{
                Sisi = editSisi.getText().toString().toDouble()
                keliling = 3 * Sisi!!
                TVkeliling.setText(keliling.toString())

            }
        }

        btnluas.setOnClickListener(){
            if (editSisi.getText().toString().trim().isEmpty()){
                Toast.makeText(this@SegitigaSamaSisi, "Form tidak bolej kosong",Toast.LENGTH_SHORT).show()
            }else{
                Sisi = editSisi.getText().toString().trim().toDouble()
                SisiBagi2 = Sisi!! /2
                Tinggi = Math.sqrt(Math.pow(Sisi!!,2.0) - Math.pow(SisiBagi2!!,2.0))
                luas = Sisi!! * Tinggi!! /2
                TVluas.setText(luas.toString())
            }
        }
    }
}