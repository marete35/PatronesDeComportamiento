# Interpreter Pattern

## Introduccion y nombre
Interpreter. De comportamiento.
Utiliza una clase para representar una regla gramatica.

## Intencion
Este patron busca representar un lenguaje mediante reglas gramaticas. Para ello define estas reglas gramaticas y como interpretarlas.

## Solucion
Este patron se debe utilizar cuando hay un lenguaje que interpretar y se puede interpretar sus palabras como arboles sintacticos abstractos. Para ello, la gramatica debe ser simple.

## Implementacion
Para llevar a cabo su implementacion se debe tener en cuenta que si es frecuente la relacion de nuevos interpretes o de nuevas formas de "interpretar" es mejor tener un Visitante o patron Visitor, donde poner la operacion a realizar fuera de la estructura de arbol.

El "Cliente" construye (o recibe) una estructura de instancias de "Expresiones terminales" y "Expresiones no terminales", ensambladas para formar un arbol sintactico que representa la sentencia que se quiere interpretar, mientras que el "Contexto" contiene informacion global para el interprete.

Quizas lo mas complicado en este patron es definir las operaciones de interpretacion. Es ideal tener operaciones sencillas y claras.

El problema de encontrar palabras que encajan en el patron se puede resolver definiendo un lenguaje para ello, por ejemplo mediante "Expresiones Regulares". Esto nos permite ya aplicar un interprete a dicho lenguaje para resolver el problema. Este lenguaje es muy utilizado en compiladores implementados con lenguajes orientados a objetos. 