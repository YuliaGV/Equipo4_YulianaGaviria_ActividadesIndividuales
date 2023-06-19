/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales). Construye los siguientes métodos para la clase:
Un constructor, donde los datos pueden estar vacíos.
Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
mostrar(): Muestra los datos de la cuenta.
ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.

 */

public class Cuenta {

    private String titular;
    private double cantidad;

    //Constructores
    public Cuenta(){
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }


    //Getters
    public String getTitular(){
        return this.titular;
    }

    public double getCantidad(){
        return this.cantidad;
    }
    //Setters

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    //Mostrar
    public String mostrar(){
        return "Titular: "+getTitular() +
                "\nCantidad: "+getCantidad();
    }

    //Ingresar

    public void ingresar(double cantidad){
        if(cantidad>0){
            //this.cantidad += cantidad;
            setCantidad(getCantidad()+cantidad);
        }
    }

    //Retirar
    public void retirar(double cantidad){
        if(cantidad>0){
            //this.cantidad -= cantidad;
            setCantidad(getCantidad()-cantidad);
        }
    }





}
