// This is the client program that has already been written for you.
// Use it to test that your Phrase code works as intended.

public class PhraseClient
{
    public static void main(String[] args)
    {
        // create three Phrase objects
        Phrase p = new Phrase("The quick brown fox jumps over the lazy dog");
        Phrase q = new Phrase("I like to eat, eat, eat, apples and bananas");
        Phrase r = new Phrase("Nothing changes");
        
        
        p.findAndReplaceFirst("fox", "cat");
        p.findAndReplaceAll("fox", "rabbit");
        q.findAndReplaceAll("eat", "throw");
        r.findAndReplaceAll("nothing", "everything");
        
        System.out.println(p + "\n" + q + "\n" + r);
        
        // your output should be:
        //   The quick brown rabbit jumps over the lazy dog
        //   I like to throw, throw, throw, apples and bananas
        //   Nothing changes
    }
}