package Ejercicio2;


/*
Crea una clase base llamada "Personaje" con atributos como nombre, nivel y puntos de vida.
Implementa métodos para que el personaje pueda atacar, recibir daño y curarse. Luego, crea clases derivadas como "Guerrero", "Mago" y "Arquero",
que hereden de la clase base y añadan atributos y métodos específicos para cada tipo de personaje.
Por ejemplo, la clase "Guerrero" podría tener un atributo adicional para la fuerza de ataque, mientras que la clase "Mago" podría tener un método para lanzar hechizos.
Crea instancias de los diferentes personajes y simula un combate entre ellos.
Puedes añadir más funcionalidades al juego de rol, como habilidades especiales, armas, armaduras, y enemigos con los que los personajes pueden luchar.
La idea es que te diviertas creando y personalizando tu propio juego de rol utilizando la herencia y el polimorfismo en la programación orientada a objetos.
 */


public class Main {


    public static void main(String[] args) {
        Guerrero ivar = new Guerrero("Ivar Ragnarsson", 2, 5, 2, true);
        Arquero homero = new Arquero("Homero Simpson", 2, 5, 5);
        Mago harry = new Mago("Harry Potter", 2, 5, 6);

        homero.atacar(harry);
        harry.lanzarHechizo(homero);
        homero.curarse();
        homero.lanzarFecha(harry);
        ivar.atacar(harry);
        ivar.atacar(homero);



    }







}
