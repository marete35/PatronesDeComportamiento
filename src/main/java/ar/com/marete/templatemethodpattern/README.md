#Template Method Pattern

##Introduccion y nombre
Template Method. De comportamiento. Define una estructura algoritmica.

##Intencion
Escribe una clase abstracta que contiene parte de la logica necesaria para realizar su finalidad. Organiza la clase de tal forma que sus metodos concretos llaman a un metodo abstracto donde la logica buscada tendria que aparecer. Facilita la logica buscada en metodos de subclases que sobreescriben  a los metodos abstractos. D**efine un esqueleto de un algoritmo, delegando algunos pasos a las subclases. Permite redefinir parte del algoritmo sin cambiar su estructura. **

##Tambien conocido como
Metodo plantilla

##Solucion
Se debe utilizar este patron cuando:

- Se quiera factorizar el comportamiento comun de varias subclases.
- **Se necesite implementar las partes fijas de un algoritmo una sola vez y dejar que las subclases implementen las partes variables. **
- Se busque controlar las ampliaciones de las subclases, convirtiendo en metodos plantillas aquellos metodos que pueden ser redefinidos.

##Implementacion
Una clase ClaseAbstracta proporciona la guia para forzar a los programadores a sobreescribir los metodos abstractos con la intencion de proporcionar la logica que rellena los huecos de la logica de su metodo plantilla.

Los metodos plantilla no deben redefinirse. Los metodos abstractos deben ser protegidos (accesible a las subclases pero no a los clientes) y abstractos. Se debe intentar minimizar el numero de metodos abstractos a fin de facilitar la implementacion de las subclases. 



