import java.util.ArrayList;
import java.util.List;

public class Player {
public String name;
public int score;
public List<Card> hand = new ArrayList<>();
  Player(String name){
    this.name = name;
  }

  public Card draw() {
    Card card = this.hand.remove(0);
    return card;
  }

  public void describeHand(){
    for (Card card: hand){
      card.describe();
    }
  }
}
