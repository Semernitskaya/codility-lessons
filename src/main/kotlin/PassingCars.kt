
fun solutionPassingCars(A: IntArray): Int {
    // write your code in Kotlin 1.3.11 (Linux)
        var oneCount = A.sum()
        var res = 0
        for (a in A) {
            if (a == 1) {
                oneCount = maxOf(0, oneCount - 1)
            } else {
                res += oneCount
            }
            if (res > 1_000_000_000) return -1
        }
        return res
}