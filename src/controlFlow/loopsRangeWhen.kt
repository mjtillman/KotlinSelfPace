/*
 * Copyright (c) 2020 Sagar Gupta
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package controlFlow
/*
 * Kotlin supports for, while and do-while loops and the way of defining ranges
 * in loops is different from that in Java, Python. We use .. for an inclusive range.
 * .. step is used to range with a custom increment step for consecutive elements.
 * downTo is used for range in reverse order.
 *
 * One more fact is that we have when in Kotlin that replaces switch events and also can replace
 * if-else if-else recursions.
 *
 * Let's see with examples :)
 */


fun main() {

    // Using .. for having inclusive range
    for (i in 1..9) {
        print("$i ") // prints -> 1 2 3 4 5 6 7 8 9
        // Here, in order to print in same line with space we used print with string template
    }
    println()

    // Using .. with steps for custom increment steps
    for (i in 2..8 step 2) {
        print("$i ") // prints -> 2 4 6 8
    }
    println()

    // Using downTo for reverse oder range
    for (i in 4 downTo 1) {
        print("$i ") // prints -> 4 3 2 1
    }
    println()

    // Looping using characters with steps
    for (i in 'a'..'z' step 2) {
        print(i) // prints -> acegikmoqsuwy
    }
    println()

    // Another use of in
    if (6 !in 7..10) {
        println("6 not in not in the range") // prints -> 6 not in not in the range
    }

    if (5 in 1..6) {
        println("5 is in the range") //prints -> 5 is in the range
    }

    val x = 5..10 // We can also store a range in a variable

    if (4 !in x) {
        println("4 is not available in given range x")
        // prints -> 4 is not available in given range x
    }

    var cake = 0

    // while loop
    while (cake < 5) {
        print(cake) // prints -> 01234
        cake++
    }
    println()

    // do-while loop
    do {
        cake--
        print(cake) // prints -> 43210
    } while (cake >= 1)
    println()

    // Let's talk about when now

    cake = 1 // Try changing the value of cake here and run the program

    when (cake) {
        0 -> println("No cake sorry!")
        1 -> println("One cake available hurry!")
        else -> println("Buy as much as you want")
    }

}