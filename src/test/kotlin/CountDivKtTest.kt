import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CountDivKtTest {

    @Test
    fun solutionCountDiv() {
        assertEquals(1, solutionCountDiv(2, 4, 3))
        assertEquals(1, solutionCountDiv(2, 3, 3))
        assertEquals(1, solutionCountDiv(3, 3, 3))
        assertEquals(1, solutionCountDiv(3, 4, 3))
        assertEquals(0, solutionCountDiv(1, 10, 11))

        assertEquals(10, solutionCountDiv(1, 10, 1))
        assertEquals(3, solutionCountDiv(6, 11, 2))
    }
}