package classes

object Math{
    val PI = 3.14
}

fun main(args: Array<String>) {
    val localObject = object {
        val PI = 2.14159
    }
    println(message = localObject.PI)
    println(Math.PI)
}