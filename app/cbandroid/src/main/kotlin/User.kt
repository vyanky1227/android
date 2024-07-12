import jdk.jfr.DataAmount

fun main() {
    val account = Account(12345, "vyanky", 10000f)
    val account2 = Account(12345)
    val account3 = Account(12345,"vyanky")
    println("Account no ${account.accNo},Name ${account.name},Amount ${account.amount}")
    account.deposit(150f)
    account.withDraw(50f)
    account.withDraw(150f)
    println(account.amount)
}
class Account{
    var accNo:Int = 1
    var name:String = ""
    var amount:Float = 0f


    constructor(accNo: Int){
        this.accNo = accNo
        name = "Default"
        amount =0f
    }
    constructor(accNo: Int,name:String){
        this.accNo = accNo
        this.name = "Default"
        amount =0f
    }
    constructor(accNo: Int, name: String,amount: Float){
        this.accNo = accNo
        this.name = "Default"
        this.amount =0f
    }

    //Constructor
    /*
        It is a function with same name as class name
        It is used to construct or initialize the class
        Two types of Constructors
        1.Primary Constructor- only 1
        2.Secondary Constructor- Multiple Secondary Constructors
     */

    //Member Functions
    //this point to the current receiver
   /* fun insert(accNo:Int,n:String,amount:Float){

        this.accNo = accNo
        this.name = name
        this.amount = amount
    }*/
    fun deposit(money:Float){
        amount += money
        println(money)
    }
    fun withDraw(money: Float){
        if (amount < money){ //amount = 5 && money = 6
            println("Not Sufficient Funds")
        }else{
            amount -= money //Shorthands
            println(amount)
        }
    }
}