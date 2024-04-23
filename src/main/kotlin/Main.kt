fun factorialNumber( num: Int ): Int {
    var factorial: Int = 1

    for (x in 1..num) {
        factorial *= x
    }

    return factorial
}

fun primeNumber( num: Int ) {
    val modulo: Int = num % 2

    if(modulo == 1) {
        println("$num is prime")
    } else {
        println("$num is even")
    }
}

fun reverseString( word: String ): String {
    val reversedWord: String = word.reversed()

    return reversedWord
}

fun maximumElement( arr: List<Int> ): Int {
    var maxElement: Int = arr[0]

    for (x in arr.indices) {
        if (maxElement < arr[x]) {
            maxElement = arr[x]
        }
    }

    return maxElement
}

fun fibonacciSequence(term: Int): Int {
    val fibonacciList = mutableListOf<Int>()

    if (term >= 1) fibonacciList.add(0)
    if (term >= 2) fibonacciList.add(1)

    var prev = 0
    var current = 1
    var index = 2

    while (index < term) {
        val next = prev + current
        fibonacciList.add(next)
        prev = current
        current = next
        index++
    }

    return fibonacciList.lastIndex
}

fun isPalindrome( str: String ) {
    val cleanStr = str.replace(Regex("[^A-Za-z0-9]"), "").lowercase()

    if(cleanStr == cleanStr.reversed()) {
        println("$cleanStr is a palindrome")
    } else {
        println("$cleanStr is not a palindrome")
    }
}

fun sumOfDigits ( digits: Int ): Int {
    var num = digits
    var sum = 0

    while (num != 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}

fun greatestCommonDivisor(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    if (num1 < num2) {
        val temp = num1
        num1 = num2
        num2 = temp
    }

    while (num2 != 0) {
        val remainder = num1 % num2
        num1 = num2
        num2 = remainder
    }

    return num1

}

fun countVowels(input: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var vowelCount = 0

    for (char in input) {
        if (char in vowels) {
            vowelCount++
        }
    }

    return vowelCount
}

fun convertCelsiusToFahrenheit( celsiusTemp: Int): Double {
    val convertedTemp: Double = (celsiusTemp.toDouble() * 1.8) + 32

    return convertedTemp
}

fun main() {
    val number1 = 7
    val number2 = 56
    val array = listOf(1,2,3)
    val string = "Hello World"
    val temperature = 70

    println("The Factorial of $number1 is ${factorialNumber(5)}")

    primeNumber(number1)

    println("The word $string in reversed is ${reverseString(string)}")

    println("In the list of $array, the maximum element is ${maximumElement(array)}")

    isPalindrome("Rotator")

    println("The $number1 term in Fibonacci is  ${fibonacciSequence(number1)}")

    println("The sum of the digit $number2 is ${sumOfDigits(number2)}")

    println("The Greatest Common Divisor of $number1 and $number2 is ${greatestCommonDivisor(number1,number2)}")

    println("The string $string has ${countVowels(string)} vowels")

    println("$temperature°C in fahrenheit is ${convertCelsiusToFahrenheit(temperature)}°F")
}
