import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    /*
    Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos y bucles.
     */

    public static String generateRandomElement(String [] options){
        Random random = new Random();
        int elementNumber = random.nextInt(options.length);
        return options[elementNumber];
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isValidOption = false;

        while (!isValidOption){

            System.out.println("Escribe una opción -> piedra, papel o tijera, o escribe la letra x para salir del juego: ");
            String userOption = sc.nextLine().toLowerCase().trim();

            isValidOption = true;

            String [] options = {"piedra", "papel", "tijera"};
            String computerOption = generateRandomElement(options);

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
