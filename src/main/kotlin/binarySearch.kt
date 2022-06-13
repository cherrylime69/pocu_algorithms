fun binarySearch(list: List<Int>, left: Int, right: Int, value: Int): Int {
    val mid = (right + left) / 2

    if (left > right) {
        return -1
    }

    return if (value < list[mid]) {
        binarySearch(list, left, mid - 1, value)
    } else if (value > list[mid]) {
        binarySearch(list, mid + 1, right, value)
    } else {
        mid
    }

}