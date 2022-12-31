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
    arrayMap["3"] = "2"
    arrayMap["3"] = "4"//此时，会覆盖上面的记录


    //map字典的创建—使用Pair指定集合中初始化的元素
    val arrayMap2 = mutableMapOf<String, String>(Pair("key", "value"))
    // map字典的创建—不可变字典，不可动态添加、删除元素
    val arrayMap3: Map<String, String> = mapOf<String, String>(Pair("key", "value"))
    val arrayMap4: Map<String, String> = mapOf<String, String>()

    //Set集合的创建—可变集合,元素唯一全
    val set = mutableSetOf<Int>()
    set.add(1)
    set.add(2)
    set.add(3)
    set.add(3)//添加不进去的
    for (item in set) {
        println(item)
    }
    val set2 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set2.add(6)
    set2.add(7)
    for (item in set2) {
        println(item)
    }

    // Set集合的创建——不可变集合,元素唯一
    val set3: Set<Int> = setOf<Int>(1, 2, 3)

    val arrayExamples: MutableList<String> = mutableListOf<String>("1", "2", "3", "4", "5", "2")
    println("isEmpty: ${arrayExamples.isEmpty()}")
    println("contains: ${arrayExamples.contains("6")}")
    println("get: ${arrayExamples[0]}")
    println("indexOf: ${arrayExamples.indexOf("2")}")//判断元素在集合中的下标的位置4
    println("lastIndexOf: ${arrayExamples.lastIndexOf("2")}")//判断元素在集合中的下标的位置

    val iterator = arrayExamples.iterator()
    iterator.forEach {
        println("it:${it}")//"1","2", "3","4", "5", "2"
    }
    arrayExamples.add(1, "7")//指定位置插入元素
    arrayExamples[0] = "0"//修改下标对应的元素
    arrayExamples.removeAt(0)
    arrayExamples.clear()//集合中的元素就会被清除，isEmpty=true,
    println("length: ${arrayExamples.size}")

    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.reverse()//集合元素翻转4,3,2,1
    numbers.forEach {
        println(" reverse:${it}")
    }

    numbers.shuffle()//随机排列元素
    numbers.forEach {
        println("shuffle:${it}")
    }

    numbers.sort()//排序，从小到大去排序
    numbers.forEach {
        println("sort:${it}")
    }
    numbers.sortDescending() // 从大到小
    numbers.forEach {
        println("sortDescending:${it}")
    }

}