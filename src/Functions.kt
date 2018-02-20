

fun returnNum(num : Int) : Int{
    return num
}

fun returnNothing() : Nothing{
    throw Exception("There is nothing")
}

fun returnUnit() : Unit{
    println("Unit")
}

fun overload(x : Int,y : Int,z :Int = 0,w : Int = 0) = print(x + y + z + w)

fun defaultArguments(name : String, email : String = "", phone : String){
    println("I am $name, email:$email, phone:$phone")
}
fun main(args: Array<String>) {
    overload(1,2)
    returnNothing()
    returnNum(1)
    defaultArguments("Xiaoming",phone = "110")
    defaultArguments("Rem",phone = "120", email = "NA")
}