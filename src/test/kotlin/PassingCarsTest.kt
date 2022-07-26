import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PassingCarsTest {

    @Test
    fun solutionPassingCars() {
        assertEquals(0, solutionPassingCars(intArrayOf(1)))
        assertEquals(0, solutionPassingCars(intArrayOf(0)))
        assertEquals(0, solutionPassingCars(intArrayOf(1, 0)))
        assertEquals(1, solutionPassingCars(intArrayOf(0, 1)))
        assertEquals(0, solutionPassingCars(intArrayOf(1, 1, 0, 0)))
        assertEquals(4, solutionPassingCars(intArrayOf(0, 0, 1, 1)))
        assertEquals(5, solutionPassingCars(intArrayOf(0, 1, 0, 1, 1)))
    }
}