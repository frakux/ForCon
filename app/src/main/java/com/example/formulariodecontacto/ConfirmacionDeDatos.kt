package com.example.formulariodecontacto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_confirmacion_de_datos.*

class ConfirmacionDeDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion_de_datos)

        val bundle=intent.extras
        val nombrecontacto= bundle?.getString("Nombre")
        val fechaNacimiento=bundle?.getString("fechaNacimiento")
        val telefonocontacto=bundle?.getString("Telefono")
        val emailcontacto=bundle?.getString("Email")
        val descripcioncontacto=bundle?.getString("Descripcion")
        setup(nombrecontacto?:"",fechaNacimiento?:"",telefonocontacto?:"",emailcontacto?:"",descripcioncontacto?:"")
    }

    private fun setup(nombrecontacto: String, fechaNacimiento:String,telefonocontacto:String,emailcontacto:String,descripcioncontacto:String)
    {
            textView2.text=nombrecontacto
            textView3.text="Fechas de Nacimiento: "+fechaNacimiento
            textView4.text="Tel: "+telefonocontacto
            textView5.text="Email: "+emailcontacto
            textView6.text="Descripcion: "+descripcioncontacto

        buttonback.setOnClickListener {
            onBackPressed()
        }
    }


}