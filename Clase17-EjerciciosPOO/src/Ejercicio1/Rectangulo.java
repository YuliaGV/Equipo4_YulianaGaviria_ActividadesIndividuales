package Ejercicio1;

public class Rectangulo extends Figura {


    private double base;
    private double altura;


    //Constructor

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    //Setters y Getters


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return getBase()*getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return (2*getBase()) + (2*getAltura());
    }




}
