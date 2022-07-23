import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TapeEquilibriumTest {

    @Test
    fun solutionTapeEquilibrium() {
        assertEquals(0, solutionTapeEquilibrium(intArrayOf(1, 1)))
        assertEquals(2000, solutionTapeEquilibrium(intArrayOf(1, 2001)))
        assertEquals(200, solutionTapeEquilibrium(intArrayOf(-100, 100)))
        assertEquals(0, solutionTapeEquilibrium(intArrayOf(1, 1, 1, 1)))
        assertEquals(0, solutionTapeEquilibrium(intArrayOf(1, 1, 1, 3)))
        assertEquals(4, solutionTapeEquilibrium(intArrayOf(0, 0, 0, 4)))
        assertEquals(1, solutionTapeEquilibrium(intArrayOf(3, 1, 2, 4, 3)))
    }
}