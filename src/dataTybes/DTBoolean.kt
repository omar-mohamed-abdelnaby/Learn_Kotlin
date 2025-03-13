package dataTypes

fun main(){
    var isBlank:Boolean = false
    println(isBlank)

    println(isBlank.not())

    isBlank = "Omar".isBlank()  // isBlank() is function that return true if the variable is empty
    println(isBlank)

    isBlank = "".isBlank()
    println(isBlank)

}