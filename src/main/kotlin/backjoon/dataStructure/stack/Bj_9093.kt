package backjoon.dataStructure.stack

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

// https://www.acmicpc.net/problem/9093

fun main() {

    Bj_9093().run()

}

// 나의 답
class Bj_9093 {

    private val br = BufferedReader(InputStreamReader(System.`in`))
    private val bw = BufferedWriter(OutputStreamWriter(System.out))
    private val count = br.readLine().toInt()
    private val stack = Stack<Char>()

    fun run() {
        repeat(count) {
            val s = br.readLine().toCharArray() + ' '
            s.forEach { string ->
                if (string == ' ') {
                    while (stack.isNotEmpty()) {
                        bw.write(stack.pop().toString())
                    }
                    bw.write(string.toString())
                } else {
                    stack.push(string)
                }

            }
        }
        bw.flush()
        bw.close()
    }

}


// 좋아보이는 답