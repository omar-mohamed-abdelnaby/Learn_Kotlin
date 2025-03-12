package dataTypes

fun main(){
    //Integers
    val myByte:Byte = 8
    val myShort:Short = 16
    val myInt:Int = 12
    val myLong:Long = 64

    //Decimals
    val myFloat:Float = 32.00F
    val myDouble:Double = 64.00

    println(myByte.javaClass)
    println(myByte.toFloat())      //name.toDatatype() -> Converting one data type to another
    println(myByte.toFloat().javaClass)

    val newInt = myInt.plus(12)
    println(newInt)

}