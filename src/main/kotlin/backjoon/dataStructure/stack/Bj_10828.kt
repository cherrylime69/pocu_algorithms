package backjoon.dataStructure.stack

import java.util.*

//https://www.acmicpc.net/problem/10828

fun main() {
    Bj_10828().run()
}

// 나의 답
class Bj_10828 {
    private val stack = mutableListOf<Int>()
    private val input = readLine()!!.toInt()

    fun run() {
        (1..input).forEach {
            when (val command = readLine()!!) {
                "pop" -> pop()
                "top" -> top()
                "size" -> println(stack.size)
                "empty" -> empty()
                else -> push(command)
            }
        }
    }

    private fun push(command: String) {
        val number = command.substring(5).toInt()
        stack.add(number)
    }

    private fun empty() {
        if (stack.isEmpty()) println(1)
        else println(0)
    }

    private fun top() {
        if (stack.isEmpty()) println(-1)
        else println(stack[stack.size - 1])
    }

    private fun pop() {
        if (stack.isEmpty()) println(-1)
        else println(stack.removeLast())
    }


}


// 좋아보이는 답
