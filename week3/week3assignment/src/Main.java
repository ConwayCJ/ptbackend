import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    assignment();
  }

    public static void assignment() {

      //1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

      int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 50};

      //a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.

      System.out.println(90);

      //b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
      System.out.println(ages[ages.length -1] - ages[0]);

      //c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
      int sum = 0;
      for (int item : ages) {
        sum += item;
      }

      System.out.println(sum / ages.length);

      //2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

      String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

      //a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
      int nameAverage = 0;
      for (String item: names) {
        nameAverage += item.length();
      }

      System.out.println(nameAverage);

      //b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

      String concatenatedName = " ";

      for (int i = 0; i < names.length; i++) {
        concatenatedName += names[i] + " ";
      }

      System.out.println(concatenatedName);

      //3.	How do you access the last element of any array?
      //array[0]

      //4.	How do you access the first element of any array?
      //array[array.length -1]

      //5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
      int nameLengths[] = new int[names.length];

      for (int index = 0; index < names.length; index++) {
        nameLengths[index] = names[index].length();
        System.out.println(names[index].length());
      }

      System.out.println(Arrays.toString(nameLengths));

      //6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
      int nameLengthsTotal = 0;

      for (int length : nameLengths) {
        nameLengthsTotal += length;
      }

      System.out.println(nameLengthsTotal);

      //7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
      //    (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

      System.out.println(concatenateWord("Jolene Will Never See This \n", 30));

      //8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

      System.out.println(fullName("Chris", "Conway"));

      //9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

      System.out.println(greaterThan100(ages));

      //10.	Write a method that takes an array of double and returns the average of all the elements in the array.
      double numbers[] = {12.14, 90.8, 23.22, 37.27};

      System.out.println(doubleAverage(numbers));

      //11.	Write a method that takes two arrays of double and returns true if the average of the elements in the
      //    first array is greater than the average of the elements in the second array.

      double numbers2[] = {23.12,28.23,27.26,28.19};

      System.out.println(firstArrayLarger(numbers,numbers2));

      //12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

      System.out.println(willBuyDrink(false, 20.30));

      //13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
      System.out.println(no());
      //it no's i don't wanna, cause no I don't wanna
    }

  public static String concatenateWord (String word, int n) {
    String concatenatedWord = "";

    for (int i = 0; i < n; i++) {
      concatenatedWord += word;
    }

    return concatenatedWord;
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static boolean greaterThan100(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }

    if (sum > 100) {
      return true;
    } else {
      return false;
    }
  }

  public static double doubleAverage (double[] doubles) {

    double sum = 0;

    for (double dooble : doubles) {
      sum += dooble;
    }

    return sum / doubles.length;

  }

  public static boolean firstArrayLarger (double[] array1, double[] array2) {
    double sum1 = 0;
    double sum2 = 0;

    for (double number: array1) {
      sum1 += number;
    }

    for (double number: array2 ) {
      sum2 += number;
    }

    if (sum1 > sum2) {
      return true;
    } else {
      return false;
    }

  }

  public static boolean willBuyDrink (boolean isHotOutside, double money) {

    if (isHotOutside && money > 10.50) {
      return true;
    } else return false;

  }

  public static String no() {
      return "i don't wanna";
  }
}
