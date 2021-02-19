//class my(_firstName: String, _lastName: String) {
//   var firstName = _firstName
//   var lastName = _lastName

//установка значений в переменные по умолчанию через конструктор
class my(var firstName: String = "Alex", var lastName: String = "Grey", var age: Int = 30){
//установка значений в переменную класса
//field это обращение к переменной login
    var login: String? = null
        set(value) {
            if(value == "test")
                field = "non"
            else field = value
            println("значение переменной login установлено")
        }
//запрос значения переменной и выполнение какого-либо действия при запросе
        get(){
    // если значение в переменную не установлено, то будет выведен текст с переменной loginField
            val loginField = field ?: "неизвестно"
            println("переменная равна $loginField")
            return field
        }
    fun printUser(){
        println("$firstName $lastName $age")
    }
}

//установка значения в переменных по умолчанию через конструктор
//class my(var firstName: String, var lastName: String, var age: Int){
//    //установка данных через дополнительный конструктов
//    constructor(): this("Tom", "Cat", 5){
//        println("данные установлены")
//    }
//}