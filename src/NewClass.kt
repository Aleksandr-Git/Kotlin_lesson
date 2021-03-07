class NewClass: MainProvider(){
    override val db: String
        get() = "DB not connected"
// переписываем переменную из родительского класса
    override val info: String
        get() = "Новый метод из класса наследника"
// переписываем функцию из родительского класса
    override fun printInfo(user: my) {
        super.printInfo(user)
        println("Выводится текст из класса наследника")
    }
}