package bot

/*
--Description:
Now you will teach your bot to count. It's going to become an expert in numbers!

--Objective:
In this stage, you will program the bot to count from 0 to any positive number users enter.

**Example
The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.

*Example 1: a dialogue with the new version of the bot

Hello! My name is Aid.
I was created in 2020.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22; that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
Completed, have a nice day!
Note: each number starts with a new line, and after a number, the bot should print the exclamation mark.

 */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

    println("Your age is $age; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    for(num in 0..readln().toUInt().toInt()) println("$num!")
    println("Completed, have a nice day!")
}
