# Chain of Responsability Pattern

##Introduccion y nombre
Chain of Responsibility. De comportamiento. El patron de diseño Chain of Responsibility permite establecer una cadena de objetos receptores a traves de los cuales se pasa una peticion formulada por un objeto emisor.

## Intencion
Como se dijo anteriormente se busca establecer una cadena de receptores, donde cualquiera de ellos puede responder a la peticion en funcion de un criterio establecido.

## Tambien conocido como
Cadena de responsabilidad.

## Solucion
Se utiliza cuando:

- Las peticiones emitidas por un objeto deben ser atendidas por distintos objetos receptores.
- No se sabe a priori cual es el objeto que me puede resolve el problema.
- Cuando un pedido debe ser manejado por varios objetos.
- El conjunto de objetos que pueden tratar una peticion deberia ser especificado dinamicamente.

## Implementacion

Todos los objetos receptores implementaran la misma interfaz o extenderan la misma clase abstracta. En ambos casos se proveera de un metodo que permita obtener el sucesor y asi el
paso de la peticion por la cadena sera lo mas flexible y transparente posible.

La idea es crear un sistema que pueda servir a diversas solicitudes de manera jerarquica.



