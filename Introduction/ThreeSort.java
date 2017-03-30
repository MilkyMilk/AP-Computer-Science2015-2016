/*
 * Write a program that takes three int values from the command line and prints them in ascending order. 
 * Use Math.min() and Math.max(). You may not use if statements.  Sorry, we'll learn that next in the next section! 
 */

/**
 * Random Number Homework
 * 
 * @author Malcolm Scruggs
 * 
 * @version September 14
 */

public class ThreeSort {
  public static void main(String[] args) {
    
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    
    int first = Math.min(a,b);
    first = Math.min(first,c);
    
    int last = Math.max(a,b);
    last = Math.max(last, c);
    
    int middle = (a + b + c) - (last + first);
    
    System.out.println("Variables: " + a + " " + b + " " + c);
    System.out.println("Order: " + first + ", " + middle + ", " + last);
    
  }
}
    