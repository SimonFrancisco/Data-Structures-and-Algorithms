package assignments.arrays.easy

/**
 * 1480. Running Sum of 1d Array
 */
fun runningSum(nums: IntArray): IntArray {
    for (num in 0..<nums.size-1) {
        nums[num + 1] = nums[num] + nums[num + 1]
    }
    return nums
}