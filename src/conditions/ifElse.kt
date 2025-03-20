package conditions

fun main(){
    var price = 16
    if (price == 25){
        println("Price is $price")
    }
    else if (price < 25){
        println("Price is Good")
    }
    else if (price > 25){
        println("Price is Expensive")
    }
    else{
        println("Not Found")
    }

    println("==================")
    //Single Line IfElse Statement

    var age = 25
    if (age > 25) println("Your age is $age") else println("Your age is more than $age")
}