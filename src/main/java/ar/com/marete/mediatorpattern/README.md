# Mediator Pattern

## Introduccion y nombre
Mediator. De comportamiento. Define un objeto que hace de procesador central.

## Intencion
Un Mediator es un patron de diseño que coordina las relaciones entre sus asociados o participantes. Permite la interaccion de varios objetos, sin generar acoples fuertes en esas relaciones. Todos los objetos se comunican con un mediator y es este quien realiza la comunicacion con el resto.

## Solucion
Usar el patron Mediator cuando:
- Un conjunto grande de objetos se comunica de una forma bien definida, pero compleja
- Reutilizar un objeto se hace dificil porque se relaciona con muchos objetos.
- Las clases son dificiles de reutilizar porque su funcion basica esta entrelazada con relaciones de dependencia.

##Implementacion
Sabemos que el patron Mediator introduce un objeto para mediar la comunicacion entre "colegas". Algunas veces el objeto Mediator implementa operaciones simplemente para enviarlas a otros objetos; otras veces pasa una referencia a el mismo y por consiguiente utiliza la verdadera delegacion.

Entre los colegas puede existir dos tipos de dependencias:

1. Un tipo de depedencia requiere un objeto para conseguir la aprobacion de otros objetos antes de hacer tipos especificos de cambios de estado.
2. El otro tipo de dependencia requiere un objeto para notificar a otros objetos despues de que este ha hecho un tipo especifico de cambios de estado.

Ambos tipos de dependencias son manejadas de un modo similiar. Las instancias de Colega1, Colega2,...estan asociadas con un objeto mediator. Cuando ellos quieren conseguir la aprobacion anterior para un cambio de estado, llaman a un metodo del objeto Mediator. El metodo del objeto Mediator realiza cuidadoso el resto.

Pero hay que tener en cuenta lo siguiente con respecto al mediador: Poner toda la dependencia de la logica para un conjunto de objetos relacionados en un lugar puede hacer incomprensible la dependencia logica facilmente. Si la clase Mediator llega a ser demasiado grande, entonces dividirlo en piezas mas pequeñas puede hacerlo mas comprensible. 


