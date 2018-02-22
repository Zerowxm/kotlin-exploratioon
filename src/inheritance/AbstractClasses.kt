package inheritance

abstract class Animal{
    var voice = ""
    open fun bark(){
        println(voice)
    }
    abstract fun foo()

}

class Dog : Animal(){
    override fun bark() {
        voice = "Dog"
        print(voice)
    }

    override fun foo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    var dog = Dog()
    dog.bark()
}