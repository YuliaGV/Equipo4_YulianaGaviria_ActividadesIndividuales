package Clase6;

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
         /*
        Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de promedio de 3 números");

        double sum = 0;
        int count = 0;


        while(count < 3){

            System.out.print("Ingresa un número: ");
            double number = sc.nextDouble();
            sum += number;
            count++;
        }

        double average = sum/count;
        System.out.println("El promedio es: "+average);




    }





}
