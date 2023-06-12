package Clase5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {




    static Scanner sc = new Scanner(System.in);

    /*
    1) Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de humano (se dice que 1 año humano equivale a 7 años de perro).
     */

    public static void calcularEdadPerro(){
        System.out.println("Ingresa la edad de tu perro: ");
        int edadPerro = sc.nextInt();
        int edadHumana = edadPerro*7;
        System.out.println("Tu perro tiene: "+edadHumana+" en edad humana");
    }


    /*
    2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
     */

    public static void convertirMillasAKilometros(){
        System.out.println("Ingresa el valor en millas: ");
        double millas = sc.nextDouble();
        double kilometros = millas* 1.60934;
        System.out.println("Eso equivale a: "+kilometros+" kilometros");
    }


    /*
        3) Calculadora de descuento:
        Pídele al usuario que ingrese el precio original de un producto.
        Pídele al usuario que ingrese el porcentaje de descuento.
        Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        Muestra el precio final al usuario.
    */

    public static void calcularDescuento(){
        System.out.println("Dime el precio original del producto: ");
        double precioOriginal = sc.nextDouble();
        System.out.println("Dime el porcentaje de descuento: ");
        double porcentajeDescuento = sc.nextDouble();
        double precioFinal = precioOriginal -((precioOriginal*porcentajeDescuento)/100);
        System.out.println("El precio final es: "+precioFinal);
    }


    /*
    4) Calculadora de propinas:
    Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
    */

    public static void calcularPropina(){
        System.out.println("Dime el total de la cuenta del restaurante: ");
        double totalCuenta = sc.nextDouble();
        System.out.println("Porcentaje que quieres dejar de propina :): ");
        double porcentajePropina = sc.nextDouble();
        double montoPropina = totalCuenta*(porcentajePropina/100);
        System.out.println("El monto de la propina será: "+montoPropina);
    }

    /*
    5) Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
     */


    public static void adivinarNumero(){
        Random rand = new Random();
        int numAleatorio = rand.nextInt(100) + 1;

        System.out.println("Dime un número de 1 a 100: ");
        int num = sc.nextInt();

        if(num == numAleatorio){
            System.out.println("Brujooo!");
        }else {
            System.out.println("Nah, no adivinaste, el número era "+numAleatorio);
        }
    }




    public static void main(String[] args) {


        boolean fin = false;

        while(!fin) {

            System.out.println("¿Cuál ejercicio quieres ver? de 1 a 5, o escribe -1 para salir: ");
            int ejercicio = sc.nextInt();


            switch (ejercicio) {
                case 1:
                    System.out.println("Ejercicio 1");
                    calcularEdadPerro();
                    break;
                case 2:
                    System.out.println("Ejercicio 2");
                    convertirMillasAKilometros();
                    break;
                case 3:
                    System.out.println("Ejercicio 3");
                    calcularDescuento();
                    break;
                case 4:
                    System.out.println("Ejercicio 4");
                    calcularPropina();
                    break;
                case 5:
                    System.out.println("Ejercicio 5");
                    adivinarNumero();
                    break;
                case -1:
                    fin = true;
                    System.out.println("Chao");
                    break;
                default:
                    System.out.println("Ese ejercicio no existe");

            }

        }



    }



}
