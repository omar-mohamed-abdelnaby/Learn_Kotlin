package equality

fun main(){
    //Structural Equality
    // == Equal
    //!= inequality
    var name1 = "Omar"
    var name2 = "Omar"
    println(name1 == name2)
    println(name1.equals(name2))
    println("===============")
    var name3 = "Omar"
    var name4 = "Mohamed"
    println(name3 != name4)


}