#Iterator Pattern

##Introduccion y nombre
Iterator. De comportamiento. Provee un mecanismo estandar para acceder secuencialmente a los elementos de una coleccion.

##Intencion
Define un interface que declara metodos para acceder secuencialmente a los objetos de una coleccion. Una clase accede a una coleccion solamente a traves de un interface independiente de la clase que implementa el interface.

##Tambien conocido como
Iterator, Cursor.

##Solucion
El patron iterator se puede utilizar en los siguientes casos:
- Una clase necesita acceder al contenido de una coleccion sin llegar a ser dependiente de la clase que se utiliza para implementar la coleccion, es decir, sin tener que exponer su representacion interna.
- Una clase necesita un modo uniforme de acceder al contenido de varias colecciones.
- Cuando se necesita soportar multiples recorridos de una coleccion.

##Implementacion

La primer interface que nacio con el patron obligaba a implementar  las siguientes metodos: was, first, next, isDone y currenItem. Pero Java le asigno los siguientes metodos: next, hasNext y remove. Este ultimo metodo saca un objeto de la coleccion.

Dada la popularidad que tuvo este patron con Java, estos ultimos metodos quedaron como estandar para la interface Iterator. Se deben implementar de la siguiente manera:

boolean hasNext() debe devolver si hay un proximo elemento en la coleccion.
Object next() devuelve el objeto de esa iteracion. 

