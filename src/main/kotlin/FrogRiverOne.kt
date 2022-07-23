
fun solutionFrogRiverOne(X: Int, A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val set = mutableSetOf<Int>()
    for (i in A.indices) {
        set.add(A[i])
        if (set.size == X) return i
    }
    return -1
}