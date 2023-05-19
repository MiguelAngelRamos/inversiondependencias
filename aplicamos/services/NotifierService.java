package aplicamos.services;

import aplicamos.interfaces.INotifier;

public class NotifierService {
 
  private INotifier [] notifiers;

  // * donde voy a recibir las instancias de las clases que implementan la interface INotifier
  public NotifierService(INotifier[] notifiers) {
    this.notifiers = notifiers;
  }

  public void notify(String message) {
    for(INotifier notifier: notifiers) {
      notifier.send(message);
    }
  }
}
