import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MaxCountersTest {

    @Test
    fun solutionMaxCounters() {
        assertArrayEquals(intArrayOf(3, 2, 2, 4, 2), solutionMaxCounters(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)))
    }
}