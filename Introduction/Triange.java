/**
 * Triangle Homework
 * 
 * @author Malcolm Scruggs
 * 
 * @version Sept. 8 2015
 */

public class Triange
{
  public static void main(String[] args) 
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
   
    
    System.out.println((a + b > c) && (a + c > b) && (b + c > a));
    
    boolean check = (a + b > c) && (a + c > b) && (b + c > a);
    System.out.println(check);
    
    
    
    
    // run Triange 3 4 5
    // run Triange 33 1 1
    
   /* if (check == true) {
       System.out.println("True.");
    } else {
      System.out.println(false);
    }
    */
 
    /*if (a + b <= c) {
      System.out.println("False.");
    } else if (a + c <= b) {
      System.out.println("False.");
    } else if (b + c <= a) {
      System.out.println("False.");
    } else {
      System.out.println("True.");
    } */  
  }
}
