import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    //Creates a new deck with 52 cards in it
    Deck deck = new Deck();
    //Shuffles the deck
    deck.shuffle();
    //Create 2 new players. Each has a hand/point/with a name constructor
    Player player1 = new Player("Chris");
    Player player2 = new Player("Jolene");

    //Loop to pass cards to Player 1 -> Player 2
    for (int i = 0; i < 26; i++) {
      player1.hand.add(deck.draw());
    }

    for (int i = 0; i < 26; i++) {
      player2.hand.add(deck.draw());
    }

    /**
     * Game logic:
     * 1. Run 26 rounds
     * 2. Get a card from player1's hand / player2's hand
     * 3. Compare cards
     * 4. Add a point to each player based on winner
     * 5. Compare points at the end
     */

    System.out.println("War!\n");
    for (int i = 1; i <= 26; i++) {;
      Card p1Card = player1.draw();
      Card p2Card = player2.draw();

      System.out.println("Round: " + i );

      System.out.print(player1.name + " plays: ");
      p1Card.describe();

      System.out.print(player2.name + " plays: ");
      p2Card.describe();

      if (p1Card.value > p2Card.value) {
        player1.score++;
        System.out.println(player1.name + " wins!");
      } else if (p2Card.value > p1Card.value) {
        player2.score++;
        System.out.println(player2.name + " wins!");
      } else {
        System.out.println("Tie!");
      }

      System.out.println("Current points: \n p1: " + player1.score + "\n p2: " + player2.score);

      System.out.println("\n");
    }

    if (player1.score > player2.score) {
      System.out.println(player1.name + " wins!");
    } else if (player2.score > player1.score) {
      System.out.println(player2.name + " wins!");
    } else {
      System.out.println("Nobody wins - tie :)");
    }

  }
}
