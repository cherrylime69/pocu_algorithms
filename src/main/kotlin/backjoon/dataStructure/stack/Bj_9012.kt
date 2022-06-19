package backjoon.dataStructure.stack

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testData = br.readLine().toInt()
    val stack = Stack<Char>()

    repeat(testData) {
        br.readLine().forEach first@{
            if (it == '(') {
                stack.push(it)
            } else {
                if (stack.isEmpty()) {
                    stack.push(it)
                    return@first
                } else if (stack.peek() != ')'){
                    stack.pop()
                }
            }
        }
        val result = if (stack.isEmpty()) "YES" else "NO"

        bw.write(result +"\n")
        stack.clear()
    }
    bw.flush()
    bw.close()
}

/* 나만의 풀이
( 면 스택에 넣고 ) 면 pop 한다 그럼 무조건 () 일 때 스택을 비우는 것
그래서 스택에 문자열이 남아있다면 VPS 가 아닌 것이고 비워있다면 VPS가 맞는 것
예외 처리로 처음부터 )) 가 들어올 경우를 대비하여 스택이 비워있을 때 )가 들어오면 바로 반환하거나 이에 대한 처리를 해야 함
 */