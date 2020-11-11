fun main() {
    // Инициализируем переменные, для изпользования в качестве аргументов infix функции
    val number1 = 5
    val number2 = 10
    // Инициализируем инстансы классов из которых будем вызывать infix функцию, в то же время сам инстанс будет аргументом
    // функции
    val eval1 = Evaluator(5)
    val eval2 = Evaluator(10)

   // Тестируем функцию
    // Обратим внимание на синтаксис вызова функции. Красота!
    println(eval1 isEqual number1)
    println(eval1 isEqual number2)
    println(eval2 isEqual number1)

    println(eval1 isGreater  number1)
    println(eval2 isGreater  number1)
}