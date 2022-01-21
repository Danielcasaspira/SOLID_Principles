## Universidad Distrital Francisco Jose de Caldas
## Especializacion en Ingenieria de Software
### Profesor Alejandro Paolo Daza Corredor
### INFORMATICA I

Integrantes:

- Cesar Alfonso Solano Ruiz  202002099036
- Erick Yoan Ahumada Salcedo 202002099020
- Henry Daniel Casas Pira    202002099023 		


# Principios SOLID

Las siglas SOLID son la representación de 5 principios establecidos por Robert C. Martin, los cuales en el paradigma de programación orientada a objetos, 
ayudan a través de una reglas básicas, a realizar programas más legibles y mantenibles.

Cada una de las letras representa un principio:

- S: Single responsibility principle o Principio de responsabilidad única
- O: Open/closed principle o Principio de abierto/cerrado
- L: Liskov substitution principle o Principio de sustitución de Liskov
- I: Interface segregation principle o Principio de segregación de la interfaz
- D: Dependency inversion principle o Principio de inversión de dependencia

En el programa daremos ejemplo de tres de ellos.

## S. Single responsibility principle

Como su propio nombre indica, establece que una clase, componente o microservicio debe ser responsable de una sola cosa. Si por el contrario, una clase tiene varias responsabilidades, esto implica que el cambio en una responsabilidad provocará la modificación en otra responsabilidad.

Para nuestro ejemplo existen dos clases para agregar jugadores a un equipo de futbol y otra para ver la cantidad de jugadores de futbol en la nomina total, estas pudieron ser en conjunto pero se separa para que cada clase cumpla con la funcion de agregar el jugador al equipo, y otra para mostrar todo el equipo en nomina.


## L. Liskov substitucion principle 

El principio de sustitución de Liskov declara que si una clase B hereda de una clase A, entonces podríamos reemplazar a A por B sin que afecte el 
comportamiento de nuestro programa.

Para nuestro ejemplo en el equipo de fútbol, la clase jugador implementa una interface con las acciones comunes que hereda a todos sus clases hijas, 
pero para añadir una nueva acción para la clase arquero, no la añadimos en nuestra interface principal en cambio añadimos una nueva implentacion solo 
con la accion agarrar_balón.

![alt text](https://github.com/scesar87/SOLID_Principles/blob/master/images/Liskov.png)

Así garantizamos que las clases que heredan de jugador no tengan que implementar un método que no van a usar.


## I. Interface segregation principle o Principio de segregación de la interfaz

EL principio de segregación de la interfaz establece que los clientes de un programa dado sólo deberían conocer de éste aquellos métodos que realmente usan,
 y no aquellos que no necesitan usar, en el programa presentado se realizaron varias clases representando las distintas posiciones de un jugador de futbol, 
principalmente el delantero, mediocampista y defensa heredan los atributos principales de la clase padre Futbolista, estos a su vez implementan las acciones 
principales de una interface IAccesoMovimientos, con el objetivo de que se cumpla este principio se realizaron dos interfaces mas con el fin de que el arquero
y el mediocampista puedan implementar sus movimientos "unicos" a atraves de IAtraparBalon y IAsistencias, teniendo en cuenta que el arquero es el unico que puede
atrapar el balon con sus manos y el medio campista teniendo como funcion principal hacer asistencias al delantero. 
Este principio se garantiza puesto que no se maneja una unica interface donde en este caso, el delantero y defensa se vieran obligados a usar metodos 
que realmente no usan en este deporte.

# Inyeccion de dependencias

Es un patrón de diseño orientado a objetos, en el que se suministran objetos a una clase en lugar de ser la propia clase la que cree dichos objetos. Esos objetos cumplen contratos que necesitan nuestras clases para poder funcionar (de ahí el concepto de dependencia). Nuestras clases no crean los objetos que necesitan, sino que se los suministra otra clase 'contenedora' que inyectará la implementación deseada a nuestro contrato

![image](https://user-images.githubusercontent.com/46467018/150595156-e9aa5d2d-a325-4907-abe8-0c9a9273f526.png)
![image](https://user-images.githubusercontent.com/46467018/150595298-0b1e6c7a-2587-45a1-8ede-83d8f413ccd7.png)


# Polimorfismo en Java

El polimorfismo en Java y en la POO se refiere a que un objeto puede tomar diferentes formas de comportarse, es decir, que las subclases de una clase pueden definir su propio comportamiento.

Aun así compartir comportamiento de su clase padre. Como se puede ver, la herencia y el polimorfismo en java van muy ligados.
Así que será necesario tener bien claro este concepto para poder entender el polimorfismo.
Para entender el Polimorfismo vamos a realizar un pequeño ejemplo que consistirá en una clase padre y dos clases hijas.

Estas heredan del mismo padre, cada clase sobrescribirá un método del padre para ver cómo se comporta el polimorfismo.

### Fuentes

- [Liskov Substitution](https://tech.tribalyte.eu/blog-principios-solid-liskov)
- [Solid_Principles](https://enmilocalfunciona.io/principios-solid/)
