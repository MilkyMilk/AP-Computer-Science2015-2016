//Write code that simulates 100 coin flips and prints out the largest run of 
//either consecutive heads or consecutive tails.  

//For example, if your flips are HTTHHHHHTT then you should print out: 
  //Longest Run: 5

public class longR {
  
  //Run 100 experiments and calculate longest run
  public static int flipX(int howMany) {
    int longestRun = 0;
    int counterHeads = 0;  //Heads is below .5
    int counterTails = 0;  //Tails is above .5
    double x = 0.0;
    
    for (int i = 0; i <= howMany; i++) {
      x = Math.random();
      
      //Heads
      if (x < 0.5 && counterHeads > 0) {
        //System.out.println("H");
        counterHeads++;
        if (counterHeads > longestRun)
          longestRun = counterHeads;
        counterTails = 0;
      }
      else if (x < 0.5) {
        //System.out.println("H");
        counterHeads++;
        counterTails=0;
        if (counterHeads > longestRun)
          longestRun = counterHeads;      
      }
      
      //tails
      else if (x > 0.5 && counterTails > 0) {
        //System.out.println("T");
        counterTails++;
        if (counterTails > longestRun)
          longestRun = counterTails;
        counterHeads = 0;
      }
      else if (x > 0.5) {
        //System.out.println("T");
        counterTails++;
        counterHeads = 0;
        if (counterTails > longestRun)
          longestRun = counterTails;
      }    
    }
    return longestRun;
  }
  
  public static void main(String[] args) {
    int sum = 0;
    int streakOf5 = 0;
    
    for (int i = 0; i <= 10000000; i++) {
      int theRun = flipX(100);
      sum += theRun;
      if (theRun > 4)
        streakOf5++;
    }
    
    //System.out.println(sum);
    //System.out.println(streakOf5);
    //double average = sum / 10000000;
    //double averageStreakOf5 = streakOf5 / 10000000;
    System.out.println("Average streak: " + sum / 10000000.0);
    System.out.println("Average streak over 5: " + streakOf5 / 10000000.0);
  }
}
