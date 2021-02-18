fun main(){
    var s = 9

    if(s == 10){
        println("s = $s")
    }
    else {
        println("s != $s")
        s++
        println("s теперь = $s")
    }

    val x = null
    when (x) {
        1 -> println(1)
        2 -> println(2)
        3 -> println(3)
        else -> println("hello")
    }

    val list = listOf(1, 2, 3, 4, 4, 5)
    list.forEach { i ->
        when (i) {
            1 -> println(1)
            2 -> println(2)
            3 -> println(3)
            else -> println("hello")
        }
    }
}