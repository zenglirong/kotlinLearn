package com.example.app.lesson

import androidx.collection.ArrayMap
import org.json.JSONObject

/**
 *kotlin集合
 * List:是一个有序列表，可通过索引(下标)访问元素。元素可以在list中出现多次、元素可重复。
 * Set:是元素唯一的集合。一般来说 set中元素的顺序并不重要、无序集合。
 * Map:(字典)是一组键值对。键是唯一的，每个键都刚好映射到一个值, 值可以重复。
 */
fun main() {

    //列表的创建方式----可变列表
    val arrayString = mutableListOf<String>()
    arrayString.add("1")
    arrayString.add("2")
    arrayString.add("2")
    arrayString.add(3, "3")

    val arrayString2: MutableList<String> = mutableListOf<String>("1", "2", "3", "3")
    arrayString2.add("4")

    //列表的创建方式- -不可变列表
    //必须指定元素类型
    //必须指定初始化数据元素
    val arrayInt: List<Int> = listOf<Int>(1, 2, 3)

    // map字典的创建—可变字典
    // val array:ArrayMap<String,String> = arrayMapOf(Pair("key", "value"))
    val arrayMap = mutableMapOf<String, String>()
    arrayMap["1"] = "1"
    arrayMap["2"] = "2"
    arrayMap ["3"] = "2"
    arrayMap ["3"] = "4"//此时，会覆盖上面的记录
}