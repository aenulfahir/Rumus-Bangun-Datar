package com.example.tubesprakmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Trapesium : AppCompatActivity() {

    private lateinit var editSisiA: EditText
    private lateinit var editSisiB: EditText
    private lateinit var editSisi1: EditText
    private lateinit var editSisi2: EditText
    private lateinit var editTinggi: EditText
    private lateinit var btnkeliling: Button
    private lateinit var btnluas: Button
    private lateinit var TVkeliling: TextView
    private lateinit var TVluas: TextView

    var Sisi1: Double? = null
    var Sisi2: Double? = null
    var SisiA: Double? = null
    var SisiB: Double? = null
    var Tinggi: Double? = null
    var keliling: Double? = null
    var luas: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapesium)

        editSisi1 = findViewById(R.id.etSisi1)
        editSisi2 = findViewById(R.id.etSisi2)
        editSisiA = findViewById(R.id.etSisiA)
        editSisiB = findViewById(R.id.etSisiB)
        editTinggi = findViewById(R.id.etTinggi)
        btnkeliling = findViewById(R.id.btnKeliling)
        btnluas = findViewById(R.id.btnLuas)
        TVkeliling = findViewById(R.id.tvKeliling)
        TVluas = findViewById(R.id.tvLuas)

        btnkeliling.setOnClickListener() {
            if (editSisiA.getText().toString().trim().isEmpty()
                || editSisiB.getText().toString().trim().isEmpty()
                || editSisi1.getText().toString().trim().isEmpty()
                || editSisi2.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(this@Trapesium, "Form tidak boleh kosong!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                SisiA = editSisiA.getText().toString().toDouble()
                SisiB = editSisiB.getText().toString().toDouble()
                Sisi1 = editSisi1.getText().toString().toDouble()
                Sisi2 = editSisi2.getText().toString().toDouble()
                keliling = Sisi1!! + Sisi2!! + SisiA!! + SisiB!!
                TVkeliling.setText(keliling.toString())
            }
        }

        btnluas.setOnClickListener() {
            if (editSisiA.getText().toString().trim().isEmpty()
                || editSisiB.getText().toString().trim().isEmpty()
                || editTinggi.getText().toString().trim().isEmpty()
            ) {
                Toast.makeText(this@Trapesium, "Form tidak boleh kosong!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                SisiA = editSisiA.getText().toString().toDouble()
                SisiB = editSisiB.getText().toString().toDouble()
                Tinggi = editTinggi.getText().toString().toDouble()
                luas = (SisiA!! + SisiB!!) * Tinggi!! /2
                TVluas.setText(luas.toString())
            }

        }
    }
}
