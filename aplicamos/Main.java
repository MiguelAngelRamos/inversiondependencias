package aplicamos;

import aplicamos.classes.EmailNotifier;
import aplicamos.classes.InstagramNotifier;
import aplicamos.classes.SmsNotifier;
import aplicamos.classes.WhatsAppNotifier;
import aplicamos.interfaces.INotifier;
import aplicamos.services.NotifierService;

public class Main {
  public static void main(String[] args) {
    INotifier[] notifier = new INotifier[] {
      new EmailNotifier(),
      new WhatsAppNotifier(),
      new SmsNotifier(),
      new InstagramNotifier()
    };
    //* es permitido tener las instancias
    NotifierService service = new NotifierService(notifier);
    service.notify("Hola todos espero que se entienda la Inversion de dependencias");
  }
}
