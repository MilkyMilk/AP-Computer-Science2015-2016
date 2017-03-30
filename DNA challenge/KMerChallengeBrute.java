import java.util.*;
import java.io.*;

public class KMerChallengeBrute
{
    public static void main(String[] args)
    {
        String dna = readFile("chromosome4.txt"); // reads only 100,000 characters
        dna = removeStreaks(dna);  // removes streaks of A's and T's
        
        long startTime = System.nanoTime(); // start the clock
   
        for (int k=3; k<=10; k++)
           mostCommonKmer(dna,k); 
        
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Execution time: " + (double)estimatedTime/1000000000 + " seconds");
        
        
        
    }
    
    
    
    public static void mostCommonKmer(String dna, int k)
    {
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
        
        
        //these output statements cannot be changed (for fairness during the competition)
        //System.out.println("Most Frequent " + k + "-mer = " + mer.get(merCount.indexOf((max)))); //make index of
        //System.out.println("frequency = " + max);
    }
        
        
        
    
    public static String readFile(String fileName)
    {
        // Location of file to read
        File file = new File(fileName);
        String text = "";
        int lines = 0;
 
        try 
        {
 
            Scanner scanner = new Scanner(file);
            
            // 60 characters per line * 1667 lines = 100,020 characters of text
            // or approximately 100,000 nucleotides
            while (scanner.hasNextLine() && lines < 1667) 
            {
                
                text += scanner.nextLine();
                lines++;
            }

            scanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        return text;
    }
        
    
    
    private static String removeStreaks(String dna)
    {
        dna = dna.replaceAll("AAA","");
        dna = dna.replaceAll("AAAA","");
        dna = dna.replaceAll("AAAAA","");
        dna = dna.replaceAll("AAAAAAA","");
        dna = dna.replaceAll("TTT","");
        dna = dna.replaceAll("TTTT","");
        dna = dna.replaceAll("TTTTT","");
        dna = dna.replaceAll("TTTTTTT","");
        
        return dna;
    }
     

}
        