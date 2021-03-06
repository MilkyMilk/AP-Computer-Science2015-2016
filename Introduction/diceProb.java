public class diceProb {
  public static void main(String[] args) {
    //Statistical Probabilities
//    System.out.println("Cacluclated Probablilites");
//    System.out.println("Probability of getting a 2 or 12:  0.027777777777777776");
//    System.out.println("Probability of getting a 3 or 11: 0.05555555555555555");
//    System.out.println("Probability of getting a 4 or 10: 0.08333333333333333");
//    System.out.println("Probability of getting a 5 or 9: 0.1111111111111111");
//    System.out.println("Probability of getting a 6 or 8: 0.1388888888888889");
//    System.out.println("Probability of getting a 7: 0.16666666666666666");
//    System.out.println();
    
    //counter
    int[] counter = new int[13];
    
    //caclucates roll and total
    for (int i = 0; i < Integer.parseInt(args[0]); i++) {
      int sum = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
      counter[sum]++;  
    }
    
    System.out.println("Empirical Probablilites");
    for (int i = 2; i <= 12; i++)
      System.out.println("Probablility of getting a " + i + ": " +  (counter[i] / (Integer.parseInt(args[0]) * 1.0)));
    
  }
}
