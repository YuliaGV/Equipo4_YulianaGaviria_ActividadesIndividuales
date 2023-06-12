package Clase6;

import java.util.*;

public class Ejercicio8 {





    public static void main(String[] args) {

        /*
        Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras" contra la computadora.
         El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras) y luego generar una elección aleatoria para la computadora.
         Después de eso, el programa debe determinar el ganador según las reglas del juego y mostrar el resultado.

         */


        Scanner sc = new Scanner(System.in);


        String [] options = {"piedra", "papel", "tijera"};
        boolean isValidOption = false;

        while (!isValidOption){

            System.out.println("Escribe una opción -> piedra, papel o tijera, o escribe la letra x para salir del juego: ");
            String userOption = sc.nextLine().toLowerCase().trim();

            isValidOption = true;

            Random random = new Random();
            int elementNumber = random.nextInt(options.length);
            String computerOption =options[elementNumber];

            switch (userOption) {
                case "piedra":
                    if (computerOption == "piedra") {
                        System.out.println("¡Empate!: ambos eligieron piedra");
                    } else if (computerOption == "papel") {
                        System.out.println("¡Perdiste!: El PC eligió papel");
                    } else {
                        System.out.println("¡Ganaste! El PC eligió tijera");
                    }
                    break;
                case "papel":
                    if (computerOption == "papel") {
                        System.out.println("¡Empate!: ambos eligieron papel");
                    } else if (computerOption == "tijera") {
                        System.out.println("¡Perdiste!: El PC eligió tijera");
                    } else {
                        System.out.println("¡Ganaste! El PC eligió piedra");
                    }
                    break;
                case "tijera":
                    if (computerOption == "tijera") {
                        System.out.println("¡Empate!: ambos eligieron tijera");
                    } else if (computerOption == "piedra") {
                        System.out.println("¡Perdiste!: El PC eligió piedra");
                    } else {
                        System.out.println("¡Ganaste!: El PC eligió papel");
                    }
                    break;
                case "x":
                    System.out.println("Adios");
                default:
                    System.out.println("La opción ingresada no es válida");
                    isValidOption = false;
                    break;
            }

        }



    }


}
