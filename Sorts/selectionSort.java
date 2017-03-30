public class selectionSort {

  public static void main(String[] args) { 
    int[] arr = {1,2,3,4,7,8,9,6,5,4,3};
    selectionSort(arr);
    for (int i=0;i < arr.length;i++) {
      System.out.println(arr[i]);
    }
  }
  
  //Sorter.selectionSort(thingy);
  public static void selectionSort(int[] arr) {
    for (int i = 0; i <arr.length - 1; i++) {
      //find smallest in arr[i] through arr[arr.length-1]
      //and remember the index
      int smallest = arr[i];
      int indexOfSmallest = i;
      for (int j = i+1; j < arr.length; j++) {
        if (arr[j] < smallest) {
          smallest = arr[j];
          indexOfSmallest = j;
        }
      }
      
      //swap arr[indexOfSmallest] with arr[i]
      swap(arr, indexOfSmallest, i);
      
    }
  }
  //swap arr[i] with arr[j]
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
   
}