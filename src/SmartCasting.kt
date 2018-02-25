
open class Person{

}

class Employer : Person(){

}

class Employee : Person(){
    fun eat (){

    }
}

fun main(args: Array<String>) {
    val p = Person()
    if (p is Employee){
        p.eat()
    }

    val input = 10
    val str = input as? String
    println(str)
}