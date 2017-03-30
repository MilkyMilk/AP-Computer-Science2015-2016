public class Uniform {
  public static void main(String[] args) {
    
    double HowMany = Double.parseDouble(args[0]); //how many numbers to generate
    int i = 0;
    double sum = 0;
    
    while (i <= HowMany){
      double x = Math.random();
      sum = sum + x;
      i++;
    }
    System.out.println("Average: " + (sum/HowMany));
  }
}
    
      