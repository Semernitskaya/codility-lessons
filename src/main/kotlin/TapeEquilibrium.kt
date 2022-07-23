import kotlin.math.abs

fun solutionTapeEquilibrium(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)

    var sum1 = 0
    var sum2 = A.sum()
    var minDiff = Int.MAX_VALUE

    for (i in 0 until A.size - 1) {
        sum1 += A[i]
        sum2 -= A[i]
        val diff = abs(sum1 - sum2)
        minDiff = if (diff < minDiff) diff else minDiff
    }
    return minDiff
}

