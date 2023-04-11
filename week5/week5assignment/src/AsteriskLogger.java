public class AsteriskLogger implements Logger{

  @Override
  public void Log(String string) {
    System.out.println("*** " + string + " ***");
  }

  @Override
  public void Error(String string) {
    System.out.println("************** \n" + "*** Error: " + string + " ***\n" + "**************" );
  }
}
