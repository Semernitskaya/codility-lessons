import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CyclicRotationTest {

    @Test
    fun solutionCyclicRotation() {
        assertArrayEquals(intArrayOf(), solutionCyclicRotation(intArrayOf(), 1))
        assertArrayEquals(intArrayOf(), solutionCyclicRotation(intArrayOf(), 0))
        assertArrayEquals(intArrayOf(1, 1, 1), solutionCyclicRotation(intArrayOf(1, 1, 1), 0))
        assertArrayEquals(intArrayOf(1, 1, 1), solutionCyclicRotation(intArrayOf(1, 1, 1), 3))
        assertArrayEquals(intArrayOf(9, 7, 6, 3, 8), solutionCyclicRotation(intArrayOf(3, 8, 9, 7, 6), 3))
        assertArrayEquals(intArrayOf(1, 2, 3, 4), solutionCyclicRotation(intArrayOf(1, 2, 3, 4), 4))
    }
}