package Clase6;


import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {


        /*Arma un buscador de países con Google Maps.
        Primero, pidele al usuario que ingrese un país (Ej: Colombia).
        Después muestra en consola la concatenación de:
        “https://www.google.com/maps/search/” + pais
        Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre de un país: ");
        String country = sc.nextLine().trim().replaceAll(" ", "+");
        String url = "https://www.google.com/maps/search/"+country;
        System.out.println("URL: "+url);


        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
