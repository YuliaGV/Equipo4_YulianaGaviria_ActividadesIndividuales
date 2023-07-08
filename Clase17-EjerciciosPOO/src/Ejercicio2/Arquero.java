package Ejercicio2;

public class Arquero extends Personaje{

    private int nivelPunteria;

    //Constructor

    public Arquero(String nombre, int nivel, int pocionesCuracion, int nivelPunteria) {
        super(nombre, nivel, pocionesCuracion);
        this.nivelPunteria = nivelPunteria;
    }

    //Getters y Setters


    public int getNivelPunteria() {
        return nivelPunteria;
    }

    public void setNivelPunteria(int nivelPunteria) {
        this.nivelPunteria = nivelPunteria;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if(objetivo.getPuntosDeVida() == 0){
            System.out.println(getNombre() + " ataca a " +objetivo.getNombre()+" pero ese compa ya está muerto");
        }else{
            int dañoOcasionado = getPuntosDeDaño() + getNivel(); //El daño ocasionado equivale a la cantidad de puntos de daño más un punto por cada nivel del personaje
            System.out.println(getNombre() + " ataca a " + objetivo.getNombre() +" y ocasiona "+dañoOcasionado+ " puntos de daño");
            objetivo.recibirDaño(dañoOcasionado);
        }

    }

    @Override
    public void recibirDaño(int cantidadDaño) {
        int dañoRecibido = cantidadDaño;

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

    public void lanzarFecha(Personaje objetivo){
        if(objetivo.getPuntosDeVida() == 0){
            System.out.println(getNombre() + " le lanza una flecha a " +objetivo.getNombre()+" pero ese compa ya está muerto");
        }else{
            int dañoOcasionado = getPuntosDeDaño() + getNivelPunteria()*3; //El daño ocasionado aumenta 3 puntos por cada nivel de punteria
            System.out.println(getNombre() + " le lanza una flecha a " + objetivo.getNombre() +" y ocasiona "+dañoOcasionado+ " puntos de daño");
            objetivo.recibirDaño(dañoOcasionado);
        }

    }
}
