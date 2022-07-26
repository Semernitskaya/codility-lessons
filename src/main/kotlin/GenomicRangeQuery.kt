
fun solutionGenomicRangeQuery(S: String, P: IntArray, Q: IntArray): IntArray {
    // write your code in Kotlin 1.3.11 (Linux)
    var minsLeft = MutableList(S.length) { 0 }
    var minsRight = MutableList(S.length) { 0 }

    for (i in S.indices) {
        val rightIndex = S.lastIndex - i
        if (i == 0) {
            minsLeft[i] = valOf(S[i])
            minsRight[rightIndex] = valOf(S[rightIndex])
        }
        else {
            var current = valOf(S[i])
            if (minsLeft[i - 1] > current) minsLeft[i] = current
            else minsLeft[i] = minsLeft[i - 1]

            current = valOf(S[rightIndex])
            if (minsRight[rightIndex + 1] > current) minsRight[rightIndex] = current
            else minsRight[rightIndex] = minsRight[rightIndex + 1]
        }
    }

    var res = mutableListOf<Int>()
    for ((start, end) in P.zip(Q)) {

        if(minsLeft[start] > minsLeft[end]) {
            res.add(minsLeft[end])
            continue
        }
        if(minsRight[end] > minsRight[start]) {
            res.add(minsRight[start])
            continue
        }
        res.add(calculateMin(S, start, end))
    }
    return res.toIntArray()
}

private fun calculateMin(S: String, start: Int, end: Int): Int {
    var min = 4
    for (j in start..end) {
        val letter = S[j]
        min = minOf(min, valOf(letter))
        if (min == 1) break
    }
    return min
}

fun valOf(letter: Char): Int =
    when(letter) {
        'A' -> 1
        'C' -> 2
        'G' -> 3
        'T' -> 4
        else -> 100
    }

