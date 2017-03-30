import java.util.*;
public class merBrute {
  public static void count(String dna, int k) {
    //Overarching variables
    int masterCount = 0;
    ArrayList<String> ties = new ArrayList<String>(); //stores the mer 
    
    //runs mer by mer through entire string
    for (int i = 0; i < dna.length() - k + 1; i++) { 
 
      //scans string for all of one mer
      int count = 0;
      String currentRun = dna.substring(i, i+k); 
      for (int j = i; j < dna.length() - k+1; j++) {
        if (dna.substring(j, j+k).equals(currentRun))
          count++;
      }
      
      //Compares count and Current run to master
      if (count > masterCount) {
        masterCount = count;
        ties.clear();
        ties.add(currentRun);
      } else if (count == masterCount) {
        ties.add(currentRun);
      }
    }
    System.out.println(masterCount);
    System.out.println(ties.toString());
  }
  
  
    public static void main(String[]args){
    count("AAAATTTTCGCGCTTCGCTCGGCTTCGGCTTCGGCTTCGATAGATTATATATAGAGACAAACGTACGTACGTACGCTAACGTCATCGATCCGTACGTACGCTGA",4);
  }
}