public class MathChallenge {
  public static void main(String[] args){
   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]); 
   int max = (int) ((Math.sqrt( a*a + b*b - 2*a*b) + a + b) / 2);
   System.out.println(max);
   
  }
}
