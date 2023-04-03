public class Main {
  public static void main(String[] args) {
    /*
    * create a loop that prints 1-50
    * if divisible by 3, print coca
    * if divisible by 5 print cola
    * if both, print CocaCola
    * */

    for (int i = 1; i <= 50; i++) {

      if ( i % 3 == 0 && i % 5 == 0) {
        System.out.println("CocaCola");
      } else if (i % 5 == 0) {
        System.out.println("Cola");
      } else if (i % 3 == 0) {
        System.out.println("Coca");
      } else {
        System.out.println(i);
      }


    }

  }
}
