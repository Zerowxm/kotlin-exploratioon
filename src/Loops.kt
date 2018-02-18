

// exploration of loops

fun main(args: Array<String>) {
    for (str in "I love kotlin"){
        println(str)
    }
    val list = 1..100
    for (a in list){
        println(a)
    }

    for(a in 100 downTo 1){
        println(a)
    }

    for (a in 100 downTo  1 step  5){
        println(a)
    }

    loop@ for (i in 1..100){
        for (j in 1..100){
            if (i == j) {
                break@loop
            }
        }
    }

    val result = "Sting"
    when(result){
        "" -> {
            println("void")
        }
        else -> {
            println("This is String")
        }
    }

    val whenValue = when(result){
        "" -> {
            println("void")
        }
        else -> {
            println("This is String")
        }
    }

    println(whenValue)
}
