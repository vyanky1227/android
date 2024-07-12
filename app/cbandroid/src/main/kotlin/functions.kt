fun main(){

    getName()
    print(square(10))
    showMeUser("Vyanky",  isActive = false, age = 20)
    showMeUser("Vyanky", age = 20,false)
    countAndPrintArgs(2,3,3,4,5,7,8,9)
}
/* Why vararg is used as function argument?
In Kotlin, vararg is used to define a variable number of arguments for a function.
This allows a function to accept a flexible number of arguments of the same type.
 */
fun countAndPrintArgs(vararg number: Int){
    print(number.size)
    for (no in number) println(no)
}


fun showMeUser(name:String,age:Int = 20,isActive:Boolean = false){
    print("Name $name,Age $age,IsActive $isActive")
}
/*
    Types of Arguments
    1.Positional Arguments
    2.Default Arguments
    3.Named Arguments
 */

val username:String = "15dh"
fun getName():String{
    return "Vyanky"
}

fun square(number: Int):Int{

    return number * number
}
fun square2(number: Int):Int = number * number
fun square3(number: Int) = number * number
fun thisFunctionShouldStartWithLowerCase(){
    //This is lowerCamelCase
}