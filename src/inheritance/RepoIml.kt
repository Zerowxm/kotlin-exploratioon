package inheritance

class RepoIml<T> : Repo<T> {
    override fun get(): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface Repo1{
    fun <T>get(obj : T) : T{
        return obj
    }
}