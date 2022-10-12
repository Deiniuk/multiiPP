fun main() {
    print("Enter number in your system: ")
    val number = readln()
    print("Enter your base: ")
    val target = readln().toInt()
    print("Conversion result: ${convertor(number, target)}")
}

fun convertor(number: String, target: Int): String {
    val value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var n = 0
    var dig = ""
    for(a in number) {
        val i = value.indexOf(a.toUpperCase())
        n = n * target + i
    }
    while (n > 0) {
        val i = n % 10
        dig = value[i].toString() + dig
        n /= 10
    }
    return dig
}
