package lectures.arraysAndArraList.exercises

fun main() {
    val list = mutableListOf(1, 23, 9, 18, 8, 10)
    reverse(list)
    println(list)

}

private fun reverse(list: MutableList<Int>) {
    var start = 0
    var end = list.size - 1
    while (start < end) {
        swap(list, start, end)
        start++
        end--
    }

}

private fun swap(list: MutableList<Int>, start: Int, end: Int) {
    val temp = list[start]
    list[start] = list[end]
    list[end] = temp
}
