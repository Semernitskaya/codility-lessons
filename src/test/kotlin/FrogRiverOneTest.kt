import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FrogRiverOneTest {

    @Test
    fun solutionFrogRiverOne() {
        assertEquals(6, solutionFrogRiverOne(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)))
        assertEquals(-1, solutionFrogRiverOne(5, intArrayOf(1, 3, 1, 3, 2, 3, 1, 2)))
    }
}