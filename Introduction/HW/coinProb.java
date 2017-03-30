public class coinProb {
  public static void main(String[] args) {
    int headCount = 0;
    int tailCount = 0;
    for (int i=0; i<Integer.parseInt(args[0]); i++) {
      double x = Math.random();
      if (x < 0.5) 
        headCount++;
      else
        tailCount++;
    }
    System.out.println("Heads Average: " + (headCount * 1.00000) / Integer.parseInt(args[0]));
    System.out.println("Tails Average: " + (tailCount * 1.00000) / Integer.parseInt(args[0]));     
  }
}