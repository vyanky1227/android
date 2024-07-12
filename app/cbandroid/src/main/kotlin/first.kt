var f: String = "vyanky"

val g: String = "vyanky"
//it works on vararg
/*
[vararg]: it tells that you can pass n number of arguments inside any function
*/

val numbers = arrayOf(1, 2, 3, 4, 5)
val name = arrayOf("1", "2", "3", "4", "5") // we haven't given any type to array
val nameString = arrayOf("1", "2", "3", "4", "5")

val num = Array(6) { i -> i * 1 }

val numArray = intArrayOf(1)
// 0 1 2 3 4 5
val nullArray = arrayOfNulls<String>(10)
// Lists or Collections
val listOfNames = listOf("hello", "world", "vyanky")
val mutableListOfNames = mutableListOf("hello", "world", "vyanky")
val mutableArrayListOfNames = arrayListOf("hello", "world", "vyanky")
val mapOfNames = mapOf("name" to "vyanky", "age" to "20", "Nationality" to "Indian")
val hashMapOfNames = hashMapOf("name" to "vyanky", 1 to 20, "Nationality" to "Indian")

fun main() {
    f = "vyanky"
    val size: Int = f.length
    val a: Int = 10
    val b: String = "hello world from vyanky"
    val c: Boolean = false
    val d: Float = 10.0f
    val e: Double = 10.9
    f = "vyanky"
    println("this is " + f.capitalize() + " 15 with name length as ${f.length}")
    println(num[4])
    nameString[0] = "1"
    println(nameString[4])
    mutableListOfNames.add("funky")
    println(mapOfNames["age"] )  // Proper handling of the nullable type

    hashMapOfNames.forEach { any, any2 ->
        println("" + any + any2)
    }
    mutableArrayListOfNames.forEach {
        println(it)
    }

    numArray.forEach {
        println("Traditional for loop")
        println(it)
    }
    for (name in numArray){
        print(name)
    }
    for (x in 0..10){
        //10 is inclusive
        println(x)
    }
    for (x in 0 until 10 step 2){
        //10 is exclusive
        println(x)
    }
    for (x in 10 downTo 0 step 2){
        //10 is exclusive
        println(x)
    }

    val any:Any = "vyanky"
    //val bAny:String = any as String
    if (any is String){
        any.length
    }
    val x = when(any) {
        "15dh" -> "vyanky $any"
        "vyanky" -> "$any 15dh"
        "Name" -> "$any is vyanky15dh"
        else -> "Not a valid name"
    }
    println(x)


}
