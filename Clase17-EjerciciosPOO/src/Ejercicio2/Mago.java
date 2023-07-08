package Ejercicio2;

public class Mago extends Personaje{


    private int poderMagico;


    //Constructor

    public Mago(String nombre, int nivel, int pocionesCuracion, int poderMagico) {
        super(nombre, nivel, pocionesCuracion);
        this.poderMagico = poderMagico;
    }


    //Getters y Setters


    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if(objetivo.getPuntosDeVida() == 0){
            System.out.println(getNombre() + " ataca a " +objetivo.getNombre()+" pero ese compa ya está muerto");
        }else{
            int dañoOcasionado = getPuntosDeDaño() + getNivel();; //El daño ocasionado equivale a la cantidad de puntos de daño, más un punto por cada nivel
            System.out.println(getNombre() + " ataca a " + objetivo.getNombre() +" y ocasiona "+dañoOcasionado+ " puntos de daño");
            objetivo.recibirDaño(dañoOcasionado);
        }
    }

    @Override
    public void recibirDaño(int cantidadDaño) {

        int dañoRecibido = cantidadDaño - getPoderMagico(); //Por cada punto de poder de ataque se reduce en 1 el daño recibido

        if(getPuntosDeVida()<=dañoRecibido){
            setPuntosDeVida(0);
            System.out.println(getNombre() + " murió");
        }else{
            if(dañoRecibido <= 0){
                System.out.println(getNombre() + " no recibe ningún daño");
            }else{
                setPuntosDeVida(getPuntosDeVida()-dañoRecibido);
                System.out.println(getNombre() + " recibió " +dañoRecibido+" puntos de daño");
            }
        }

    }

    public void lanzarHechizo(Personaje objetivo){
        if(objetivo.getPuntosDeVida() == 0){
            System.out.println(getNombre() + " le lanza un hechizo a " +objetivo.getNombre()+" pero ese compa ya está muerto");
        }else{
            int dañoOcasionado = getPuntosDeDaño() + getPoderMagico()*2;//Por cada punto de poder de ataque se incrementa en 2 punto el daño generado
            System.out.println(getNombre() + " le lanza un hecho a " + objetivo.getNombre() +" y ocasiona "+dañoOcasionado+ " puntos de daño");
            objetivo.recibirDaño(dañoOcasionado);
        }
    }
}
