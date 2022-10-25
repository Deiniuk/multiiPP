fun main() {
    val a = mapOf("камінь" to "ножниці", "ножниці" to "бумага", "бумага" to "камінь")
    val values = listOf("камінь", "ножниці", "бумага")
    val b = values.random()
    var c: String
    while (true) {
        print("Введіть ваше значення: ")
        c = readln()
        if (c in values) {
            break
        } else {
            println("Виберіть інше зачення.")
        }
    }
    if (c == b){
        println("""Ваш вибір: $c
            |Вибір комп'ютера: $b
            |Нічия!
        """.trimMargin())
    }
    if (a.getValue(c) == b){
        println("""Ваш вибір: $c
            |Вибір комп'ютера: $b
            |Ви виграли!
        """.trimMargin())
    } else {
        println("""Ваш вибір: $c
            |Вибір комп'ютера: $b
            |Ви програли!
        """.trimMargin())
    }
}
