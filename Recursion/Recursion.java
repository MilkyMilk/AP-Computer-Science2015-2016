public class Recursion {
  public static void print() {
    System.out.print("*");
    print();
  }
  
  public static int factorial(int n) {
    if (n==0)
      return 1;
    return n*factorial(n); 
  }
  
  public static String reverse(String str) {
    if (str.equals("")) 
      return str;
    return str.substring(str.length()-1) + reverse(str.substring(0,str.length()-1));
  }
  
  public static int sumDigits(int n) {
    if (n <= 0)
      return n;
    return n%10 + sumDigits(n/10);
  }
}