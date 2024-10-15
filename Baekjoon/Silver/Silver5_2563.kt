package test02

import kotlin.math.abs

fun main() {
    val n = readln().toInt()
    val arr: Array<Array<Int>> = Array(100) { Array(100) { 0 } }
    var sum = 0
    for (i in 1..n) {
        val tmp:List<Int> = readln().split(" ").map{it.toInt()}
        for (j in tmp[0]..<tmp[0]+10) {
            for (k in tmp[1]..<tmp[1]+10) {
                arr[j][k] = 1
            }
        }
    }
    for (j in 0..<100) {
        for (k in 0..<100) {
            if(arr[j][k] == 1)
                sum++
        }
    }
    println(sum)
}