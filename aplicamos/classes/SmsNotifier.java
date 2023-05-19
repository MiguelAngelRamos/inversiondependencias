package aplicamos.classes;
import aplicamos.interfaces.INotifier;

public class SmsNotifier implements INotifier {
  public void send(String message) {
    System.out.println("Send an Sms: " + message);
  }
}
