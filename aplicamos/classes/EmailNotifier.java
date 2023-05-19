package aplicamos.classes;

import aplicamos.interfaces.INotifier;
// implementas la interfaz y le damos la logica al metodo send
public class EmailNotifier implements INotifier{
  public void send(String message) {
    System.out.println("Send an email: " + message);
  }
}
