fun main(){
    var array = listOf<Any>('a', 1, true, 2, "hello")
    var text = "asdfghjkl;'"
    var a = 12

//обычный перебор массива
    for(i in array){
        println(i)
    }
//обычный перебор текста
    for(i in text){
        println(i)
    }
//перебор с шагом 2
    for(i in 1..10 step 2){
        println(i)
    }
//перебор с шагом 2 в обратном порядке
    for(i in 10 downTo 0 step 2){
        println(i)
    }
//перебор алфавита с шагом 4
    for(i in 'a'..'z' step 4){
        println(i)
    }

    while (a > 10){
        a--
        println(a)
    }

    do{
        println("hello")
        a--
    }while (a > 8)

}