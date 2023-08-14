package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {


    /*
    1. Imprimir Nombres en Mayúsculas:
Toma una lista de nombres y utiliza forEach para imprimir en la consola cada nombre en mayúsculas.
     */

    public static void printNamesUpperCase(List<String> names){
        names.stream().forEach(name -> System.out.println(name.toUpperCase()));
    }

    /*
    2. Imprimir Palabras al Revés:
    Dado un arreglo de palabras, utiliza forEach para imprimir en la consola cada palabra escrita al revés.
     */




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean active = true;


        while (active){


            System.out.println("Escribe el número del ejercicio que quieres ver, 0 para salir");
            int number = sc.nextInt();

            // Limpiar el buffer del Scanner
            sc.nextLine();

            switch (number){
                case 1:
                    System.out.println("Ingresa una lista de nombres separada por comas");
                    String names = sc.nextLine();
                    List<String> listNames = Arrays.asList(names.split(","));
                    printNamesUpperCase(listNames);
                    break;
                case 0:
                    active = false;
                default:
                    System.out.println("Opción no válida");

            }


        }



    }


}
