package assignments.arrays.easy

/**
 * 1470. Shuffle the Array
 */

fun shuffle(nums: IntArray, n: Int): IntArray {
    var shift = 1
    val answer = IntArray(n * 2)
    answer[0] = nums[0]
    answer[answer.size - 1] = nums[nums.size - 1]
    for (i in nums.indices) {
        if (shift == n) {
            break
        }
        val positionFromRight = i + 1
        answer[positionFromRight + shift] = nums[positionFromRight]
        shift++
    }
    shift = 1
    for (i in nums.size - 1 downTo 0) {
        if (shift == n) {
            break
        }
        val positionFromLeft = i - 1
        answer[positionFromLeft - shift] = nums[positionFromLeft]
        shift++

    }
    return answer

}