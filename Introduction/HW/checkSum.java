public class checkSum {
  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    int isbn9d = input;
    int total = 0;
    
    //calculates the total sum
    for (int i=2; i < 11; i++) {
      int number = input % 10;
      total = total + i * number;
      input = input / 10;
    }
    
    //calculates the check sum
    int checkSum = 11 - (total % 11);
    if (checkSum == 11)
      checkSum = 0;
    else if (checkSum == 10)
      System.out.println("ISBN number: " + isbn9d + "X");
    else 
      System.out.println("ISBN number: " + isbn9d + checkSum);
    
  }
}

