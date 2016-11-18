import org.jnativehook.NativeInputEvent;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;
import com.google.gson.Gson;

public class GlobalInputListener implements NativeKeyListener, NativeMouseInputListener, NativeMouseWheelListener {
  private Gson gson;
  public GlobalInputListener() {
    this.gson = new Gson();
  }

  private void displayEventInfo(final NativeInputEvent e) {
    System.out.println(gson.toJson(e));
  }

  /**
   * @see org.jnativehook.keyboard.NativeKeyListener#nativeKeyPressed(org.jnativehook.keyboard.NativeKeyEvent)
   */
  public void nativeKeyPressed(NativeKeyEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.keyboard.NativeKeyListener#nativeKeyReleased(org.jnativehook.keyboard.NativeKeyEvent)
   */
  public void nativeKeyReleased(NativeKeyEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.keyboard.NativeKeyListener#nativeKeyTyped(org.jnativehook.keyboard.NativeKeyEvent)
   */
  public void nativeKeyTyped(NativeKeyEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.mouse.NativeMouseListener#nativeMouseClicked(org.jnativehook.mouse.NativeMouseEvent)
   */
  public void nativeMouseClicked(NativeMouseEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.mouse.NativeMouseListener#nativeMousePressed(org.jnativehook.mouse.NativeMouseEvent)
   */
  public void nativeMousePressed(NativeMouseEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.mouse.NativeMouseListener#nativeMouseReleased(org.jnativehook.mouse.NativeMouseEvent)
   */
  public void nativeMouseReleased(NativeMouseEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.mouse.NativeMouseMotionListener#nativeMouseMoved(org.jnativehook.mouse.NativeMouseEvent)
   */
  public void nativeMouseMoved(NativeMouseEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.mouse.NativeMouseMotionListener#nativeMouseDragged(org.jnativehook.mouse.NativeMouseEvent)
   */
  public void nativeMouseDragged(NativeMouseEvent e) {
    displayEventInfo(e);
  }

  /**
   * @see org.jnativehook.mouse.NativeMouseWheelListener#nativeMouseWheelMoved(org.jnativehook.mouse.NativeMouseWheelEvent)
   */
  public void nativeMouseWheelMoved(NativeMouseWheelEvent e) {
    displayEventInfo(e);
  }
}
