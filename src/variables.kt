

// explore features of kotlin
fun main(args: Array<String>) {
    var num = 10 // variable: mutable
    val immutableNum = 10 // immutable
    num += immutableNum
    var string = "This is Kotlin\n"

    val immutableString = "Welcome Kotlin"
    string += immutableString
    println(string)

    val lines = """
        I am Xiaoming,
        master of computer science
        in Northeastern University
        """

    val len = "String length: ${string.length} "
    print(len + "Num $num")
    println(lines)

}