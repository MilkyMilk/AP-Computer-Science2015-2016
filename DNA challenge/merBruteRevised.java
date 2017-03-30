import java.util.*;
import java.io.*;
public class merBruteRevised {
  public static void count(String dna, int k) {
    //Overarching variables
    int masterCount = 0;
    ArrayList<String> mer = new ArrayList<String>(); //stores the mers
    ArrayList<Integer> merCount = new ArrayList<Integer>(); //stores mers occurences (mer.get(0) --> merCount.get(0)
    
    //runs mer by mer through entire string
    for (int i = 0; i < dna.length() - k + 1; i++) { 
      String currentRun = dna.substring(i, i+k); //establishes current mer to check
      
      //makes spot in mer for the specific mer and adds 1 if it already exists
      int crNew = 0;
      for (int j = 0; j < mer.size(); j++) {
        if (currentRun.equals(mer.get(j))) {
          merCount.set(j, merCount.get(j) + 1);
          crNew = 5;
          break;
        }
      }
      if (crNew == 0) {
        mer.add(currentRun);
        merCount.add(1);
      }
    }
    
    //prints out max mer (doesn't do ties)
    System.out.println(Collections.max(merCount)); //currently boken, need to base it off index value from line below
    System.out.println(Collections.max(merCount));
    
    //prints out all mer's in string, and their frequency
    System.out.println(merCount.toString());
    System.out.println(mer.toString());
  }
  
  
    public static void main(String[]args){
    count("AATATAATATATGTGTTTTACACCTATTTAGAACACTCAAAGCTTGGTATATTGGCATAAACTCTAAATATACTGTCAAAGCAGTCCCTACATCATGTCATGGAAATACGGTCTCTTAA",2);
  }
}