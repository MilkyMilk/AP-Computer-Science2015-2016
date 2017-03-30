import java.util.*;
import java.io.*;

public class KMerChallengeRevised
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
          String[] mer = new String[73756]; //stores the mers
          int[] merCount = new int[mer.length]; //stores mers occurences (mer.get(0) --> merCount.get(0)
          
          //runs mer by mer through entire string
          int count = 0;
          for (int i = 0; i < dna.length() - k + 1; i++) { 
            String currentRun = dna.substring(i, i+k); //establishes current mer to check
            
            //makes spot in mer for the specific mer and adds 1 if it already exists
            int crNew = 0;
            
            for (int j = 0; j < mer.length; j++) { 
              if (currentRun.equals(mer[j])) {
                merCount[j]++;
                crNew = 5;
                break;
              }
            }
            if (crNew == 0) {
              mer[count] = currentRun;
              merCount[count] = 1;
            }
          }
          
          //prints out max mer (doesn't do ties)
          int max = merCount[0]; //currently boken, need to base it off index value from line below
          int index = 0;
          for (int i = 1; i < merCount.length; i++){
            if (max < merCount[i]) {
                  max = merCount[i];
                  index = i;
            }
          }
          //System.out.println(max);
          //prints out all mer's in string, and their frequency
          //System.out.println(merCount.toString());
          //System.out.println(mer.toString());
        
        //System.out.println(merCount.size());
        //these output statements cannot be changed (for fairness during the competition)
        System.out.println("Most Frequent " + k + "-mer = " + mer[index]); //make index of
        System.out.println("frequency = " + max);
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
        