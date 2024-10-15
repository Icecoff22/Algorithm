package test02

fun main() {
    val n = readln().toInt()

    for (i in 0 ..< n) {
        val tmp = readln()
        var sum:Int = 0
        var oCount:Int = 0
        for (j in tmp.indices) {
            if (tmp[j] == 'O') {
                oCount++
                sum += oCount
            }
            if (tmp[j] == 'X') {
                oCount = 0
            }
        }
        println(sum)
    }
}