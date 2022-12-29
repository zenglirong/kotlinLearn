package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //浮点类型
        //编辑器同样会根据赋值推断变量的类型
        val doubleNumber: Double = 3.1415928888
        val floatNumber: Float = 3.1415928888f//尾部加f或F显式表示这是一个Float类型的浮点数
        println("floatNumber:" + floatNumber)
        println("doubleNumbel:" + floatNumber)
    }
}