package com.example.tugas1

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var pencetbtn : Button
    lateinit var bread : Button
    lateinit var milk : Button
    lateinit var cheese : Button
    lateinit var etName : EditText
    var harga = 0
    var hasil = 0
    var pilihan = String()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pencetbtn = findViewById(R.id.pencetbtn)
        bread = findViewById(R.id.btnroti)
        milk = findViewById(R.id.btnsusu)
        cheese = findViewById(R.id.btnkeju)
        etName = findViewById(R.id.et_name)

            bread.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                    harga = 10
                    pilihan = when(harga){
                        10 -> "roti"
                        12 -> "susu"
                        else -> "keju"
                    }
                }
            })
            milk.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                    harga = 12
                    pilihan = when(harga){
                        10 -> "roti"
                        12 -> "susu"
                        else -> "keju"
                    }
                }
            })

            cheese.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(v: View?) {
                    harga = 14
                    pilihan = when(harga){
                        10 -> "roti"
                        12 -> "susu"
                        else -> "keju"
                    }
                }
            })

            pencetbtn.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Yuk Pilih Mau Beli apa ?",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else {
                hasil = etName.text.toString().trim().toInt() * harga
                Toast.makeText(

                    applicationContext,
                    "Nah Kamu udah order "+ etName.text +" " + pilihan +
                            ", Kamu bayar ya jangan ngutang sebesar:" +" Rp. "+ hasil + ".000",

                    Toast.LENGTH_LONG
                ).show()
                etName.text = null
            }
        }
    }

}





