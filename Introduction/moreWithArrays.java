public class moreWithArrays {
  public static void main(String[] args) {
     int[] random = new int[10];
     int max = Integer.MIN_VALUE;
     int min = Integer.MAX_VALUE;
     
     //fill the array 
     for (int i = 0; i < random.length; i++) {
       random[i] = (int) (Math.random() * 100) + 1;
       
       //find the min & max
       max = Math.max(max, random[i]);
       min = Math.min(min, random[i]);
       
       //prints the array
       if (i == 0)
         System.out.print("Array: [");
       System.out.print(random[i] + ", ");
       if (i == 9)
           System.out.println("]");      
    }  
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }
}