package operators

/*
        Operator           Meaning                                Expression
        >                      greater than                             a > b
        <                         less than                                 a < b
        >=               greater than or equals to                  a >= b
        <=                  less than or equals to                     a <= b
        ==                          is equal to                               a = b
        !=                        not equal to                              a != b
 */
fun main(){
    val age =25

    if(age >= 18)
    {
        println("Good")
    }
    else{
        println("Bad")
    }

    val age2 = 20

    if(age2 <= 18)
    {
        println("Good")
    }
    else{
        println("Bad")
    }

    val age3 = 30

    if(age3 == 30)
    {
        println("Good")
    }
    else{
        println("Bad")
    }

    val age4 =35

    if(age4 != 35)
    {
        println("Good")
    }
    else{
        println("Bad")
    }


}