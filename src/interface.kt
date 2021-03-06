interface UserInfoProvider{
    //значение переменной внутри интерфейса добавлять нельзя
    val info: String

    fun printInfo(user: my) {
        //реализация функции внутри интерфейса
        println(info)
        //обращаемся к методу из класса user
        user.printUser()
    }
}

interface DbConnection{
    fun getConnection() : String
}
// абстрактный класс
//abstract class MainProvider : UserInfoProvider{

//}

// создаем класс с интерфейсом UserInfoProvider
//open делает класс наследуемым
open class MainProvider : UserInfoProvider, DbConnection{
    //переписываем переменную
    override val info: String
        get() = "Method was called"
//   // переписываем функцию из интерфейса UserInfoProvider
//   override fun printInfo(user: my) {
//       println("Message")
//       //обращаемся к методу из класса user
//       user.printUser()

    // переписываем функцию из интерфейса UserInfoProvider
    override fun printInfo(user: my) {
        //обращение к функции в интерфейсе
        super.printInfo(user)
        println("дополнительный код")
    }

    override fun getConnection(): String {
        return "DB Connection"
    }
}

