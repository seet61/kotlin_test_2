fun main() {
    println("Hello Kotlin")

    //Int variable
    val age: Int = 23
    println(age)

    var agge: Int = 25
    println(agge)
    agge = 56
    println(agge)

    val text: String = """
                        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
                    """
    println(text)

    /*
    print("Введите Ваше имя: ")
    val name = readLine()
    println("Ваше имя: $name")
     */

    val compare = agge > age
    println(compare)

    val a = 10
    if (a == 10) {
        println("a == 10")
    }
    val b = 20
    val c = if (a > b) a else b
    println("c == $c")

    var a1 = 10
    when(a1) {
        10 -> {
            println("a1 = 10")
            a1 *= 2
        }
        20 -> {
            println("a1 = 20")
            a1 *= 5
        }
        else -> {
            println("no such case")
        }
    }

    println("result a1 = $a1")
}