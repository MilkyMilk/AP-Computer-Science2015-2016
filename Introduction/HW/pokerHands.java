import java.util.*;  
public class pokerHands {
  public static void main(String[]args){

    //create the card deck
    ArrayList<String> suits = new ArrayList<String>();
    suits.addAll(Arrays.asList("Hearts", "Clubs", "Spades", "Diamonds"));

    ArrayList<String> cards = new ArrayList<String>();
    cards.addAll(Arrays.asList("Ace of ", "King of ", "Queen of ", "Jack of ", "10 of ", "9 of ", "8 of ", "7 of ", "6 of ",
                               "5 of ", "4 of ", "3 of ", "2 of "));

    ArrayList<String> cardDeck = new ArrayList<String>();
    for (int i = 0; i < suits.size(); i++) {
      for (int j = 0; j < cards.size(); j++) {
        cardDeck.addAll(Arrays.asList(cards.get(j) + suits.get(i)));
      }
    }

    int howManyHands = Integer.parseInt(args [0]); //how many

    while (howManyHands > 0) { //how many hands to deal

      for (int i = 4; i >=0; i--) { //deals 1 hand
        int cardToHand = (int) (Math.random() * cardDeck.size()) ;
        System.out.print(cardDeck.get(cardToHand) + ", ");


        cardDeck.remove(cardToHand); //takes the card out of the deck


        if (i == 0) //finishes the hand
          System.out.println();
      }

      howManyHands--; //reset
    }
  }
}

//    cardDeck.addAll(Arrays.asList("Ace of Hearts","King of Hearts","Queen of Hearts","Jack of Hearts",
//                                  "10 of Hearts","9 of Hearts","8 of Hearts","7 of Hearts","6 of Hearts","5 of Hearts","4 of Hearts","3 of Hearts","2 of Hearts",
//                                  "Ace of Clubs","King of Clubs","Queen of Clubs","Jack of Clubs",
//                                  "10 of Clubs","9 of Clubs","8 of Clubs","7 of Clubs","6 of Clubs","5 of Clubs","4 of Clubs","3 of Clubs","2 of Clubs",
//                                  "Ace of Spades","King of Spades","Queen of Spades","Jack of Spades", "10 of Spades","9 of Spades","8 of Spades","7 of Spades","6 of Spades","5 of Spades","4 of Spades","3 of Spades","2 of Spades",
//                                  "A of Diamonds","K of Diamonds","Q of Diamonds","J of Diamonds", "1) of Diamonds","9 of Diamonds","8 of Diamonds","7 of Diamonds","6 of Diamonds","5 of Diamonds","4 of Diamonds","3 of Diamonds","2 of Diamonds"));
