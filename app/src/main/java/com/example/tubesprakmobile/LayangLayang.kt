package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LayangLayang : AppCompatActivity() {
    private lateinit var editDiagonal1: EditText
    private lateinit var editDiagonal2: EditText
    private lateinit var editSisipendek: EditText
    private lateinit var editSisipanjang: EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas: TextView

    var SisiPendek: Double? = null
    var SisiPanjang: Double? = null
    var Diagonal1: Double? = null
    var Diagonal2: Double? = null
    var keliling: Double? = null
    var luas: Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layang_layang)

        editDiagonal1 = findViewById(R.id.etDiagonal1)
        editDiagonal2 = findViewById(R.id.etDiagonal2)
        editSisipendek= findViewById(R.id.etSisiPendek)
        editSisipanjang = findViewById(R.id.etSisiPanjang)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener() {
            if (editSisipanjang.getText().toString().trim().isEmpty()
                || editSisipendek.getText().toString().trim().isEmpty()
                || editDiagonal1.getText().toString().trim().isEmpty()
                || editDiagonal2.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(this@LayangLayang, "Form tidak boleh kosong!", Toast.LENGTH_SHORT).show()

            } else {
                SisiPendek = editSisipendek .getText().toString().toDouble()
                SisiPanjang = editSisipanjang.getText().toString().toDouble()
                keliling = 2 * (SisiPendek!!+ SisiPanjang!!)
                TVkeliling.setText(keliling.toString())
            }

        }
        btnluas.setOnClickListener {
            if (editSisipendek.getText().toString().trim().isEmpty()
                ||editSisipanjang.getText().toString().trim().isEmpty()
                || editDiagonal1.getText().toString().trim().isEmpty()
                || editDiagonal2.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(this@LayangLayang, "Form tidak boleh kosong!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Diagonal1 = editDiagonal1.getText().toString().toDouble()
                Diagonal2 = editDiagonal2.getText().toString().toDouble()
                luas = Diagonal1!! * Diagonal2!! / 2
                TVluas.setText(luas.toString())
            }
        }
    }
}