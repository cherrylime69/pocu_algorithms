package sort

fun main() {
    val test = mutableListOf(12, 434, 4, 23, 54, 123, 7)
    val test2 = mutableListOf(7, 2, 5, 1, 3, 8, 7, 4, 9, 6)
    quickSort(test2, 0, test2.size - 1)
    println(test2)
}

fun quickSort(list: MutableList<Int>, left: Int, right: Int) {
    if (left >= right) return

    val pivot = partition(list, left, right)

    quickSort(list, left, pivot - 1)
    quickSort(list, pivot + 1, right)

}

fun partition(list: MutableList<Int>, left: Int, right: Int): Int {
    val pivot = list[right]

    var leftPointer = left- 1
    for (i in left until right) {
        if (list[i] < pivot) {
            leftPointer++
            swap(list, i, leftPointer)
        }
    }

    val leftPointerPost = leftPointer + 1
    swap(list, leftPointerPost, right)

    return leftPointerPost
}