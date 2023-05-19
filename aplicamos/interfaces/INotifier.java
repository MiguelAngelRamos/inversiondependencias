package aplicamos.interfaces;
//* Necesitamos la interfaz por que podemos crear una variable del tipo de la interface
//* y asignarle una instancia de las clases que implementan la interface 
public interface INotifier {
  void send(String message);
}

