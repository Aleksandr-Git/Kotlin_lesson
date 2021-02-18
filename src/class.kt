//class my(_firstName: String, _lastName: String) {
//   var firstName = _firstName
//   var lastName = _lastName

//установка значения в переменных по умолчанию через конструктор
class my(var firstName: String = "Alex", var lastName: String = "Grey", var age: Int = 30)

//установка значения в переменных по умолчанию через конструктор
//class my(var firstName: String, var lastName: String, var age: Int){
//    //установка данных через дополнительный конструктов
//    constructor(): this("Tom", "Cat", 5){
//        println("данные установлены")
//    }
//}