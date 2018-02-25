package classes

fun capitalAndPopulation(country : String) : Pair<String,Long>{
    return Pair(country,10000)
}

fun capitalAndPopulationAndArea(country : String) : Triple<String,Long,Long>{
    return Triple(country,10000,100)
}

fun main(args: Array<String>) {
     val res = capitalAndPopulation("Boston")
    println(res.first)
    println(res.second)

    val (capital, population) = capitalAndPopulation("Boston")
    val pairs = 1 to 2
    println(pairs)
}