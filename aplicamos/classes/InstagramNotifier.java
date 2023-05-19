package aplicamos.classes;

import aplicamos.interfaces.INotifier;

public class InstagramNotifier implements INotifier {
  public void send(String message) {
    System.out.println("Send an Instagram: " + message);
  }
}
