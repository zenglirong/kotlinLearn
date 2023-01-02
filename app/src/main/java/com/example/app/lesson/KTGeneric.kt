package com.example.app.lesson

import org.json.JSONObject

//kotlin泛型
fun main() {

    val drinkApple = DrinkApple()
    drinkApple.drink("drink")

    //2,反省类
    val blueColor = BlueColor("blue")
    blueColor.printColor()

    //3.泛型方法
    fromJson("{}", String::class.java)

    //泛型约束
//    fromJson2<JSONObject>( "{}",JSONObject::class.java)

    //泛型约束-2，多种约束
//    fromJson3<User>(  "{}",  User::class.java)


}

interface Drink<T> {
    fun drink(t: T)
}


class DrinkApple : Drink<String> {
    override fun drink(t: String) {
        println("drink:${t}")
    }
}

abstract class Color<T>(val t: T) {
    abstract fun printColor()
}

class BlueColor(private val color: String) : Color<String>(color) {
    override fun printColor() {
        println("printColor: $color")
    }
}

fun <T> fromJson(json: String, tClass: Class<T>): T? {
    val instance: T? = tClass.newInstance()
    return instance
}

//泛型类型限定-1
//所传递的类型T必须满足是JSONObject的子类或JSONObject类
fun <T : JSONObject> fromJson2(json: String, tClass: Class<T>): T? {
    val instance: T? = tClass.newInstance()
    return instance
}

//泛型类型限定-2
//所传递的类型T必须同时满足where子句的所有条件
//在下面的示例中，类型T必须既实现了User，也实现了Comparable。
fun <T> fromJson3(json: String, tClass: Class<T>): T? where T : JSONObject, T : Comparable<T> {
    val instance: T? = tClass.newInstance()
    return instance
}

class User : JSONObject(), Comparable<User> {
    override fun compareTo(other: User): Int {
        return 0
    }
}


open class Animal
open class DogAnimal : Animal()
class CatAnimal : Animal()
class WhiteDogAnimal : DogAnimal()

fun animalFuns() {
    val animal: Animal = DogAnimal()
    //传入的泛参数可以是 Animal及Animal的子类DogAnimal, CatAnimal，WhiteDogAnimal...
    val animalList: OutArrayList<out Animal> = OutArrayList<DogAnimal>()
    val animalList2: OutArrayList<Animal> = OutArrayList<DogAnimal>()

    // 2。使用处使用in关键字声明,约定泛型的下限，允许传入的泛型类型是DogAnimal及其父类Animal

    val animalList3: InArrayList<in DogAnimal> = InArrayList<Animal>()
    val animalList4: InArrayList<DogAnimal> = InArrayList<Animal>()

}

//在定义处使用out关键字声明，允许传入的泛型参数可以是T以及T的子类
class OutArrayList<out T> {
}

//在定义处使用in关键字声明，允许传入的泛型参数可以是T以及T的子类
class InArrayList<in T> {

}




