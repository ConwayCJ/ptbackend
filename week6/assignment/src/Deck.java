import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  List<Card> deck = new ArrayList<>();

  Deck () {
    String[] suits = {"Hearts ♥", "Diamonds ♦", "Spades ♣", "Clubs ♠"};
    String[] ranks = {"Ace", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    for (String suit: suits) {
      for (int i = 0; i < ranks.length; i++) {
        deck.add(new Card(ranks[i], suit, i+1));
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(this.deck);
  }

  public Card draw() {
    return this.deck.remove(0);
  }

  void describe() {
  for (Card card: deck) {
      card.describe();
    }
    }

}
