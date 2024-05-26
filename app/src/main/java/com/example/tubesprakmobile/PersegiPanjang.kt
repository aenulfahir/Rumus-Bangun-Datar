package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class PersegiPanjang : AppCompatActivity() {
    private lateinit var editpanjang: EditText
    private lateinit var editlebar:EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas:TextView

    var panjang: Double? = null
    var lebar: Double? = null
    var Keliling: Double? =null
    var luas: Double? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)


        editpanjang = findViewById(R.id.etpanjang)
        editlebar = findViewById(R.id.etlebar)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener{
            if (editpanjang.getText().toString().trim().isEmpty()
                || editlebar.getText().toString().trim().isEmpty()){
                Toast.makeText(this@PersegiPanjang, "Formtidak boleh kosong",Toast.LENGTH_SHORT).show();

            }else{
                panjang = editpanjang.getText().toString().toDouble()
                lebar = editlebar.getText().toString().toDouble()
                Keliling=2 * (panjang!! * lebar!!)
                TVkeliling.setText(Keliling.toString())

            }
        }
        btnluas.setOnClickListener{
            if (editpanjang.getText().toString().trim().isEmpty()
                ||editlebar.getText().toString().trim().isEmpty()){
                Toast.makeText(this@PersegiPanjang, "Form tidak boleh kosong",Toast.LENGTH_SHORT).show();

            }else{
                panjang=editpanjang.getText().toString().toDouble()
                lebar=editlebar.getText().toString().toDouble()
                luas=panjang!! * lebar!!
                TVluas.setText(luas.toString())
            }
        }
    }
}