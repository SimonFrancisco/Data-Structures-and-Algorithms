package assignments.arrays.easy

/**
 * 1672. Richest Customer Wealth
 */
fun maximumWealth(accounts: Array<IntArray>): Int {
    var wealth = 0
    var temp = 0
    for (i in 0..<accounts.size) {
        for (j in 0..<accounts[i].size) {
            temp += accounts[i][j]
        }
        if (temp > wealth) {
            wealth = temp
        }
        temp = 0
    }
    return wealth
}