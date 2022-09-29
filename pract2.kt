fun main() {
    print("Enter number in decimal system: ")
    val decimal = readln().toInt()
    print("Enter target base: ")
    val target = readln().toInt()
    print("Conversion result: ${convertor(decimal, target)}")
}

fun convertor(decimal:Int, target:Int): String {
    var dec = decimal
    val value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var dig = ""
    while (dec > 0){
        val i = dec % target
        dig = value[i].toString() + dig
        dec /= target
    }
    return dig
}