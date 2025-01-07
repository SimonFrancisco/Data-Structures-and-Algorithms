package lectures.arraysAndArraList.exercises

fun main() {
    val list = listOf(1, 5, 8, 7, 6, 9, 8)
    println(maxValue(list))
}

private fun maxValue(list: List<Int>): Int {
    var max = Int.MIN_VALUE
    for (number in list) {
        if (number > max) {
            max = number
        }
    }
    return max
}