public class LoopsnStuff {
  public static void main(String[] args) {
    int HowMany = Integer.parseInt(args[0]); //how many numbers to generate
    int HowBig = Integer.parseInt(args[1]); //between what numbers
    
    int i = 0;
    int sum = 0;
    
    int max = Integer.MIN_VALUE; //max baseline
    int min = Integer.MAX_VALUE; //min baseline
    
    while (i <= HowMany){
      int x = (int) (Math.random() * HowBig + 1);
      sum = sum + x;
     
      if (x > max) //check if x qualifies for max
        max = x;
      
      if (x < min) //check if x qualifies for min
        min = x;
      
      i++; //Make i one bigger
    }
    double sum2 = 0;
    for (double wow = 1; wow <= 1000; wow = wow + 2){
      sum2 = sum2 + ((1.0/wow) - (1.0/(wow + 1.0)));
    }
    
    System.out.print(sum2);
    
    
    double average = sum / (double) HowMany;
    System.out.println("Average: " + average + " | " + "Min: " + min + " | " + "Max: " + max); 
  }
}
      
      
  