import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GenomicRangeQueryTest {

    @Test
    fun solutionGenomicRangeQuery() {
        assertArrayEquals(intArrayOf(2, 4, 1),
            solutionGenomicRangeQuery("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)))
        assertArrayEquals(intArrayOf(1),
            solutionGenomicRangeQuery("GGGAG", intArrayOf(2), intArrayOf(3)))
        assertArrayEquals(intArrayOf(1),
            solutionGenomicRangeQuery("AAGGGGG", intArrayOf(1), intArrayOf(3)))

        assertArrayEquals(intArrayOf(1), solutionGenomicRangeQuery("A", intArrayOf(0), intArrayOf(0)))
        assertArrayEquals(intArrayOf(4), solutionGenomicRangeQuery("T", intArrayOf(0), intArrayOf(0)))
    }
}