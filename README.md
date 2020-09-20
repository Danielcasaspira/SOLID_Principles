# Principios SOLID

Las siglas SOLID son la representación de 5 principios establecidos por Robert C. Martin, los cuales en el paradigma de programación orientada a objetos, ayudan a través de una reglas básicas, a realizar programas más legibles y mantenibles.

Cada una de las letras representa un principio:

- S: Single responsibility principle o Principio de responsabilidad única
- O: Open/closed principle o Principio de abierto/cerrado
- L: Liskov substitution principle o Principio de sustitución de Liskov
- I: Interface segregation principle o Principio de segregación de la interfaz
- D: Dependency inversion principle o Principio de inversión de dependencia

En el programa daremos ejemplo de tres de ellos.

## L. Liskov substitucion principle 

El principio de sustitución de Liskov declara que si una clase B hereda de una clase A, entonces podríamos reemplazar a A por B sin que afecte el comportamiento de nuestro programa.

Para nuestro ejemplo en el equipo de fútbol, la clase jugador implementa una interface con las acciones comunes que hereda a todos sus clases hijas, pero para añadir una nueva acción para la clase arquero, no la añadimos en nuestra interface principal en cambio añadimos una nueva implentacion solo con la accion agarrar_balón.

![alt text](https://github.com/scesar87/SOLID_Principles/blob/master/images/Liskov.png)

Así garantizamos que las clases que heredan de jugador no tengan que implementar un método que no van a usar.
