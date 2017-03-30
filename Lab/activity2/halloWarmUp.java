public class halloWarmUp {
  public  static int  countWords(String text, String word) {
    //returns the number of occurrences of a word in text
    // return 0 if none occur
    int temp;
    int count = 0;
    int appears = text.indexOf(word);
    if (appears >= 0) {
      count = 1;
      for (int i = 0; i < text.length(); i++) { 
        temp = text.indexOf(word, appears + 1);
        if (temp > appears) {
          count++;
          appears = temp;
        }
      }
      return count;
    } else {
      return count;  
    }
  }

  
}