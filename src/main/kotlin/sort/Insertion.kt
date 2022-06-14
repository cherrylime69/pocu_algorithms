package sort

fun main() {
    val test = mutableListOf(12, 434, 4, 23, 54, 123, 7)
    insertionSort(test)
    println(test)
}

fun insertionSort(list: MutableList<Int>) {
    for (i in list.indices) {
        var index = i
        while (index > 0) {
            if (list[index] < list[index - 1]) {
                swap(list, index, index - 1)
                index--
            } else {
                break
            }
        }

    }
}

fun swap(list: MutableList<Int>, firstIndex: Int, secondIndex: Int) {
    val temp = list[firstIndex]
    list[firstIndex] = list[secondIndex]
    list[secondIndex] = temp
}