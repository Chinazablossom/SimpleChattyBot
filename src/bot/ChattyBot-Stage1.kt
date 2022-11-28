package bot

/*
--Description:
Digital personal assistants help people to drive cars, plan their day, buy something online.
In a sense, they are simplified versions of artificial intelligence with whom you can talk.

In this project, you will develop step by step a simple bot that will help you study programming.

--Objective:
For the first stage, you will write a bot who displays a greeting, its name, and the date of its creation. First impressions count!

Your program should print the following lines:

Hello! My name is {botName}.
I was created in {birthYear}.
Instead of {botName}, print any name you choose and replace {birthYear} with the current year (four digits).

**Example
 Output:

Hello! My name is Aid.
I was created in 2020.

 */

fun main() {
    val botName = "Aid"
    val botYearOfCreation = 2022
    println("Hello! My name is $botName.")
    println("I was created in $botYearOfCreation.")
}