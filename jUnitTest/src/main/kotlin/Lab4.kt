class Lab4 {

    fun reverseIfEvenLastDigit(number: Int): Int {
        return if ((number % 10) % 2 == 0)
            reverse(number)
        else
            number
    }

    private fun reverse(toReverse: Int): Int {
        var number = toReverse
        var reversed = 0
        while (number != 0) {
            val digit = number % 10
            reversed = reversed * 10 + digit
            number /= 10
        }
        return reversed
    }

    fun matchingNumbersWithBaseColours(red: Int, green: Int, blue: Int): String =
        when {
            (red == 255 && green == 0
                    && blue == 0)
            -> "red"
            (red == 0 && green == 255
                    && blue == 0)
            -> "green"
            (red == 0 && green == 0
                    && blue == 255
                    )
            -> "blue"
            else -> "it is not a basic colour"
        }

    fun isPrime(numberToTest: Int):Boolean{
        if(numberToTest<2)
            return false
        else
            return isPrimeAux(numberToTest)
    }

    private fun isPrimeAux(numberToTest:Int):Boolean{
        var isPrime = true
        for (i in 2..numberToTest / 2) {
            if (numberToTest % i == 0) {
                isPrime = false
                return isPrime
            }
        }
        return isPrime
    }

}