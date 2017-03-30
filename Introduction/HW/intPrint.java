//Write a program that, using one for loop and one if statement, 
//prints the integers from 1000 to 2000 with five integers per line. Hint: use the % operator.
public class intPrint {
  public static void main(String[] args){
  
    for (int i = 1000; i<1996; i=i+5){ 
    //System.out.println(i + " "+ (i+1) + " " + (i+2) " " + (i+3) + " " + (i+4));
      System.out.print(i + " ");
      System.out.print(i+1 + " ");
      System.out.print(i+2 + " ");
      System.out.print(i+3 + " ");
      System.out.println(i+4 + " ");
      if (i == 1995) {
        System.out.print(i+5);
      }
        
    }  
  }
}
  