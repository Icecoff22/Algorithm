package test02

fun main() {
    val string:ArrayList<String> = ArrayList()
    var maxLen:Int = Int.MIN_VALUE
    for (i in 0..<5) {
        val input = readln()
        string.add(input)
        if (input.length  > maxLen) {
            maxLen = input.length
        }
    }

    for (i in 0..<maxLen) {
        for (j in 0..4) {
            if (string[j].length-1 < i) {
                continue
            }
            print(string[j][i])
        }
    }
}