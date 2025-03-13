package dataTypes

fun main(){
    val message:String = """
        Hello
        My Name is Omar.
        How are you?
    """.trimIndent()
    println(message)

    println("==================")

    val message2:String = """
        Hello
        My Name is Mohamed.
        How are you?
    """.replaceIndent("- ")
    println(message2)

    println("==================")

    val message3:String = """
        >> Hello
        >> My Name is Ali.
        >> How are you?
    """.trimMargin(">>")
    println(message3)

    println("=================")

    val name = "Nabil"
    val age = 27
    println("Hello $name your age is $age and Your Name is ${name.length} letters")
    println(name.length)
}