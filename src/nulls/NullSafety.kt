package nulls

fun main(args: Array<String>) {
//     val message : String = null
    val messageNull : String?  = null
//    println(messageNull.length)
    val inferedNull = null

    if (messageNull != null){
        println(messageNull.length)
    }

    println(messageNull?.length)
    println(messageNull!!.length)

}