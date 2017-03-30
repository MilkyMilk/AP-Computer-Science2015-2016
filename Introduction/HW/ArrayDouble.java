import java.util.Arrays;
public class ArrayDouble {
  public static void main(String[] args) {
    String[] names = {"Anthony", "Adam", "Akshay", "Arman"};
    String[] moreNames = new String [names.length * 2];
    for (int i = 0; i < names.length; i++) 
      moreNames[i] = names[i];
    names = moreNames;
    System.out.println(Arrays.toString(names));
    int[] newArray = new int[23];
  }
}