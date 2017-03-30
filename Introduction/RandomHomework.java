/**
 * Random Number Homework
 * 
 * @author Malcolm Scruggs
 * 
 * @version September 8
 */

/*
 * Exercise 1.2.19
Write a program that takes two int values a and b from the command line and prints a random integer between a and b.

Exercise 1.2.20
Write a program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).

You can write both of your solutions in the same program.

Use the Math.random() method for your solution.
*/


public class RandomHomework
{
  public static void main(String[] args)
  {
    //number one
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    System.out.println((int) (Math.random() * (a - b + 1) + b));
    
    //number two
    
    System.out.println((int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1));
  }
}
    