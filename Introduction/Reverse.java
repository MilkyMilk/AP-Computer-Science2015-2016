public class Reverse {
  public static void main(String[] args) {
    //write code that reverses it!
    //21 outputs 12
    int number = Integer.parseInt(args[0]);
    //int size = Integer.SIZE(number);
    int newNumber = 0;
    while (number > 0) {
      int reset = number / 10;
      int laNumber = number % 10;
      System.out.print(laNumber);
      number = reset; 
    }
  }
}