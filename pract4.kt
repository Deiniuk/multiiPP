fun main() {
    ev_od()
    negative()
    century()
    list()
    list2()
    word()
    str()
    multiply()
}

fun ev_od() {
    val a = readln().toInt()
    if ((a % 2) == 0) {
        println("Even")
        println("Multiply by 4: ${a*4}")
    } else {
        println("Odd")
        println("Multiply by 5: ${a*5}")
    }
}

fun negative() {
    val a = readln().toInt()
    println("Negative: ${if (a>=0) a*-1 else a}")
}

fun century() {
    val a = readln().toInt()
    println("Century: ${if ((a%100)==0) a/100 else a/100+1}")
}

fun list() {
    val a = listOf(21, 41, 53, 12, 5, 12, 64, 323, 73, 92)
    val b = a.toMutableList()
    val c = mutableListOf<Int>()
    println("Minimum: ${a.minOrNull()}")
    b.maxOrNull()?.let { c.add(it) }
    b.remove(c[0])
    b.maxOrNull()?.let { c.add(it) }
    println("Maximum: $c")
}

fun list2() {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -2, 11, -3, -23, -123, 42)
    val b = mutableListOf<Int>()
    var c = 0
    for (i in a.indices) {
        if (a[i] >= 0) {
            b.add(a[i])
        } else {
            c += a[i]
        }
    }
    println(if (listOf(b.size, c) == listOf(0, 0)) a else listOf(b.size, c))
}

fun word() {
    val a = readln()
    val b = "aeiouyаеиіоуяюєїаиеёоуыэюя"
    var j = 0
    for (i in a) {
        if (i.lowercase() in b) {
            j ++
        }
    }
    println("Number of vowels: $j")
}

fun str() {
    val a = readln()
    var b = ""
    if (a.length%2 == 0){
        b += a[a.length/2-1]
        b += a[a.length/2]
    } else {
        b += a[a.length/2]
    }
    println("Middle letters: $b")
}

fun multiply() {
    val n = 5
    val a = Array(n) {IntArray(n).toMutableList()}
    val b = a.toMutableList()
    for (i in 1..n) {
        for (j in 1..n) {
            b[i-1][j-1] = i*j
        }
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${b[i][j]} \t")
        }
        println()
    }
    println(b)
}