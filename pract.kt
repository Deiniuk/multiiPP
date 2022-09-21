fun main() {
    println("Hello! My name is DICT_Bot\n" +
            "Please, remind me your name.")
    print("> ")
    val name = readLine()
    println("What a great name you have, $name!\n" +
            "Let me guess yor age.\n" +
            "Enter remainders of dividing your age by 3, 5 and 7.")
    print("> ")
    val num1 = readLine()!!.toInt()
    print("> ")
    val num2 = readLine()!!.toInt()
    print("> ")
    val num3 = readLine()!!.toInt()
    val age: Int = (num1 * 70 + num2 * 21 + num3 * 15) % 105
    println("Your age is $age!")
    println("Now I will prove to your that I can count to any number you want.")
    print("> ")
    val num = readLine()!!.toInt()
    for (i in 1..num) {
        println("$i !")
    }
    println("Let's test your programming knowledge.\n" +
            "Why do we use methods?\n" +
            "1. To repeat a statement multiple times.\n" +
            "2. To decompose a program into several small subroutines.\n" +
            "3. To determine the execution time of a program.\n" +
            "4. To interrupt the execution of a program.")
    while (true) {
        print("> ")
        val cho = readLine()!!.toInt()
        if (cho == 2){
            println("Completed, have a nice day!\n" +
                    "Congratulations, have a nice day!")
            break
        } else {
            println("Please, try again.")
        }
    }
}