fun solutionMaxCounters(N: Int, A: IntArray): IntArray {
    // write your code in Kotlin 1.3.11 (Linux)
    val res = mutableMapOf<Int, Int>()
    var min = 0
    var max = 0
    for (a in A) {
        if (a <= N) {
            val v = res.compute(a) { k, v -> if (v == null) min + 1 else v + 1 }
            max = maxOf(v!!, max)
        } else {
            res.clear()
            min = max
        }
    }
    val resList = mutableListOf<Int>()
    for (i in 1..N) {
        resList.add(res.getOrDefault(i, min))
    }
    return resList.toIntArray()

}