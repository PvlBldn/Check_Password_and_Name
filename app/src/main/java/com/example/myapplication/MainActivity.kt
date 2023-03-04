package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.constance.Constance
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val result = bindingClass.edValue.text.toString()

            when (result) {

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DVORNIK_SUELDO}"
                    bindingClass.tvResult.text = if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD){
                    tempText
                    } else {
                        "Nevernyi parol"
                    }
                    }


                Constance.INGINER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Poluchite vashi ${Constance.INGINER_SUELDO}"
                    bindingClass.tvResult.text = if (bindingClass.edPassword.text.toString() == Constance.INGINER_PASSWORD){
                        tempText
                    } else {
                        "Nevernyi parol"
                    }


                }

                Constance.DVORNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Poluchite cashi ${Constance.DVORNIK_SUELDO}"
                    bindingClass.tvResult.text = if (bindingClass.edPassword.text.toString() == Constance.DVORNIK_PASSWORD){
                        tempText
                    } else {
                        "Nevernyi parol"
                    }

                }


            }
        }
    }


}


