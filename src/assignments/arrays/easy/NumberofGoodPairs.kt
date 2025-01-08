package assignments.arrays.easy

/**
 * 1512. Number of Good Pairs
 */
fun numIdenticalPairs(nums: IntArray): Int {
    var i = 0
    var answer = 0
    while (i != nums.size) {
        for (j in nums.indices) {
            if (i == j || j < i) {
                continue
            }
            if (nums[i] == nums[j]) {
                answer++
            }
        }
        i++
    }
    return answer
}