public class Shuffle
{
  public static void main(String[] args)
  {
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    int j = (int)(Math.random()*suit.length);
    int i = (int)(Math.random()*rank.length);
    
    String[] d = new String[suit.length * rank.length];  //allocates memory for 52 strings
    
        //print random card
    //System.out.println(rank[i] + " of " + suit[j]);
    
    for ( i = 0; i < rank.length; i++)
    {
      for ( j = 0; j < suit.length; j++)
      {
        d[4*i + j] = rank[i] + " of " +suit[j];
      }
    }
    shuffle(d);
  }
    public static void shuffle(String[] d)
    {
    shuffle(d);
    
    //shuffle
    for ( int i = 52; i > 0; i--)
    {
      //generate a random number between i and 51
      int random = (int) (Math.random() * i);
      String temp = d[i-1];
      d[i-1] = d[random];
      d[random] = temp;
    }
    int m = 0;
    
    for (int l = Integer.parseInt(d[0]); l > 0; l--)
           {
    for (int k = 0 + m; k < 5 + m; k++)
      System.out.print(d[k] + ", ");
    System.out.println();
    m = m + 5;
    
    for (int k = 0; k < d.length; k++)
    {
    System.out.println(d[k]);
    }
    
    
    
 
    } 
  }
}
