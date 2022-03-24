#Strategy Pattern

##Introduccion y nombre
Strategy. De comportamiento. Convierte algoritmos en clases y los vuelve intercambiables.

##Intencion
Encapsula algoritmos en clases, permitiendo que estos sean re-utilizados e intercambiables. En base a un parametro, que puede ser cualquier objeto, permite a una aplicacion decidir en tiempo de ejecucion el algoritmo que debe ejecutar.

##Tambien conocido como
Policy, Estrategia

##Solucion
Este patron debe utilizarse cuando:
- Un programa tiene que proporcionar multiples variantes de un algoritmo o comportamiento.
- Es posible encapsular las variantes de comportamiento en clases separadas que proporcionan un modo consistente de acceder a los comportamientos.
- Permite cambiar o agregar algoritmos, independientemente de la clase que lo utiliza.

##Implementacion
Los distintos algoritmos encapsulan y el cliente trabaja contra el Context. Como hemos dicho, el cliente puede elegir el algoritmo que prefiera de entre los disponibles o puede ser el mismo Context el que elija el mas apropiado para cada situacion.

**Cualquier programa que ofrezca un servicio o funcion determinada, que pueda ser realizada de varias maneras, es candidato a utilizar el patron Strategy.** Puede haber cualquier numero de estrategias y cualquiera de ellas podra ser intercambiada por otra en cualquier momento, incluso en tiempo de ejecucion. 
