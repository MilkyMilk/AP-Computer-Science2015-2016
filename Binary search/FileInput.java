import java.io.*;
import java.util.Scanner;

public class FileInput
{
    
    public static String[] read(String filename)
    {
        //e.g. filename = "ospd.txt" or "TomSawyer.txt"
        // Location of file to read
        File file = new File(filename);
        // words will store the text in an array of Strings (one word per element)
        String[] words; 
        try 
        {
            int count = 0; 
            Scanner scanner = new Scanner(file);
            // count the number of words in the file
            while (scanner.hasNext())
            {
                scanner.next();
                count++;
            }
            
            scanner.close();
            scanner = new Scanner(file);
            words  = new String[count];
            count = 0;
            // store the words in the file into an array of Strings
            while (scanner.hasNext())
            {
                words[count++] = scanner.next();
            }  
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
            words = new String[0];
        }
        return words;
    }
    
}