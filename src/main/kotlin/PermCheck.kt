
fun solutionPermCheck(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    A.sort()
    for (index in A.indices) {
        if (A[index] != index + 1) return 0
    }
    return 1
}
