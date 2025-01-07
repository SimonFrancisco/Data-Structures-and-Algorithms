package assignments.arrays

/**
 * 1920. Build Array from Permutation
 */
fun buildArray(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)
    for (num in nums.indices) {
        ans[num] = nums[nums[num]]
    }
    return ans
}