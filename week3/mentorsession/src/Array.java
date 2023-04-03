import java.sql.SQLOutput;

public class Array {
  public static void main(String[] args) {
    // Declare and initialize an array that stores the first name 
	// of everyone in your group

    //way1
    //String[] firstNames = {"Chris", "Rocio", "Jhonatan"};

    //way2
    //String[] firstNames = new String[] {
    //    "Chris", "Rocio", "Jhonatan"
    //};

    String[] firstNames = new String[3];
    firstNames[0] = "Chris";
    firstNames[1] = "Rocio";
    firstNames[2] = "Jhonatan";

    // Declare and initialize an array that stores the numeric birth month 
	// (1 = January, 2 = February, ...) of everyone in your group. Use the
    // same order for the months as the order for the name that was entered.
	// The first birth month should be the birth month of the first person.
	int[] numericBirthMonths = {7, 6, 9};
	
    // Declare and initialize an array that stores all of the months 
	// (January, February, ...) of the year.
	String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	// Extra: Using a looping structure of your choice, output each person's 
	//        name along with their birth month displayed as the name 
	//        (i.e.  January).
	// For example: Ava was born in December.
	//              John was born in February.

    for (int i = 0; i <= 2; i ++) {
      System.out.println(firstNames[i] + " was born in " + months[numericBirthMonths[i] -1]);
    }

	// Challenge: Without modifying your original array declaration, add my name 
	//            to the list of names you previously defined. I was born in November.
	//            Do not manually enter your names again in your code.
	
  }
}
