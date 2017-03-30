public class pepyescheck {
  public static void main(String[] args) {
    int dieRoll = 0;
    int diceRollTotal = 0;
    for (int i = 0; i <= 10; i++) {
      //1 die
      int count = 0;
      while (count < 6) {
        int rollA = (int) ((Math.random() * 6) + 1);
        System.out.println("roll A: " + rollA);
        if (rollA == 1) {
          dieRoll = dieRoll + 1;
          System.out.println("die roll: " + dieRoll);
          break;
        }
        
        count++;
      }
      System.out.println("reset");
    }
    System.out.println(dieRoll); 
    System.out.println(dieRoll / 100000.0); 
  }
}