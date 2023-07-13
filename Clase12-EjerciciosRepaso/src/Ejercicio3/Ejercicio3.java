package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {



     /*Crear un programa para calcular el interés compuesto: Este programa debe permitir al usuario ingresar el capital inicial, la tasa de interés y el tiempo en años.
    Utilizando la fórmula del interés compuesto, el programa debe calcular el monto total acumulado y mostrarlo al usuario
    CF = CI(1+i)^n
    Donde CF es el capital final, CI es el capital inicial, i es la tasas de interés y n es el plazo o número de periodos.
    */



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el capital inicial: ");
        double initialCapital = sc.nextDouble();


        System.out.println("Ingresa el porcentaje de interés anual: ");
        double interestRate = sc.nextDouble()/100;


        System.out.println("Ingresa la cantidad de años: ");
        int years = sc.nextInt();

        int year;
        double capitalOfYear;
        for (int i = 0; i < years; i++) {
            year = i+1;
            capitalOfYear = initialCapital*(Math.pow((1 + interestRate), year));
            System.out.println("Año# "+year+" con monto acumulado de "+capitalOfYear);
        }







    }


}
