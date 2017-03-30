//import java.util.*; 
public class merFrequency {  
  public static void count(String dna, int k) {
    //all posible combinations
    String[] permutes = {"AAA", "AAC", "AAT", "AAG", "ACA", "ACC", "ACT", "ACG", "ATA", "ATC", "ATT", "ATG", 
                       "AGA", "AGC", "AGT", "AGG", "CAA", "CAC", "CAT", "CAG", "CCA", "CCC", "CCT", "CCG", "CTA", 
                       "CTC", "CTT", "CTG", "CGA", "CGC", "CGT", "CGG", "TAA", "TAC", "TAT", "TAG", "TCA", "TCC", 
                       "TCT", "TCG", "TTA", "TTC", "TTT", "TTG", "TGA", "TGC", "TGT", "TGG", "GAA", "GAC", "GAT", 
      "GAG", "GCA", "GCC", "GCT", "GCG", "GTA", "GTC", "GTT", "GTG", "GGA", "GGC", "GGT", "GGG"};
    int[] merCount = new int[permutes.length]; // counts number permutes[0] --> merCount[0]
   
    
   // set merCount to count how many of each mer occurs
    String currentRun;
    for (int i = 0; i < dna.length()-k+1; i++) {
      currentRun = dna.substring(i, i+k);
      for (int j = 0; j < permutes.length; j++) {
        if (currentRun.equals(permutes[j])) {
          merCount[j]++;
          break;
        }
      }
    }
    
    //find out biggest
    int index = 0;
    int temp = merCount[0];
    int index2 = -1;
    
    for (int i = 1; i < merCount.length; i++) {
      if (temp < merCount[i]) {
        temp = merCount[i];
        index = i;
      } else if (temp == merCount[i]) {
        index2 = i;
      }
    }
    if (index2 != index)
      index2 = -1;
    
    
    //prints result
    if (index2 != -1 ) {
      System.out.println("Most common mer: " + permutes[index] + " & " + permutes[index2]);
      System.out.println("Occurs " + merCount[index] + " times");
    } else {
      System.out.println("Most common mer: " + permutes[index]);
      System.out.println("Occurs " + merCount[index] + " times");
    }
  }
  
  
  public static void main(String[]args){
    count("AAAGGGTTTTTTTTTTTT",3);
  }
  
}
