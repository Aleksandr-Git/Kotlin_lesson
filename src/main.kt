fun  main(args: Array<String>){
    //создаем объект на оснрове класса MainProvider
    val user = NewClass()
    //user.printInfo(my())
    //println(user.getConnection())
    checkDataTypes(user)
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