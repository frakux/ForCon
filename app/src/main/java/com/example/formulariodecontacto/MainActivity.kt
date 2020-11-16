package com.example.formulariodecontacto

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import  android.widget.EditText
import androidx.annotation.RequiresApi
import java.sql.Date
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        var fechaNacimiento =""



        buttonFechaNacimiento.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {view,mYear, mMonth, mDay ->
                tVFechaNacimi.setText(""+mDay+"/"+(mMonth+1)+"/"+mYear)
                fechaNacimiento= ""+mDay+"/"+(mMonth+1)+"/"+mYear
            },year,month,day)
            dpd.show()

        }


        buttonSiguiente.setOnClickListener {
                var Nombre=textoNombre.text.toString()
                var Telefono=editTextPhone.text.toString()
                var Email=editTextTextEmailAddress2.text.toString()
                var Descripcion=textoDescripcion.text.toString()

                val confirmacionIntent = Intent(this, ConfirmacionDeDatos::class.java).apply {
                    putExtra("Nombre", Nombre)
                    putExtra("fechaNacimiento",fechaNacimiento)
                    putExtra("Telefono",Telefono)
                    putExtra("Email",Email)
                    putExtra("Descripcion",Descripcion)
                }
                startActivity(confirmacionIntent)

        }
    }
}

