import java.util.*;
public class finalMethods {
  public static String fullName(String name) {
    int commaInd = name.indexOf(",");
    return name.substring(commaInd+2) + " " + name.substring(0, commaInd);
  }
  
  public static int numVowels(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i,i+1).equals("a") || 
          str.substring(i,i+1).equals("e") ||
          str.substring(i,i+1).equals("i") ||
          str.substring(i,i+1).equals("o") ||
          str.substring(i,i+1).equals("u"))
        count++;
    }
    return count;
  }
  
  public static void swap (ArrayList<String> list, int index1, int index2) {
    String temp = list.get(index1);
    list.set(index1, list.get(index2));
    list.set(index2, temp);
  }
  
  
  
  public static void main(String[] args) {
    ArrayList<String> list =  new ArrayList<String>();
    list.add("WHoa");
    list.add("no way");
    list.add("so cool");
    swap(list, 0, 2);
    System.out.println(list);
  }
  
}