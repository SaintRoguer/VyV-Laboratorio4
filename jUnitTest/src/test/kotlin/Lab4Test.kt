import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Lab4Test {
    private val lab4 = Lab4()

    @Test
    fun reverseIfEvenLastDigitTest() {
        val result = lab4.reverseIfEvenLastDigit(4651198)
        Assertions.assertEquals(5, result)
    }

    @Test
    fun doNotReversIfUnevenLastDigitTest(){
        val result = lab4.reverseIfEvenLastDigit(4651199)
        Assertions.assertEquals(4651199, result)
    }

    @Test
    fun matchWhiteColourWithRGB(){
        val result = lab4.matchingNumbersWithBaseColours(0,0,0)
        Assertions.assertEquals("it is not a basic colour",result)
    }

    @Test
    fun matchRedColourWithRGB(){
        val result = lab4.matchingNumbersWithBaseColours(255,0,0)
        Assertions.assertEquals("red",result)
    }

    @Test
    fun matchGreenColourWithRGB(){
        val result = lab4.matchingNumbersWithBaseColours(0,255,0)
        Assertions.assertEquals("green",result)
    }

    @Test
    fun matchBlueColourWithRGB(){
        val result = lab4.matchingNumbersWithBaseColours(0,0,255)
        Assertions.assertEquals("blue",result)
    }

    @Test
    fun oneIsNotAPrimeNumber(){
        val result = lab4.isPrime(1)
        Assertions.assertFalse(result)
    }

    @Test
    fun isAPrimeNumber(){
        val result = lab4.isPrime(13)
        Assertions.assertTrue(result)
    }

    @Test
    fun isNotAPrimeNumber(){
        val result = lab4.isPrime(144)
        Assertions.assertFalse(result)
    }

}