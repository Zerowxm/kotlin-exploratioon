package inheritance

interface Repo<T>{
    fun store(obj : T){

    }
    fun  get() : T
}