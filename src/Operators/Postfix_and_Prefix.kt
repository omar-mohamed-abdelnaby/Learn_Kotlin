package operators

//Prefix and Postfix in kotlin                                          Prefix          Postfix
//        ++              Increment: increases value by 1          ++a               a++
//        --              Decrement: decreases value by 1          --a               a--


fun main(){

    var a = 6
    var b = 0
    println("a value is $a")
    println("b value is $b")

    //Postfix
    b = a++
    println("a value is $a")
    println("b value is $b")
    b = a--
    println("a value is $a")
    println("b value is $b")

    //Prefix
    b = ++a
    println("a value is $a")
    println("b value is $b")
    b = --a
    println("a value is $a")
    println("b value is $b")

}