package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class BelahKetupat : AppCompatActivity() {
    private lateinit var editDiagonal1: EditText
    private lateinit var editDiagonal2: EditText
    private lateinit var editSisi: EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas: TextView

    var Sisi: Double? = null
    var Diagonal1: Double? = null
    var Diagonal2: Double? = null
    var keliling: Double? = null
    var luas: Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belah_ketupat)

        editDiagonal1 = findViewById(R.id.etDiagonal1)
        editDiagonal2 = findViewById(R.id.etDiagonal2)
        editSisi = findViewById(R.id.etSisi)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener() {
            if (editSisi.getText().toString().trim().isEmpty()
                || editDiagonal1.getText().toString().trim().isEmpty()
                || editDiagonal2.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(this@BelahKetupat, "Form tidak boleh kosong!", Toast.LENGTH_SHORT).show()

            } else {
                Sisi = editSisi .getText().toString().toDouble()
                keliling = 4 * Sisi!!
                TVkeliling.setText(keliling.toString())
            }

        }
        btnluas.setOnClickListener {
            if (editSisi.getText().toString().trim().isEmpty()
                || editDiagonal1.getText().toString().trim().isEmpty()
                || editDiagonal2.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(this@BelahKetupat, "Form tidak boleh kosong!", Toast.LENGTH_SHORT)
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