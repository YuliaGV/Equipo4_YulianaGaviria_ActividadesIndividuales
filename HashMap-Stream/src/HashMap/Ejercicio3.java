package HashMap;

/*
3. Traductor simple:
Crea una aplicación de traducción simple que tome palabras en un idioma y las traduzca a otro.
Utiliza un HashMap para almacenar pares de palabras clave-valor que representen las traducciones.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {


        HashMap<String, String> words = new HashMap<>();

        words.put("rojo", "red");
        words.put("verde", "green");
        words.put("azul", "blue");
        words.put("amarillo", "yellow");
        words.put("naranja", "orange");
        words.put("rosado", "pink");
        words.put("negro", "black");
        words.put("blanco", "white");
        words.put("gris", "gray");
        words.put("morado", "purple");
        words.put("marrón", "brown");
        words.put("turquesa", "turquoise");
        words.put("dorado", "gold");
        words.put("plateado", "silver");
        words.put("beige", "beige");
        words.put("celeste", "light blue");
        words.put("verde oliva", "olive green");
        words.put("violeta", "violet");



        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de un color en español: ");
        String word = sc.next();

        if(words.containsKey(word.toLowerCase())){
            System.out.println("La traducción de "+word+" al inglés es: "+words.get(word));
        }else {
            System.out.println("Palabra no encontrada");
        }




    }






}
