import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MissingIntegerTest {

    @Test
    fun solutionMissingInteger() {
        assertEquals(1, solutionMissingInteger(intArrayOf(-1)))
        assertEquals(1, solutionMissingInteger(intArrayOf(2)))
        assertEquals(2, solutionMissingInteger(intArrayOf(1)))
        assertEquals(1, solutionMissingInteger(intArrayOf(-1, -3, -5)))
        assertEquals(1, solutionMissingInteger(intArrayOf(-1, -3, 0)))
        assertEquals(2, solutionMissingInteger(intArrayOf(-1, -3, 1, 3)))
        assertEquals(1, solutionMissingInteger(intArrayOf(2, 3, 5)))
        assertEquals(4, solutionMissingInteger(intArrayOf(1, 2, 3, 5)))
        assertEquals(6, solutionMissingInteger(intArrayOf(1, 2, 3, 4, 5)))
    }
}