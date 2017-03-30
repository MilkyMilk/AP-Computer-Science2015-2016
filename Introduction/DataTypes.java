/**
 * Data Types.
 * 
 * In class challenge
 * 
 * @author Malcolm Scruggs
 * @version sept 2, 2015
 */


public class DataTypes
{
  //Java is strongly typed language
  
  //types: int, double, char, boolean, string
  //strings is a type but is not primitive (its considered a class)
  
  public static void main(String[] args)
  {
   /* int age; //declaration statement
    age = 17; //assignment
    
    int iq = 25; //compacted assignment
    
    int a = 1, b = 2;
    
    int whatNumberAmI = 0;
    System.out.println(whatNumberAmI);
    */
    
    //Challenge 1: Swap values of a and b
    int a = 10;
    int b = 15;
    
    System.out.println("a = " + a + " b= " + b);
    
    int temp = a;
    a = b;  
    b = temp;
    
    System.out.println("a = " + a + " b= " + b);
    
    //Challenge 2: swap values of a and b without an extra variable
    
    a = 25;
    b = 69;
    
    a = b + a;
    b = a - b;
    a = a - b;
    
    
    System.out.println("a = " + a + " b= " + b);
  }
}
    
    
    
    
    