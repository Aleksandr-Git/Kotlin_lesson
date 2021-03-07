//изолированный класс
sealed class Db {
    data class MySQL(val id: Int, val conn: String): Db()
    data class MongoDb(val id: Int, val conn: String): Db()
    data class PostgreSQL(val id: Int, val conn: String): Db()
    object Help: Db(){
        val conn = "Connection done"
    }
}
//переменная вынесена за пределы класса, но привязана к классу и устанавливаем значение
val Db.MongoDb.info: String
    get() = "MongoDb has id: $id and connection: $conn"
//функция вынесена за пределы клвсса, но привязывается в классу
fun Db.MongoDb.printInfo(){
    println(info)
}