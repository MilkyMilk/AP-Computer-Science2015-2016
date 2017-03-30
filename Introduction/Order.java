/* Order check. Write a program that takes three double values x, y, and z as command-line arguments and 
 * prints true if the values are strictly ascending or descending (x < y < z or x > y > z), and false otherwise.

Exercise 1.2.30

Uniform random numbers. Write a program that prints five uniform random values between 0 and 1, 
their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().

 

Remember:  You can not use if statements or any programming concepts beyond Section 1.2

Hint:  You might have to make a method call to Math.min() and Math.max() multiple times!
*/


/**
 * Order Check and Uniform
 * 
 * @author Malcolm Scruggs
 * 
 * @Version September 10
 */

public class Order {
  public static void main(String[] args) {
    //number one
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double z = Double.parseDouble(args[2]);
    
    System.out.println( ((x > y) && (y > z)) || ((z > y) && (y > x)));
    
    //number two
    double num1 = Math.random();
    double num2 = Math.random();
    double num3 = Math.random();
    double num4 = Math.random();
    double num5 = Math.random();
    
    System.out.println("Numbers: " + num1 + " " +  num2 + " " +  num3 + " " + num4 + " " + num5);  
    
    double average = (num1 + num2 + num3 + num4 + num5) / 5; //find average
    System.out.println("Average: " + average);
    
    double numMin = Math.min(num1,num2); //find min
    numMin = Math.min(numMin,num3); 
    numMin = Math.min(numMin, num4); 
    numMin = Math.min(numMin,num5);
    System.out.println("Min " + numMin); 
    
    double numMax =  Math.max(num1,num2); //find max
    numMax = Math.max(numMax,num3); 
    numMax = Math.max(numMax,num4); 
    numMax = Math.max(numMax,num5);
    System.out.println("Max: " + numMax); 
    
    System.out.print(" Hi \n I \n suck \n becuase \n I \n am \n Akshay \n");
 
    int a = (int)((Math.random() * 10) + 1);
    System.out.print(a);
  }
}
