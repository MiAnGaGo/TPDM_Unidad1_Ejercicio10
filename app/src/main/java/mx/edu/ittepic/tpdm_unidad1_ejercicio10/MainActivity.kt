package mx.edu.ittepic.tpdm_unidad1_ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var usuario : EditText ?=null
    var contra : EditText ?= null
    var auten : Button?=null
    var us = arrayOf("toro","apus","toto","SIU","yoli")
    var con = arrayOf("12345","poj","a4s","CR7","pha")
    var c = 0
    var imgL : ImageView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usuario= findViewById(R.id.usuario)
        contra = findViewById(R.id.contra)
        auten = findViewById(R.id.auten)
        imgL = findViewById(R.id.imagen)



        auten?.setOnClickListener {
            if (usuario?.text.toString().equals(us.get(0)) && contra?.text.toString().equals(con.get(0))) {
                Toast.makeText(this, "SESION INICIADA", Toast.LENGTH_LONG).show()
            }
            else if (usuario?.text.toString().equals(us.get(1)) && contra?.text.toString().equals(con.get(1))) {
                Toast.makeText(this, "SESION INICIADA", Toast.LENGTH_LONG).show()
            } else if (usuario?.text.toString().equals(us.get(2)) && contra?.text.toString().equals(con.get(2))) {
                Toast.makeText(this, "SESION INICIADA", Toast.LENGTH_LONG).show()
            } else if (usuario?.text.toString().equals(us.get(3)) && contra?.text.toString().equals(con.get(3))) {
                Toast.makeText(this, "SESION CORRECTA", Toast.LENGTH_LONG).show()
            } else if (usuario?.text.toString().equals(us.get(4)) && contra?.text.toString().equals(con.get(4))) {
                Toast.makeText(this, "sesion correcta", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "ERROR", Toast.LENGTH_LONG).show()
                c++
                if(c>=3){
                    finish()
                }
            }
        }
    }
}
