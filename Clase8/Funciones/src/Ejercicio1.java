

public class Ejercicio1 {

    /*
    Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
     */

    public static double calculateSquareArea(double side){
        return Math.pow(side, 2);
    }


    public static void main(String[] args) {
        System.out.println(calculateSquareArea(2));
        System.out.println(calculateSquareArea(10));
    }

}
