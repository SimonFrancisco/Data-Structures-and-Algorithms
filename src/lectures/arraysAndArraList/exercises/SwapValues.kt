package lectures.arraysAndArraList.exercises

fun main() {
    test()
}

private fun swap(list: MutableList<Int>, firstIndex: Int, secondIndex: Int) {
    val temp = list[firstIndex]
    list[firstIndex] = list[secondIndex]
    list[secondIndex] = temp
}

private fun test() {
    val list = mutableListOf(1, 3, 23, 9, 18)
    swap(list, 1, 2)
    println(list)
}