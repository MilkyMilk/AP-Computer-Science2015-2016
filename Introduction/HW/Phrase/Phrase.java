public class Phrase
{
    private String myPhrase;
    
    public Phrase()
    {
        myPhrase = "";
    }
    
    public Phrase(String str)
    {
        myPhrase = str;
    }
    
    /**
     * finds the first occurence of find and replaces it with replace
     * post-condition:  myPhrase is updated with the find and replace operation 
     *
     * @param find      the text you are finding for replacement
     * @param replace   the text you are replacing find with
     * 
     */
    private int index;
    public void findAndReplaceFirst(String find, String replace)
    {     
    index = myPhrase.indexOf(find);
    if (index != -1) 
      myPhrase = myPhrase.substring(0, index) + replace + myPhrase.substring(index + find.length());     
    }
    
    public void findAndReplaceAll(String find, String replace)
    {
      while (index != -1) {
        findAndReplaceFirst(find, replace);
      }
    }
    
    public String toString() 
    {
        return myPhrase;
    }
}
    