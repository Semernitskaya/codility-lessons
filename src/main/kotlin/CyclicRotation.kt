

fun solutionCyclicRotation(A: IntArray, K: Int): IntArray {
    // write your code in Kotlin 1.3.11 (Linux)
    val list = A.toMutableList()
    if (list.size > 1) {
        repeat(K) {
            val e = list.get(list.size - 1)
            list.removeAt (list.size - 1)
            list.add (0, e)
        }
    }
    return list.toIntArray()
}