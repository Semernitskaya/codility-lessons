import kotlin.math.abs

fun solutionPermMissingElem(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    var sum = A.sum()
    for (i in 1..A.size + 1) {
        sum -= i
    }
    return abs( sum)
}