package mx.edu.ittepic.tpdm_unidad1_ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var layu : LinearLayout?= null
    var usuar : EditText ?= null
    var contras : EditText ?= null
    var aceptar : Button ?= null
    var usuarios = arrayOf("toro","apus","toto","SIU","yoli")
    var contraseñas = arrayOf("12345","poj","a4s","CR7","pha")
    var aux = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgLogin = ImageView(this)
        layu = findViewById(R.id.linLayu)
        layu?.addView(imgLogin)

        usuar = findViewById(R.id.usuario)
        contras = findViewById(R.id.contraseña)
        aceptar = findViewById(R.id.btnEntrar)


        imgLogin.setImageResource(R.drawable.login)
        btnEntrar?.setOnClickListener {
            if (usuario?.text.toString().equals(usuarios.get(0)) && contraseña?.text.toString().equals(contraseñas.get(0))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.toro110)

            } else if (usuario?.text.toString().equals(usuarios.get(1)) && contraseña?.text.toString().equals(contraseñas.get(1))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.apus110)

            } else if (usuario?.text.toString().equals(usuarios.get(2)) && contraseña?.text.toString().equals(contraseñas.get(2))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.toto110)

            } else if (usuario?.text.toString().equals(usuarios.get(3)) && contraseña?.text.toString().equals(contraseñas.get(3))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.siuuu110)

            } else if (usuario?.text.toString().equals(usuarios.get(4)) && contraseña?.text.toString().equals(contraseñas.get(4))) {
                Toast.makeText(this, "ACEPTADO", Toast.LENGTH_LONG).show()
                imgLogin.setImageResource(R.drawable.yoli110)

            } else {
                var total = aux +1
                Toast.makeText(this, "RECHAZADO intento: "+total, Toast.LENGTH_LONG).show()
                aux++


                if (aux >= 3) {
                    Toast.makeText(this, "RECHAZADO"+'\n'+"Intento: "+aux, Toast.LENGTH_LONG).show()
                    finish()
                }
            }
        }
    }
}
