import java.util.*; 
public class merFrequencySecond {  
  public static void count(String dna, int k) {
    ArrayList<String> mers = new ArrayList<String>();
    ArrayList<Integer> mersCount = new ArrayList<Integer>();
    
    
    String currentRun;
    for (int i = 0; i <dna.length()-k+1; i++) {
      currentRun = dna.substring(i, i+k);
      System.out.println(currentRun);
      
       //checks if current mer exists in mers
        //exist  -1 doesn't exist
        int exist = -1;
      for (int q = 0; i < mers.size(); q++) {
          if (mers.get(q).equals(currentRun))
            exist = 1;
        }
        if (exist == -1) {
          System.out.println("ayy");
          mers.addAll(Arrays.asList(currentRun));
          mersCount.add(0);
        }
      
        
      for (int j = 0; i < mers.size(); j++) {

        if (mers.get(j).equals(currentRun))
            mersCount.set(j, mersCount.get(j) + 1);
        // arrayList.set(i, newValue);
      }
    }
    
    System.out.print(mers);
    System.out.print(mersCount);

    
  }
  
  public static void main(String[]args){
    count("AAAGGGTTTTTTTTTTTT",3);
  }
}
