//перечисление
enum class Animals {
    //после перечисления необходимо ставить ; чтобы обозначить конец перечисления, так как далее следует функция
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.toLowerCase().capitalize()
}

fun  main(args: Array<String>){
    //создаем объект на оснрове класса NewClass
    //val user = NewClass()
    //user.printInfo(my())
    //println(user.getConnection())
    val user = object : MainProvider(){
        override fun printInfo(user: my) {
            super.printInfo(user)
            println("Выводится текст из класса наследника")
        }
    }
    checkDataTypes(user)

    val animals = Animals.BEAR

    when(animals){
        Animals.CAT -> println(animals.toLowerCase())
        Animals.BEAR -> println(animals.toLowerCase())
        else -> println("Что-то другое")
    }
}
//проверка на принадлежность к определенному интерфейсу
fun checkDataTypes(obj: MainProvider){
    if(obj is UserInfoProvider){
        obj.printInfo(my())
    }

    if(obj is DbConnection){
        println(obj.getConnection())
    }
}