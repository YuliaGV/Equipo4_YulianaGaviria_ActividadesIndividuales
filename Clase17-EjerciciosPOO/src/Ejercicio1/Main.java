package Ejercicio1;


import java.util.Scanner;

/*
Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro de una figura geométrica genérica.
Luego, crea clases derivadas como "Triangulo", "Rectangulo" y "Circulo", que hereden de la clase base y sobreescriban los métodos para calcular el área y el perímetro según su forma específica.
Crea instancias de las diferentes figuras y muestra sus áreas y perímetros.
 */
public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcionUsuario;
        boolean esActivo = true;

        while (esActivo) {
            System.out.println("¿Qué figura quieres? Escribe 1 para triángulo, 2 para rectángulo, 3 para círculo, 0 para salir: ");
            opcionUsuario = scanner.nextInt();

            switch (opcionUsuario) {
                case 1:
                    System.out.println("Dime la longitud del primer lado: ");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Dime la longitud del segundo lado: ");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Dime la longitud del tercer lado: ");
                    double lado3 = scanner.nextDouble();

                    try {
                        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                        System.out.println("Area: " + triangulo.calcularArea());
                        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error al crear el triángulo: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Dime la longitud de la base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Dime la longitud de la altura: ");
                    double altura = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("Area: " + rectangulo.calcularArea());
                    System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Dime la longitud del radio: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("Area: " + circulo.calcularArea());
                    System.out.println("Perimetro: " + circulo.calcularPerimetro());
                    break;

                case 0:
                    esActivo = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;


            }
        }

        scanner.close();
        System.out.println("Bye baby");







    }


}
