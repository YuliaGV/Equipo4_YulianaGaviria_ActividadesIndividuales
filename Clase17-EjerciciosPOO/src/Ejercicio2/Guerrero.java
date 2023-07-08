package Ejercicio2;

public class Guerrero extends Personaje{


    private int fuerzaAtaque;
    private boolean tieneArmadura;


    //Constructor

    public Guerrero(String nombre, int nivel, int pocionesCuracion, int fuerzaAtaque, boolean tieneArmadura) {
        super(nombre, nivel, pocionesCuracion);
        this.fuerzaAtaque = fuerzaAtaque;
        this.tieneArmadura = tieneArmadura;

    }


    //Getters y Setters

    public int getFuerzaAtaque() {
        return fuerzaAtaque;
    }

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = fuerzaAtaque;
    }

    public boolean tieneArmadura() {
        return tieneArmadura;
    }

    public void setTieneArmadura(boolean tieneArmadura) {
        this.tieneArmadura = tieneArmadura;
    }


    //Métodos

    @Override
    public void atacar(Personaje objetivo) {

        if(objetivo.getPuntosDeVida() == 0){
            System.out.println(getNombre() + " ataca a " +objetivo.getNombre()+" pero ese compa ya está muerto");
        }else{
            int dañoOcasionado = getPuntosDeDaño() + getFuerzaAtaque()*2 + getNivel(); //Por cada punto de fuerza de ataque se incrementa en 2 puntos el daño generado, más 1 punto por cada nivel
            System.out.println(getNombre() + " ataca a " + objetivo.getNombre() +" y ocasiona "+dañoOcasionado+ " puntos de daño");
            objetivo.recibirDaño(dañoOcasionado);
        }



    }

    @Override
    public void recibirDaño(int cantidadDaño) {

        int dañoRecibido = cantidadDaño;

        if(tieneArmadura()){
            dañoRecibido -= (int)dañoRecibido*0.15; //Si tiene armadura, el daño recibido se reduce en un 15%
        }

        if(getPuntosDeVida()<dañoRecibido){
            setPuntosDeVida(0);
            System.out.println(getNombre() + " murió");
        } else{
            if(dañoRecibido <= 0){
                System.out.println(getNombre() + " no recibe ningún daño");
            }else{
                setPuntosDeVida(getPuntosDeVida()-dañoRecibido);
                System.out.println(getNombre() + " recibió " +dañoRecibido+" puntos de daño");
            }

        }

    }


}
