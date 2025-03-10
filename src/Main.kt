fun main() {
    //"val" can’t be reassigned a different value after initialization
    val firstName2 : String ="Ali"          //Equal  -> val firstName ="Ali"
    println(firstName2)

    val myAge : Int = 21                      //Equal -> val myAge =21
    println(myAge)



    println("=========================")

    //"var" can be reassigned a different value after initialization
    var firstName  ="Omar"
    firstName = "ami"
    println(firstName)
    println(firstName.isEmpty())

    var lastName ="Mohamed"
    println(lastName)

    var gender  = ""
    println(gender.isEmpty())

    var age =20
    print(age)
    }
