package classes

import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.util.*

class NotNumberException : Throwable(){

}

fun checkIsNumber(obj : Any){
    when(obj){
        !is Int,Long,Float,Double -> throw NotNumberException()
    }
}

fun main(args: Array<String>) {
//    try {
//        checkIsNumber("a")
//    }catch (e:IllformedLocaleException){
//
//    } catch (e:NotNumberException){
//        println("This is not a number")
//    }
    println(File("input.txt").absolutePath)
    val buffer = BufferedReader(FileReader("files1.txt"))
    val res = try {
        val chars = CharArray(10)
        buffer.read(chars,0,11)
    }catch (e:IndexOutOfBoundsException){
        println("out of bound")
    }catch (e:FileNotFoundException){
        1
    }
    finally {
        println("closing")
        buffer.close()
    }
}