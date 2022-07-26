
fun solutionCountDiv(A: Int, B: Int, K: Int): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    var first = A / K
    first = if (K * first < A) first + 1 else first
    var last = B / K
    return last - first + 1
}