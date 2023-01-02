package com.example.app.lesson

import org.json.JSONObject

// kotlin容器
fun main() {

    //浮点类型
    //编辑器同样会根据赋值推断变量的类型
    val doubleNumber: Double = 3.1415928888
    val floatNumber: Float = 3.1415928888f//尾部加f或F显式表示这是一个Float类型的浮点数
    println("float Number:" + floatNumber)
    println("double Numbel:" + doubleNumber)

    // kotlin数组
    // 1。使用array0f创建数组，必须指定数组的元素，可以是任意类型
    val arrayNumber: Array<Int> = arrayOf(1, 2, 3, 4);
    // 集合中的元素可以是任意类型
    // kotlin中的Any等价于java 中的0bject 对象的意思
    val arrayObjects: Array<Any> = arrayOf(1, true, "2")

    //2.使用array0fNulls创建空数组
    //创建一个指定大小的、所有元素都为空的数组，但必须指定集合中的元素类型
    val arrayOfNulls: Array<String?> = arrayOfNulls<String>(5)
    arrayOfNulls[0] = "element1"
    arrayOfNulls[1] = "element2"
    arrayOfNulls[2] = "element3"
    arrayOfNulls[3] = "element4"
    arrayOfNulls[4] = null

    //3 .利用array的构造函数，动态创建数组
    //创建一个 Array<String>初始化为["0", "1"，"4","9","16"
    // i= 0，1，2，3，4
    //i*i ="0", "1", "4"", "9", "16"
    //数组创建的时候，会循环5次，i就是数组的下标
    // ->右边的表达式的结果，就是数组中当前下表的元素
    val asc: Array<String> = Array(5) { i: Int -> (i * i).toString() }

    //4.字节数组
    val bytes = ByteArray(5)
    bytes[0] = 0
    // 5.使用工ntArray创建整型数据数组
    // 1.创建一个长度为5的空的IntArray
    val intArray2 = IntArray(5)
    intArray2[0] = 1
    //3.创建一个长度为5的值全为100的IntArray [100,100,100,100,100]
    val intArr2 = IntArray(5) { 100 }
    //4.注意这里it是它索引下标值，所以这是创建一个长度为5的IntArray[0，2，4，6，8]
    val intArr3 = IntArray(5) { it * 2 } //it , lambda表达式专有变量，这里指的是数组的下标

    // 数组如何进行for循环遍历
    // 依次取出数组中的元素--for-in的形式
    for (item: Int in intArr3) {//元素遍历
        println(item)
    }
    // 根据下标再取出对应位置的元素
    // for-in
    for (i in intArr3.indices) {
        println(i.toString() + "->" + intArr3[i])
    }
    // 同时遍历下标和元素
    for ((index, item) in intArr3.withIndex()) {
        println("$index->$item")
    }
    // forEach会依次回调给我们数组中的元素
    intArr3.forEach {
        println("forEach: $it")//这里的it代表的是数组的元素
    }

    // forEach增强版会依次回调给我们数组中的下标和元素
    intArr3.forEachIndexed { index , item ->
        println( "$index: $item")
    }
}