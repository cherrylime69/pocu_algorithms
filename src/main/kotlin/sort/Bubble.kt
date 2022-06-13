package sort

fun main() {
    val test = mutableListOf(12, 434, 4, 23, 54, 123)
    bubble(test)
    println(test)
}


fun bubble(list: MutableList<Int>) {
    for (i in list.indices) {
        for (j in 0 until list.size - 1 - i) {
            if (list[j] > list[j + 1]) {
                val tem = list[j]
                list[j] = list[j + 1]
                list[j + 1] = tem
            }
        }
    }

}
