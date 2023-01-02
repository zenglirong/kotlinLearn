package com.example.app.lesson

// kotlin扩展extensions
fun main() {
    Jump().test()
    Jump().doubleJump()

    val list = mutableListOf<Int>(1, 2, 3, 4)
    list.swap(0, 2)
    for (i: Int in list) {
        println("index:${i}")
    }

    val android = "android"
    val lastChar: Char = android.lastChar
    println("lastChar:${lastChar}")


    // apply 内置扩展函数
    testApply()

}

class Jump {
    fun test() {}
}

//扩展方法的定义，就是在方法的前面加上类前缀
fun Jump.doubleJump(): String {
    return "doubleJump"
}

fun <T> MutableList<T>.swap(index: Int, index2: Int) {
    val temp: T = this[index]
    this[index] = this[index2]
    this[index2] = temp
}

val String.lastChar: Char get() = this.get(length - 1)

//let扩展函数，类后面加上?代表参数可能为空，使用的时候注意判空
fun testLet(str: String?) {
//    str.let {
//        val str2 = "android"
//        println(str2 + it)
//    }
    // println(str2)//访问不到
    //判空用法，当str为空，则不会触发闭包里面的逻辑
    str?.let {
        val str2 = "android"
        println(str2 + it)
    }
}

//run扩展函数
//返回值为最后一行的值或者指定的return的表达式，在run函数中可以直接访问实例的公有属性和方法。
fun testRun(jump: Jump): String {
    jump.run {
        // jump.test( )
        test()
        println("1111")
        return "222"
    }
}

//apply函数的作用是:调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象。
//从结构上来看apply函数和run函数很像,
//唯一不同点就是它们各自返回的值不一样,run函数是以闭包形式返回最后一行代码的值,
//而apply函数的返回的是传入对象的本身。
fun testApply() {
    ArrayList<String>().apply {
        add("1111")
        add("222")
    }.run {
        for (s in this) {
            println("apply :${s}")
        }
    }
}


