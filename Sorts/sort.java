import java.util.*;
public class sort {
  
  public static void main(String[] args) {
    Integer[] arr = {1,2,3,4,5,6,7,9,8,7,6,5,4,3,2,1,3,4,4,5,4,5,6,7,4,4,7,4,4,4,8,7,6,4,4,4,4,4,4,4};
    Integer[] arr2 = {1,2,3,4,5,5};
    insertionSort(arr);
    System.out.println(median(arr2));
    System.out.println(mode(arr));

    System.out.println();
    for (Integer item : arr2) {
      System.out.println(item);
    }
    for (int i=0; i<Integer.parseInt(args[0]) ;i++ ) {
          System.out.println(args[0]);
    }

  }
  
  public static void insertionSort(Comparable[] arr) {
    Comparable temp;
    for (int i = 1; i < arr.length; i++) {
      while (i > 0) {
        if (arr[i].compareTo(arr[i-1]) >= 0)
             break;
        else if (arr[i].compareTo(arr[i-1]) < 0) {
               temp = arr[i];
               arr[i] = arr[i-1];
               arr[i-1] = temp;
               i = i-1;
        }
      }  
    }
  }
  
  public static int mode(Integer[] arr) {
    insertionSort(arr);
    int currentMax = 0;
    int currentInt = arr[0];
    int globalMax = 0;
    int globalInt = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == currentInt) {
        currentMax++;
      }
      else {
        currentInt = arr[i];
        currentMax = 0;
      }
      
      if (currentMax > globalMax) {
        globalMax = currentMax;
        globalInt = arr[i];
      }
    }
    return globalInt; 
  }
  
  public static double median (Integer[] arr) {
    if (arr.length%2 == 0)
      return (arr[arr.length/2] + arr[(arr.length/2) -1])/2;
    else
      return arr[arr.length/2];
  }
  
}