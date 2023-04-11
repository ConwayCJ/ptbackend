public class App {
  public static void main(String[] args) {
    SpacedLogger spacedLogger = new SpacedLogger();
    AsteriskLogger logger = new AsteriskLogger();

    //---------------Spaced Logger------------------//
    System.out.println("Testing spaced logger: \n");

    spacedLogger.Log("Hello");
    spacedLogger.Error("RIP in peace");

    //---------------Asterisk Logger------------------//
    System.out.println("\nTesting Asterisk Logger: \n");
    logger.Log("Hello");
    System.out.println("\n");
    logger.Error("RIP in peace");



  }

}
