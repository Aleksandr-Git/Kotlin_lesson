fun main() {
    val list = listOf(1, 2, 3, 4, 4, 5)
    //вывод индекса по которому находится значение в массиве
    println(list.indexOf(3))
    //вывод значения по индексу
    println(list.get(1))
    //выводит индекс последнего элемента
    println(list.lastIndexOf(4))
}