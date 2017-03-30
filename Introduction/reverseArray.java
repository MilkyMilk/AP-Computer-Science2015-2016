public class reverseArray {
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int[] newArray = new int[a.length];
    
    
    int count = 0;
    for (int i = a.length - 1; i >= 0; i--) {
      newArray[i] = a[count];
      count++;
    }
    
    a = newArray;
    for (int i = 0; i < a.length; i++)
      System.out.print(a[i]); 
  }
}
