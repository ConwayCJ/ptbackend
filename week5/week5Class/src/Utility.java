import java.util.ArrayList;
import java.util.List;
/**
 * A utility / helper class for doing common operations on arrays.
 */
public class Utility {
  /**
   * Sample entry point for testing the Utility class.
   * @param args The command line arguments.
   */
  public void run(String[] args) {
    System.out.println("[Start]");
    // ------------------------------------------------------------------

    
    // Declare an array or List<> (a collection) that contains the 
    // following integer values:
    //
    //   72 89 40 58 2 31 29 65 66 61 36 9 7 4 10 33 71 85 22 93
    List<Integer> listOfNumbers = new ArrayList<Integer>(List.of(72, 89, 40, 58, 2, 31, 29, 65, 66, 61, 36, 9,7, 4, 10, 33, 71, 85, 22, 93));

    System.out.println(listOfNumbers);

    // Create a method that will take a collection of integer values 
    // as a parameter and display the values to the screen but 
    // formatting them with the addition (+) sign separating the numbers.
    //   i.e. 72 + 89 + 40 + 58 ...
    numberLogger(listOfNumbers);

    // Create a method that will take a collection of integer values
    // as a parameter and return the total.  
    //   i.e. 72+89+... = 883
    // Store the returned value into a local variable.
    // Output the value to the screen
    // (i.e. Total: 883)
    System.out.println("\nThe total is: " + calculator(listOfNumbers));
    
    // Create a method that will take a collection of integer values
    // as a parameter and return the average as a double. 
    //     i.e. (72+89+... ) / 20 = 44.15
    // Store the returned value into a floating point value (i.e. decimal).
    // Output the value to the screen
    // (i.e. Average: 44.15)
    System.out.println(average(listOfNumbers));
    
    // Create a method that will take a collection of integer values
    // as a parameter and returns the smallest number found. 
    //     i.e. 2
    // Store the returned value into a local value.
    // Output the value to the screen.
    // (i.e. Minimum: 2)
    

    // Create a method that will take a collection of integer values
    // as a parameter and returns the largest number. 
    //     i.e. 93
    // Store the returned value into a local value.
    // Output the value to the screen.
    // (i.e. Maximum: 93)
    
    // BONUS:
    //
    // Create a method that will search a collection of integer values
    // and return a collection of integer values that are greater than
    // or equal to the second integer parameter.
    // 
    //    For example, if we called our method searching for all values
    //    greater than 55, then it should return a collection with the
    //    following values:
    //
    //         [ 72, 89, 58, 65, 66, 61, 71, 85, 93 ]
    //
    // Store the results into a local variable.
    // Output the contents of the collection to the screen.
    // 
    // REFACTOR: How can you reuse the display method you created earlier
    //           but instead have it separate the numbers with , values?
    
    
    // ------------------------------------------------------------------
    System.out.println("\n[End]");
  }

  public static void numberLogger(List<Integer> numbers) {
    for (int number : numbers) {
      System.out.print(number + " + ");
    }
  }

  public static int calculator(List<Integer> numbers) {
    int total = 0;

    // list of numbers [1,2,3,4,5,6,7,8,9,10]
    for (int number : numbers) {
      total+= number;
    }
    return total;
  }

  public static double average(List<Integer> numbers) {

    return (double) calculator(numbers) / numbers.size();
  }


}
