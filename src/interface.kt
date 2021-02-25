interface UserInfoProvider{
    fun printInfo(user: my)
}
// абстрактный класс
//abstract class MainProvider : UserInfoProvider{

//}

class MainProvider : UserInfoProvider{
    // переписываем функцию
    override fun printInfo(user: my) {
        println("Message")
        //обращаемся к методу из класса user
        user.printUser()
    }
}