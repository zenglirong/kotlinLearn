package com.example.app.lesson

import kotlin.system.exitProcess

class Caculator2 {


}

fun main() {
    while (true) {
        println("========请输入你的表达式=======")
        val input: String? = readLine()
        try {
            input?.let {
                val ret: String = calculate(it)
                //1+1=2
                println("${input}=${ret}")
                println("是否继续使用(y/n)")
                val cmd: String? = readLine()
                cmd?.let {
                    if (it == "n") {
                        exitProcess(-1)
                    } else {
                        //继续实用程序
                    }
                }
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}

fun calculate(input: String): String {
    // input =1+1
    // input =1-10l
    // input =1/2
    // 2ll input= 1*11
    if (input.contains("+")) {
        val nums = input.trim().split("+")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "+").toString()
    } else if (input.contains("-")) {
        val nums = input.trim().split("-")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "-").toString()
    } else if (input.contains("/")) {
        val nums = input.trim().split("/")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "/").toString()
    } else if (input.contains("*")) {
        val nums = input.trim().split("*")
        return operate(nums[0].toDouble(), nums[1].toDouble(), "*").toString()
    } else return "error, 你输入的表达式有误"
}

fun operate(num: Double, num2: Double, operate: String): Double {
    return when (operate) {
        "+" -> num + num2
        "-" -> num - num2
        "/" -> num / num2
        "*" -> num * num2
        else -> 0.0
    }
}
