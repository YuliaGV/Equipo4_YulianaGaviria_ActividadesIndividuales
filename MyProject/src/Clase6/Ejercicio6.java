package Clase6;


import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {


        /*
        Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int number1 = sc.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int number2 = sc.nextInt();

        System.out.println("Ingresa el tercer número: ");
        int number3 = sc.nextInt();

        int bigger = Math.max(number1, Math.max(number2, number3));
        int smaller = Math.min(number1, Math.min(number2, number3));

        System.out.println("El número mayor es: "+bigger);
        System.out.println("El número menor es: "+smaller);

    }


}
