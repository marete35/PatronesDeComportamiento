# Visitor Pattern

##Introduccion y nombre
Visitor. De comportamiento. Busca separar un algoritmo de la estructura de un objeto.

##Intencion
Este patron representa una operacion que se aplica a las instancias de un conjunto de clases. Dicha operacion se implementa de forma que no se modifique el codigo de las clases sobre las que opera.

##Solucion
Este patron debe utilizarse cuando:
- Una estructura de objetos contiene muchas clases de objetos con distintas interfaces y se desea llevar a cabo operaciones sobre estos objetos que son distintas en cada clase concreta.
- Se quiere llevar a cabo muchas operaciones dispares sobre objetos de una estructura de objetos sin tener que incluir dichas operaciones en las clases.
- Las clases que definen la estructura de objetos no cambian, pero las  operaciones que se llevan a cabo sobre ellas.

##Implementacion
En patron Visitor posee un conjunto de clases elemento que conforman la estructura de un objeto. Cada una de estas clases elemento tiene un metodo aceptar (accept() que recibe el objeto visitador (visitor) como argumento.  El visitador es una interfaz que tiene un metodo visit() diferente para cada clase elemento; por tanto habra implementaciones de la interfaz visitor de la forma: visitorClase1, visitorClase2...VisitorClaseN. El metodo accept() de una clase elemento llama al metodo visit de su clase. Los visitadores concretos pueden entonces ser escritas para hacer una operacion en particular.

Cada metodo visit() de un visitador concreto puede ser pensado como un metodo que no es de una sola clase, sino de un par de clases: el visitador concreto y clase elemento particular. Asi el patron visitor simula el envio doble (en ingles este termino se conoce como Double-Dispatch)