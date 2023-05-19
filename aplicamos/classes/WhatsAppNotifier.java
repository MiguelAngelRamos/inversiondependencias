package aplicamos.classes;

import aplicamos.interfaces.INotifier;

public class WhatsAppNotifier implements INotifier{
  
  public void send(String message) {
    System.out.println("Send an WhatsApp: " + message);
  }

}
