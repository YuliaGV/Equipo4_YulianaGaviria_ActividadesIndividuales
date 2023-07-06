package Ejercicio1;

public class Triangulo extends Figura{


    private double lado1;

    private double lado2;

    private double lado3;


    //Constructor

    public Triangulo(double lado1, double lado2, double lado3) {

        if (esTriangulo(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new IllegalArgumentException("Esos lados no forman un triángulo válido");
        }


    }

    //Getters y Setters


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }



    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - getLado1()) * (semiperimetro - getLado2()) * (semiperimetro - getLado3()));
    }

    @Override
    public double calcularPerimetro() {
        return getLado1() + getLado2() + getLado3();
    }


    private boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

}
