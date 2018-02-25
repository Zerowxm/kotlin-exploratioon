package functional

fun operation(x:Int, y:Int, op:(Int,Int)->Int){
    op(x,y)
}

fun sum(x: Int,y: Int)= x + y

fun unaryOperation(x : Int, op: (Int) -> Int){

}
fun unaryOp(op: (Int) -> Int){

}
fun main(args: Array<String>) {
    operation(1,2,::sum)
    operation(1,2,{x,y->x+y})
    unaryOperation(1,{ it * it})
    unaryOperation(1) { it * it}

    unaryOp { it * it } // == unaryOp( it * it)
}