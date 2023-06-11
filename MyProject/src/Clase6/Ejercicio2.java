package Clase6;

import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {


        /*
        Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
        Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
        Después muestra en consola la concatenación de:
        “https://twitter.com/search?q=” + palabra

         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre de una celebridad: ");
        String person= sc.nextLine().trim().replaceAll(" ", "%20");
        String url = "https://twitter.com/search?q="+person;
        System.out.println("URL: "+url);

        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
