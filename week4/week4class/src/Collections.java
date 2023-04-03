import java.util.ArrayList;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    //obnoxious way to add new items to an array

    String[] names = {"George", "Ava"};

    String[] tempNames = new String[names.length +1];

    for (int i = 0; i < names.length; i++) {
      tempNames[i] = names[i];
    }

    tempNames[tempNames.length - 1] = "Chris";

    //more dynamic way

    ArrayList<String> lastNames = new ArrayList<String>();
    lastNames.add("Georgee");
    lastNames.add("Ava");
    lastNames.add("Chris");

    System.out.println(lastNames);
  }
}
