# Command Pattern
## Introduccion y nombre
Command. De comportamiento. Especifica una forma simple de separar la ejecucion de un comando, del entorno que genero dicho comando.

## Intencion
Permite solicitar una operacion a un objeto sin conocer el contenido ni el receptor real de la misma. Encapsula un mensaje como un objeto.

## Tambien conocido como
Comando, Orden, Action, Transaction.

##Solucion
Dado que este patron encapsula un mensaje como un objeto, este patron deberia ser usado cuando:
- Se necesitan colas o registros de mensajes
- Tener la posibilidad de deshacer las operaciones realizadas
- Se necesita uniformidad al invocar las acciones.
- Facilitar la parametrizacion de las acciones a realizar.
- Independizar el momento de peticion del de ejecucion.
- El parametro de una orden puede ser otra orden a ejecutar.
- Desarrollar sistemas utilizando ordenes de alto nivel que se construyen con operaciones sencillas (primitivas).
- Se necesita sencillez al extender el sistema con nuevas acciones.

## Implementacion
La clave de este patron es una clase abstracta o interfaz Command que define una operacion  execute. Son las subclases concretas quienes implementan la operacion y especifican el receptor de la orden. Para ello debemos tener en cuenta:
- Permitir deshacer y repetir cuando sea necesario.
- Evitar la acumulacion de errores en el proceso de deshacer.
- Los comandos deberian invocar ordenes en el receptor. 