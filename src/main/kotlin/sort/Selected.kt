package sort

fun main() {
    val test = mutableListOf(12, 434, 4, 23, 54, 123)
    selectedSort(test)
    println(test)
}

fun selectedSort(list: MutableList<Int>) {
    for (i in list.indices) {
        var min = i
        for (j in 1 + i until list.size) {
            if (list[j] < list[min]) {
                min = j
            }
        }
        if (i != min) {
            val temp = list[i]
            list[i] = list[min]
            list[min] = temp
        }

    }

}