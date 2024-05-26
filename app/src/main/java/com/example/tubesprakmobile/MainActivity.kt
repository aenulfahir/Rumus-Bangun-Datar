package com.example.tubesprakmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnbelahketupat: Button
    private lateinit var btnlayanglayang: Button
    private lateinit var btnlingkaran: Button
    private lateinit var btnpersegi: Button
    private lateinit var btnpersegipanjang: Button
    private lateinit var btnsegitigasamakaki: Button
    private lateinit var btnsegitigasamasisi: Button
    private lateinit var btnsegitigasikusiku: Button
    private lateinit var btntrapesium: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnbelahketupat =findViewById(R.id.btnbelahketupat)
        btnlayanglayang= findViewById(R.id.btnlayanglayang)
        btnlingkaran= findViewById(R.id.btnlingkaran)
        btnpersegi= findViewById(R.id.btnpersegi)
        btnpersegipanjang= findViewById(R.id.btnpersegipanjang)
        btnsegitigasamakaki= findViewById(R.id.btnsegitigasamakaki)
        btnsegitigasamasisi= findViewById(R.id.btnsegitigasamasisi)
        btnsegitigasikusiku= findViewById(R.id.btnsegitigasikusiku)
        btntrapesium= findViewById(R.id.btntrapesium)

        btnbelahketupat.setOnClickListener {
           val intent = Intent(this,BelahKetupat::class.java)
            startActivity(intent)
        }
        btnlayanglayang.setOnClickListener {
            val intent = Intent(this,LayangLayang::class.java)
            startActivity(intent)
        }
        btnlingkaran.setOnClickListener {
            val intent = Intent(this,Lingkaran::class.java)
            startActivity(intent)
        }
        btnpersegi.setOnClickListener {
            val intent = Intent(this,Persegi::class.java)
            startActivity(intent)
        }
        btntrapesium.setOnClickListener {
            val intent = Intent(this,Trapesium::class.java)
            startActivity(intent)
        }
        btnpersegipanjang.setOnClickListener {
            val intent = Intent(this,PersegiPanjang::class.java)
            startActivity(intent)
        }
        btnsegitigasamakaki.setOnClickListener {
            val intent = Intent(this,SegitigaSamaKaki::class.java)
            startActivity(intent)
        }
        btnsegitigasamasisi.setOnClickListener {
            val intent = Intent(this,SegitigaSamaSisi::class.java)
            startActivity(intent)
        }
        btnsegitigasikusiku.setOnClickListener {
            val intent = Intent(this,SegitigaSikuSiku::class.java)
            startActivity(intent)
        }

    }
}
