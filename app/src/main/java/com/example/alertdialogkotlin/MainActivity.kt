package com.example.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val abrir_alert_dialog_main: Button = findViewById(R.id.abrir_alert_dialog_main)

        abrir_alert_dialog_main.setOnClickListener{
            // Cria uma instância do AlertDialog.Builder
            val builder = AlertDialog.Builder(this)
            // Define o título e a mensagem do AlertDialog
            builder.setTitle("Alert Dialog")
            builder.setMessage("Esse Alert Dialog foi desenvolvido na linguagem Kotlin!\n\nDeselvonvido por: Nataly Coelho Nogueira\nData: 04/09/2023")
            // Configura os botões "OK" e "Cancelar" e seus respectivos listeners
            builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                // Ação a ser realizada quando o botão "OK" é clicado
                // Por exemplo, você pode fechar o AlertDialog
                Toast.makeText(applicationContext , "Você clicou em OK!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            })
            builder.setNegativeButton("Cancelar", DialogInterface.OnClickListener { dialog, which ->
                // Ação a ser realizada quando o botão "Cancelar" é clicado
                // Por exemplo, você pode fechar o AlertDialog
                Toast.makeText(applicationContext , "Você clicou em CANCELAR!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            })
            // Cria o AlertDialog a partir do builder
            val alertDialog = builder.create()
            // Mostra o AlertDialog
            alertDialog.show()
        }
    }
}