package com.example.app.lesson

// kotlin 条件判断
fun main() {

    println("maxOf : ${maxOf(5, 10)}")
    println("maxOf : ${maxOf2(5, 10)}")

    eval(100.5)
    eval2(200)
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int {
    //三目运算
    return if (a > b) a else b
}

fun eval(number: Number) {
//如果是工nt类型
//is 是判断是否是某—种类型
    if (number is Int) {
        println("this is int number")
    } else if (number is Double) {
        println("this is int number")
    } else if (number is Float) {
        println("this is float number")
    } else if (number is Long) {
        println("this is long number")
    } else if (number is Byte) {
        println("this is byte number")
    } else if (number is Short) {
        println("this is Short number")
    } else {
        throw IllegalArgumentException("invalid argument")
    }
}

// when同样是带有返回值的
// when 将它的参数与所有的分支条件顺序比较，直到某个分支满足条件
fun eval2(number: Number): String = when (number) {
    200f -> "the number is 200f"
    100 -> "the number is 100"
    is Int -> "this is int number"
    is Double -> "this is double number"
    is Float -> {
        println("the number is float")
        "ths is float number"
    }
    is Long -> "this is long number"
    is Byte -> "this is byte number"
    is Short -> "this is Short number"
    else -> "invalid number"
}

fun eval3(): String {
    return when (val value: Any = getValue()) {// when表达式条件直接是一个表达式，并用value保存了返回值,
        is Int -> "This is Int Type, value is $value".apply(::println)
        is String -> "This is String Type, value is $value".apply(::println)
        is Double -> "This is Double Type, value is $value".apply(::println)
        is Float -> "This is Float Type, value is $value".apply(::println)
        else -> "unknown type".apply(::println)
    }
}

fun getValue(): Any {
    // Any类似于java中的object
    return 100
}
