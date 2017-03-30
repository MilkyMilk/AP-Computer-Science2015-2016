public class Searching
{
    //warm-up
    //returns the first index of key in text; otherwise -1 if not found
    //
    // for example:
    // sequentialSearch(new String[] {"bob", "sue","larry"}, "sue")
    //       should return 1
    // sequentialSearch(new String[] {"bob", "sue","larry"}, "mike")
    //       should return -1
    
    public static int sequentialSearch(Comparable[] text, Comparable key)
    {
        for (int i = 0; i < text.length; i++)
        {
            if ( text[i].equals(key))
                return i;
        }
        
        return -1;
    }
    
    // pre-condition: text is sorted
    // recursive method
     public static int binarySearch(Comparable[] text, Comparable key, int low, int high)
     {
          int middle = (low + high) / 2;
          return -1;
         
    
    
     }
    
    
    
    
    public static int[] binarySearch(Comparable[] text, Comparable key)
    {
        int low = 0;
        int high = text.length - 1;
        int middle = (low + high) / 2;
        int[] toReturn = {middle,0};
       
        while ( low <= high)
        {
            /*
            for (int i = low; i <= high; i++)
                System.out.print(text[i] + " ");
            System.out.println(); 
            */   
            toReturn[1]++;
            if ( text[middle].equals(key))
            {
                toReturn[0] = middle;
                return toReturn;
            }
            else if (key.compareTo(text[middle]) < 0)  // key < middle
                high = middle - 1;
            else  // key > middle
                low = middle + 1;
            middle = (low + high) / 2;
            
            
        }  
        toReturn[0] = -1;
        return toReturn;  // didn't find it
    }
    
    public static void main(String[] args)
    {
        String[] words = FileInput.read("ospd.txt");
        System.out.println("number of words = " + words.length);
        
       
    
        int[] index = binarySearch(words, "hello");
        System.out.println(index[0]);
        System.out.println("comparisons: " + index[1]);
        
        
        System.out.println();
    
        //index = sequentialSearch(words, "person");
        //System.out.println(index);
        
    }
    
    
}
        
        
        
            
            
                
            
            
        
        
        
        
        
        
        
        
    
    
               
     
        
     
        
        
    
    

        
        
        
        
        