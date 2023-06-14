public class Ejercicio2 {

    /*
    Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
     */

    public static double calculateTriangleArea(double base, double height){
        return (base*height)/2;
    }

    public static void main(String[] args) {

        System.out.println(calculateTriangleArea(4, 4));
        System.out.println(calculateTriangleArea(3, 10));

    }
}
