package Clase7;

import java.util.Scanner;

public class Ejercicio {


    public static double getAverage(double [] numberList){

    }


    public static void main(String[] args) {

        /*
        Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
         */

        Scanner sc = new Scanner(System.in);

        double [] numbers = new double[5];
        for(int i=0; i<numbers.length; i++){
            System.out.println("Ingresa un número: ");
            numbers[i] = sc.nextInt();
        }


        /*
        Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
         */


        /*
            Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
         */



    }


}
