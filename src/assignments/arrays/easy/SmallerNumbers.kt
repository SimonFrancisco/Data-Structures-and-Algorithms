package assignments.arrays.easy

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 */
fun main() {
    val array = intArrayOf(8, 1, 2, 2, 3)
    val answer = smallerNumbersThanCurrent(array)
    println(answer.joinToString(", "))
}

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var i = 0
    var answer = 0
    val array = IntArray(nums.size)
    while (i != nums.size) {
        for (j in nums.indices) {
            if (i == j) {
                continue
            }
            if (nums[i] > nums[j]) {
                answer++
            }
        }
        array[i] = answer
        i++
        answer = 0

    }
    return array
}