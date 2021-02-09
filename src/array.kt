fun main() {

    var asd: Array<String> = arrayOf("aa", "ss", "dd")
    println(asd[0])

    var  sdf = arrayOf(1, 2, 3)
    println(sdf[1])

    //запрос значения по индексу
    println(sdf.get(2))

    //замена значения по индексу
    sdf.set(2, 6)
    println(sdf[2])

    //длинна масива
    var s = asd.size
    println("длинна массива $s")

    //перебор массива
    for(i in asd)
        println("перебор массива $i")

    //перебор массива
    sdf.forEach {
        i -> println("перебор массива вариант 2 $i")
    }
    //перебор индексов и значений
    asd.forEachIndexed(){
            index, i -> println("перебор массива вариант 3: индекс - $index, значение - $i")
    }
}
