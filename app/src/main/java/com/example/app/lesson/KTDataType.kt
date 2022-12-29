package com.example.app.lesson

//kotlin 数据类型
fun main() {
    /**
     * 什么是位宽(bit),计算机中最小的数据存储单位，1个字节 = 8位
     * 1.在计算当中，所有数字(1，2 ,3,4int,long ,byte)在存储的时候，都是二进制存储
     * 2.二进制8位称为1个字节
     * 3.int数据类型是占了4个字节=4*8=32位
     * */

    // 1.如何声明一个基本数据类型的变量，有哪些方式？
    // 基本数据类型的整形默认数据类型均为Int，如果超过了Int的取值范围，则会推断为Long
    // 编辑器会根据赋值【100】，推断变量number 数据类型为Int
    val number = 100
    // 虽然没有明确指定变量bigNumber的数据类型，但是编辑器根据赋值发现【88888888888888】已经超过了Int的最大值
    // 所以bigNumber的数据类型会升级为Long
    val bigNumber = 88888888888888
    // 在赋值的数字的后面加上L，会自动推断为Long类型
    val longNumber = 20L
    // 在变量后面+:+数据类型
    val byteNumber: Byte = 1

    //浮点类型
    //编辑器同样会根据赋值推断变量的类型
    val doubleNumber: Double = 3.1415928888
    val floatNumber: Float = 3.1415928888f//尾部加f或F显式表示这是一个Float类型的浮点数
    println("floatNumber:" + floatNumber)
    println("doubleNumbel:" + doubleNumber)

    //字符类型
    //赋值的时候用单引号引起来
    val char: Char = '0'

    //布尔类型，使用Boolean来声明类型，只有两种值true/false
    val isVisible: Boolean = false //true
    val isVisible2 = true

    //字符串类型
    val str: String = "1234567890"//从0开始
    // 字符串的取值
    val strNumber2: Char = str[1]
    //字符串的模板表达式以$开始
    println("The Result is $str")
    println("Text length is ${str.length}")
    //字符串拼接操作
    println("I am " + 10 + "years old!")
    //字符转义\n换行符的意思
    val helloWorld = "Hello world!"
    println(helloWorld + "\n" + "how are you")

    // helloworld3要求它的字符串内容是json格式,
    val helloworld3 = "{\"key\":\"value\"}"
    // """分解符，字符串内容无需转义，看起来更清爽
    val helloworld4: String = """ 
            |Tell me and I forget.
            |Teach me and I remember.
            |{"key1": "value1"}
            |{"key2": "value2"}
    """.trimIndent()
    println(helloworld3)
    println(helloworld4)

    //数据类型间的强制转换
    val number100: Int = 100     //声明—个整形number对象
    println("转换成string: ${number100.toString()}")
    println("转换成string: ${number100.toLong()}")

    //数据类型的加减乘除
    //在计算机里面整数除以整数，得到结果还是整数，小数点会被抹掉
    val numberInt: Int = 3 / 2  //=1.5
    println("numberInt: $numberInt")//输出1
    //整数的3除以小数2
    val numberDouble: Double = 3 / 2.toDouble()
    println("numberDouble : $numberDouble")//输出1.5
    println("乘法:" + numberInt * numberDouble)
    println("取余:" + 3 % 2)// 输出1

    val vip = true
    val admin = false
    //与操作，要求两个都满足，结果才会为true
    val result: Boolean = vip.and(admin) // false
    //或操作,只要有一个条件是true,结果才会为true
    val result2: Boolean = vip.or(admin) // false

    //无符号右移
    // 0000 1000——->0000 0010 =2
    val result3: Int = 8 ushr (2)
    println("result:$result")
    println("result2:$result2")
    println("result3:$result3")
}
