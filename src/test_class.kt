fun main(){
    val my1 = my("Jon", "Lenon", 20)
    val my2 = my()
//установка значения в переменную класса
    my1.login = "cod"
//вывоз значения переменной и выполнения децствия из класса
    println(my1.login)

    println(my1.firstName)
    println(my1.lastName)
    println(my1.age)

    val firstName = my2.firstName
    val lastName = my2.lastName
    val age = my2.age

    println("Имя: $firstName")
    println("Фамилия: $lastName")
    println("Возраст: $age")

    my1.printUser()
}