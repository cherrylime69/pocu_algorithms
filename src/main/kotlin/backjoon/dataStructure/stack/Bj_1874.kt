package backjoon.dataStructure.stack

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    val case = br.readLine().toInt()
    val numberList = List<Int>(case) { it + 1 }
    val stack = Stack<Int>()
    var pointer = 0

    for (i in 0 until case) {
        val number = br.readLine().toInt()
        while (stack.isEmpty() || stack.peek() != number) {
            stack.push(numberList[pointer])
//            bw.write("+\n")
            sb.append("+\n")
            if (pointer < numberList.size - 1) {
                pointer++
            } else {
                break
            }
        }
        stack.pop()
//        bw.write("-\n")
        sb.append("-\n")
    }

    if (stack.empty()) {
//        bw.flush()
//        bw.close()
        println(sb)
    } else {
        println("NO")
    }
}