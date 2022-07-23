fun solutionMissingInteger(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    A.sort()
    var prev: Int? = null
    for (a in A) {
        if (a <= 1) {
            prev = a
        } else if (prev == null) return 1
        else if (a - prev > 1) return maxOf(1, prev + 1)
        else prev = a
    }
    return maxOf(A.last() + 1, 1)
}