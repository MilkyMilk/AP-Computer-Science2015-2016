public class pepyes {
  public static void main(String[] args) {
    int dieRoll = 0;
    int diceRollTotal = 0;
    for (int i = 0; i <= 100000; i++) {
      //1 die
      int count = 0;
      while (count < 6) {
        if ((int) ((Math.random() * 6) + 1) == 1) {
          dieRoll = dieRoll + 1;
          break;
        }
        count++;
      }
     
      //2 dice
      count = 0;
      int check = 0;
      while (count < 12) {
        int rollB = (int) ((Math.random() * 6) + 1);
        if (rollB == 1) 
          check = check + 1;
        if (check == 2 ) {
          diceRollTotal = diceRollTotal + 1;
          check = 0;
          break;
        }
        count++;
      }
    }
        
    double dieAverage = dieRoll / 100000.0;
    double diceAverage = diceRollTotal / 100000.0;
    System.out.println("Getting a 1 with one die percentage: " + dieAverage);
    System.out.println("Getting two 2's with two dice percentage: " + diceAverage);                 
    
    
  }
}
// EXTRA CREDIT
//
// Mathmatical Version
// 
// Rolling 1 die 6 times:
//
// probablity of getting a 1 out of 6 rolls = ((6^6 - 5^6) / 6^6) = (31031/46656) = .66510202
//
//
//Rolling two 1's in 12 rolls:
//
//probabiliy = [(6^12 -5^12) - (12*5^11)] / 6^12 = .618667
