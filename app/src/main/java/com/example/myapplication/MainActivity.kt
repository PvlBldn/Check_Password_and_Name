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
            bindingClass.imageView.visibility = View.VISIBLE

            when (result) {

                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SUELDO}"
                    if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD){
                    bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.egor)
                    } else {
                        bindingClass.tvResult.text = "Nevernyi parol"
                        bindingClass.imageView.setImageResource(R.drawable.net)
                    }
                    }


                Constance.INGINER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Poluchite vashi ${Constance.INGINER_SUELDO}"
                    if (bindingClass.edPassword.text.toString() == Constance.INGINER_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.andrey)
                    } else {
                        bindingClass.tvResult.text = "Nevernyi parol"
                        bindingClass.imageView.setImageResource(R.drawable.net)
                    }


                }

                Constance.DVORNIK -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Poluchite cashi ${Constance.DVORNIK_SUELDO}"
                    if (bindingClass.edPassword.text.toString() == Constance.DVORNIK_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.sergei)
                    } else {
                        bindingClass.tvResult.text = "Nevernyi parol"
                        bindingClass.imageView.setImageResource(R.drawable.net)
                    }

                }


            }
        }
    }


}


