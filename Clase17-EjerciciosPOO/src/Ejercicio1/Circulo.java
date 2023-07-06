package Ejercicio1;

public class Circulo extends Figura{

    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }


    //Getters y Setters


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * getRadio();
    }
}
