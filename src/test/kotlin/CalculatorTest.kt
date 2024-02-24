
import calculator.Calculator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun testSum(){
        val classUnderTest = Calculator()
        assertEquals(10, classUnderTest.add(5,5))
    }

    @Test
    fun testSubtract(){
        val classUnderTest = Calculator()
        assertEquals(6, classUnderTest.subtract(8,2))
    }

    @Test
    fun testTimes(){
        val classUnderTest = Calculator()
        assertEquals(16, classUnderTest.times(4,4))
    }

    @Test
    fun testDivide(){
        val classUnderTest = Calculator()
        assertEquals(4, classUnderTest.divide(20,5))
    }

}