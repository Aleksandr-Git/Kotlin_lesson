class Some {
    //статичая переменная
    companion object {
        var count = 0
    }
    //Срабатывает при создании обекта данного класса
    init {
        count++
        println("Создано объектов: $count")
    }
}
//функци, которая принимает в качестве параметров список и функцию фильтр
fun filterList(list: List<String>, filter: (String) -> Boolean){
    list.forEach{el ->
        if (filter(el))
            println(el)
    }
}
//переменной прсваивается значение из функции
val filter: (String) -> Boolean = {
    it.startsWith("J")
}

fun main(args: Array<String>) {
    //создаем список
    val list = listOf("Java", "PHP", "Perl", "JavaScripn", "C++")
    //лямбда-функция фильтр проверяет начинается ли элемент с буквы Р, it берет значение из el
    //filterList(list, { it.startsWith("P") })
    //функция принимает в качестве параметра функцию
    filterList(list, filter)

//    //создаем объект на основе класса Db с классом данных MongoDb
//    val db = Db.MongoDb(5, "mongo")
//    //создаем объект на основе класса Db с классом данных PostgreSQL
//    val db_2 = Db.PostgreSQL(5, "mongo")
//    //создаем копию объекта db и присваиваем другое значение переменной conn
//    val db_copy = db.copy(conn = "Done")
//    if (db == db_copy)
//        println("Они равны")
//    else
//        println("Они не равны")
//
//    if(db_copy is Db.MongoDb){
//        db_copy.printInfo()
//    }
//    val test = Some()
//    val test_1 = Some()
//    val test_2 = Some()
//    val test_3 = Some()

}