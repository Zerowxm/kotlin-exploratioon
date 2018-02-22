package inheritance

open class Person{
    open fun speak() {

    }
}

class Customer : Person() {
    override fun speak() {
        super.speak()
    }
}

fun main(args: Array<String>) {
    val customer = Customer()
    print(customer.speak())
}