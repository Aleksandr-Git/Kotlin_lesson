fun main(){
    val my1 = my("Jon", "Lenon", 20)
    val my2 = my()
//установка значения в переменную класса
    my1.login = "cod"
//вывод значения переменной и выполнения действия, которое прописано в классе
    println(my1.login)
//просто запрос переменно и выполнение действия, которое предусмотрено в классе
    my1.login

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