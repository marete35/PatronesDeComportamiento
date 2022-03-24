# Observer

## Introduccion y nombre
Observer. De comportamiento. Permite reaccionar a ciertas clases llamadas observadores sobre un evento determinado.

## Intencion
Este patron permite a los objetos captar dinamicamente las dependencias entre objetos, de tal forma que un objeto notificara a los observadores cuando cambia su estado, siendo actualizados automaticamente.

##Tambien conocido como
Dependents, Publish-Subscribe, Observador.

##Solucion
Este patron debe ser utilizado cuando:
- Un objeto necesita notificar a otros objetos cuando cambia su estado. La idea es encapsular estos aspectos en objetos diferentes permite variarlos y reutilizarlos independientemente.
  -Cuando existe una relacion de dependencia de uno a muchos que puede requerir que un objeto notifique a multiples objetos que dependen de el cuando cambia su estado.

##Implementacion
Si los observadores pueden observar a varios objetos subject a la vez, es necesario ampliar el servicio update() para permitir conocer a un objeto observer dado cual de los objetos subject que observa le ha enviado el mensaje de notificacion.

Una forma de implementarlo es añadiendo un parametro al servicio update() que sea el objeto subject que envia la notificacion (el remitente). Y añadir una lista de objetos subject observados por el objeto observer en la clase Observer.

Si los objetos observers observan varios eventos de interes que pueden suceder con los objetos subjects, es necesario ampliar el servicio add() y el update() ademas de la implementacion del mapeo subject-observers en la clase abstracta Subject. Una forma de implementarlo consiste en introducir un nuevo parametro al servicio add() que indique el evento de interes del observer a añadir e introducirlo tambien como un nuevo parametro en el servicio update() para que el subject que reciba el mensaje de notificacion sepa que evento ha ocurrido de los que observa.

Cabe destacar que Java tiene una propuesta para el patron observer:

Posee una Interfaz java.util.Observer:

public interface Observer: una clase puede implementar la interfaz Observer cuando dicha clase quiera ser informada de los cambios que se produzcan en los objetos observados. Tiene un servicio que es el siguiente: void update (Observable o, Object arg)

Este servicio es llamado cuando el objeto observado es modificado.

Java nos ofrece los siguientes servicios:

- void addObserver(Observer o)
  -protected void clearChanged();
  -protected countObservers()
  -void deleteObserver(Observer o)
  -boolean hasChanged()
  -void notifyObservers()
  -void notifyObservers(Object arg)
  -protected void setChanged()

public class Observable extends Object

Esta clase representa un objeto Subject.

En el codigo de muestra haremos un ejemplo estandard y otro con la propuesta java.