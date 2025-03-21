package booleanOperators

fun main(){
    var myAge = 20
    var yourAge = 30

    if((myAge == 20) &&(yourAge != 30) ) println("true") else println("false")
    println("==================")
    if((myAge == 20) ||(yourAge != 30) ) println("true") else println("false")
    println("==================")
    println((myAge == 20) ||(yourAge != 30))

}