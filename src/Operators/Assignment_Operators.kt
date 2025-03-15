package operators

/*
      Assignment Operators
         a += b    a = a + b
         a -= b     a = a - b
         a *= b     a = a * b
         a /= b     a = a / b
         a %= b     a = a % b
 */

fun main(){
    var number = 25
    number +=25
    println(number)

    number -=10
    println(number)

    number *=5
    println(number)

    number /=10
    println(number)

    number %=10
    println(number)

}