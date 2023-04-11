public class SpacedLogger implements Logger {

  public void Log(String string) {
    string = string.replaceAll(".(?=.)", "$0 ");
    System.out.println(string);
  }

  public void Error(String string) {
    string = string.replaceAll(".(?=.)", "$0 ");
    System.out.println("Error: " + string);
  }
}
