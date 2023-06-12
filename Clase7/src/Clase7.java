import java.util.Arrays;
import java.util.Scanner;

public class Clase7 {

    public static void main(String[] args) {


        /*
        Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
         */

        Scanner sc = new Scanner(System.in);

        double [] numbers = new double[5];
        for(int i=0; i<numbers.length; i++){
            System.out.println("Ingresa un número: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.println("Los números ingresados fueron: "+ Arrays.toString(numbers));


        /*
        Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
         */

        double min = numbers[0];
        double max = numbers[0];
        double sum = 0;


        for (int i=0; i<numbers.length; i++){

            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }

            sum += numbers[i];

        }


        System.out.println("El número menor es: "+min);
        System.out.println("El número mayor es: "+max);

        //Otra opción usando stream
        System.out.println("El número menor es: "+ Arrays.stream(numbers).min().orElse(Double.NaN));
        System.out.println("El número mayor es: "+ Arrays.stream(numbers).max().orElse(Double.NaN));


         /*
        Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
         */


        double average = sum/numbers.length;
        System.out.println("El promedio es: "+average);

        //Otra opción usando stream
        System.out.println("El promedio es: "+ Arrays.stream(numbers).average().orElse(Double.NaN));

    }


}


