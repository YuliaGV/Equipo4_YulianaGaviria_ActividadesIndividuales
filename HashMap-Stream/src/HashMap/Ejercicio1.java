package HashMap;

/*
1. Contador de Palabras:
Escribe un programa que reciba una cadena de texto como entrada y cuente cuántas veces aparece cada palabra en el texto.
Utiliza un HashMap para almacenar las palabras como claves y sus frecuencias como valores.

 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> WordsFrequence = new HashMap<>();


        System.out.println("Ingresa una frase: ");
        String input = sc.nextLine();


        String pattern = "[^\\p{L}\\p{N}\\s]+"; //Everything different to words, numbers and spaces
         input =  input.replaceAll(pattern, "");


        String[] words= input.split(" ");


        for (String word : words) {
            if(WordsFrequence.containsKey(word.toLowerCase())){
                int currentAmount = WordsFrequence.get(word.toLowerCase());
                WordsFrequence.put(word.toLowerCase(), currentAmount+1);
            }else{
                WordsFrequence.put(word.toLowerCase(), 1);
            }
        }


        //Print
        for (Map.Entry<String, Integer> entry : WordsFrequence.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }



    }


}
