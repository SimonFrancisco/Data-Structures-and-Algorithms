package assignments.arrays.easy

/**
 * 1431. Kids With the Greatest Number of Candies
 *
 */
fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    var greatestNumberOfCandy = 0
    for (candy in candies) {
        if (candy > greatestNumberOfCandy) {
            greatestNumberOfCandy = candy
        }
    }
    val answer = mutableListOf<Boolean>()
    for (candy in candies) {
        if (candy + extraCandies >= greatestNumberOfCandy) {
            answer.add(true)
        } else {
            answer.add(false)
        }
    }
    return answer
}
