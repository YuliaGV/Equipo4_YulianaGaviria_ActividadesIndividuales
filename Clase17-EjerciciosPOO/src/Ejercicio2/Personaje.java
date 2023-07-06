package Ejercicio2;

public abstract class Personaje {


    private String nombre;
    private int nivel;
    private int puntosDeVida;

    private int puntosDeDaño;

    private int pocionesCuracion;


    //Constructor

    public Personaje(String nombre, int nivel, int pocionesCuracion) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeDaño = 5;
        this.puntosDeVida = 100;


    }


    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeDaño() {
        return puntosDeDaño;
    }

    public void setPuntosDeDaño(int puntosDeDaño) {
        this.puntosDeDaño = puntosDeDaño;
    }

    public int getPocionesCuracion() {
        return pocionesCuracion;
    }

    public void setPocionesCuracion(int pocionesCuracion) {
        this.pocionesCuracion = pocionesCuracion;
    }


    //Métodos

    public abstract void atacar(Personaje objetivo);
    public abstract void recibirDaño(int cantidadDaño);

    public void curarse(int cantidadVida){

        if(getPocionesCuracion() == 0){
            System.out.println(getNombre() + " ya no tiene pociones de curación");
        }else if(getPuntosDeVida() ==0) {
            System.out.println(getNombre() + " ya no tiene remedio");
        }else if(getPuntosDeVida() ==100){
            System.out.println(getNombre() + " ya tiene salud máxima");
        }else{
            setPuntosDeVida(getPuntosDeVida()+20);
            setPocionesCuracion(getPocionesCuracion()-1);
        }

    }



}
