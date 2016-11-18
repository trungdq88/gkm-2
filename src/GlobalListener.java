import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GlobalListener
{
  public static void main(String[] args) throws InterruptedException
  {
    disableLogging();
    try
    {
      GlobalScreen.registerNativeHook();
    }
    catch (NativeHookException ex)
    {
      System.err.println("There was a problem registering the native hook.");
      System.err.println(ex.getMessage());

      System.exit(1);
    }

    GlobalInputListener listener = new GlobalInputListener();
    GlobalScreen.addNativeMouseListener(listener);
    GlobalScreen.addNativeMouseMotionListener(listener);
    GlobalScreen.addNativeMouseWheelListener(listener);
    GlobalScreen.addNativeKeyListener(listener);
  }

  private static void disableLogging()
  {
    // Get the logger for "org.jnativehook" and set the level to off.
    Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
    logger.setLevel(Level.OFF);

    // Don't forget to disable the parent handlers.
    logger.setUseParentHandlers(false);
  }
}
