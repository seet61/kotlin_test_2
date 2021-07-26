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

    val ab = 10
    val bb = 5
    val cb = 3
    when (ab) {
        bb - cb -> println("ab = bb - cb")
        bb + 5 -> println("ab = bb - cb")
        else -> println("неопределенное значение")
    }

    for (n in 1..9) {
        print("$n \t")
    }

    println("")
    println("Matrix: ")
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")
        }
        println()
    }

    println("continue")
    for(n in 1..8){
        if(n == 5) continue;
        println(n)
    }

    println("break")
    for(n in 1..5){
        if(n == 5) break;
        println(n)
    }

    println("downTo")
    for (c in 10 downTo 1 step 3) {
        println("$c")
    }

    println("chars")
    val range2 = 'a'..'h'
    for (c in range2) {
        print(c)
    }
    println("")

    val numbers: Array<Int> = arrayOf(1,2,3,4,5)
    println("numbers: $numbers")

    val people = arrayOf("Tom", "Sam", "Bob")
    for(person in people){
        print("$person \t")
    }

    println("")

    var i = 0
    while( i in people.indices){
        println(people[i])
        i++;
    }
}