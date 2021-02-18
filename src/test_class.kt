fun main(){
    val my_1 = my("Jon", "Lenon", 20)
    val my_2 = my()
    println(my_1.firstName)
    println(my_1.lastName)
    println(my_1.age)

    var firstName = my_2.firstName
    var lastName = my_2.lastName
    var age = my_2.age

    println("Имя: $firstName")
    println("Фамилия: $lastName")
    println("Возраст: $age")
}