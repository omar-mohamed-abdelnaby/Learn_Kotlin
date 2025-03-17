package operators

/*
Unary prefix and Increment / Decrement Operators

Operator    Meaning                               Expression
    +          Unary plus                                       +a
    -          Unary minus (inverts sign)                 -a
    !          not (inverts value)                            !a
   ++         Increment: increases value by 1       ++a
   --         Decrement: decreases value by 1       --a
*/
fun main(){
    var a = 1
    var result : Int
    result = -a
    println(result)

    a = -2
    result = +a
    println(result)

    val b = true
    var result2 = !b
    println(result2)

    var c = 9     // prefix
    ++c
    println(c)

    var d = 36
    --d
    println(d)

}
