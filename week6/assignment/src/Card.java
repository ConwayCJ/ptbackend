public class Card {
  public int value;
  public String rank;
  public String suit;

  Card(String rank, String suit, int value) {
    this.rank = rank;
    this.value = value;
    this.suit = suit;
  }



  void describe() {
    System.out.println(rank + " of " + suit + "(v: " + value + ")");
  }


}
