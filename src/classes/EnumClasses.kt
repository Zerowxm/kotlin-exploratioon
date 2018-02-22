package classes

enum class Priority{
    MINOR{
        override fun toString(): String {
            return super.toString()
        }
        fun text(): String {
            return toString()
        }
    },
    NORMAL,
    MAJOR
}

fun main(args: Array<String>) {
    println(Priority.MAJOR.ordinal)
    println(Priority.MINOR)
}