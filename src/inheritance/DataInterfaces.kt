package inheritance

interface DataInterfaces {
    fun getData()
}

class Data : DataInterfaces{
    override fun getData() {

    }
}

interface Interface1{
    fun printA(){
        println("A1")
    }
}

interface Interface2{
    fun printA(){
        println("A2")
    }
}

class Class1And2 : Interface1, Interface2{
    override fun printA() {
        super<Interface1>.printA()
        super<Interface2>.printA()
    }
}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.printA()
}