package assignments.arrays.easy

fun getConcatenation(nums: IntArray): IntArray {
    val ans = IntArray(nums.size * 2)
    nums.copyInto(ans, 0, 0, nums.size)
    nums.copyInto(ans, ans.size / 2, 0, nums.size)

    return ans
}
fun getConcatenation2(nums: IntArray): IntArray {
    val ans = IntArray(nums.size * 2)
    repeat(2) {
        for (num in nums.indices) {
            if (it == 1) {
                ans[num] = nums[num]
            } else {
                ans[num + nums.size] = nums[num]
            }

        }
    }
    return ans
}
