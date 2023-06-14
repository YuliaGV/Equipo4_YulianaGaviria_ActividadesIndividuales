import java.util.Random;

public class Ejercicio3 {

    /*
    Crear una función que sea un generador de contraseñas.
    Al llamarla debe devolver una contraseña (por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
     */

    public static String createPassword(){

        //Create alphabet
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabet = alphabetString.toCharArray();

        //Create array of symbols
        String symbolsString = "&$*()+-#";
        char[] symbols = symbolsString.toCharArray();

        //For using Random methods
        Random random = new Random();

        StringBuilder password = new StringBuilder();

        //Concatenate five letters
        for (int i = 0; i < 5; i++) {
            password.append(alphabet[random.nextInt(alphabet.length)]);
        }

        //Concatenate a random number
        password.append(Math.round(Math.random()*1000000));


        //Concatenate a symbol
        password.append(symbols[random.nextInt(symbols.length)]);


        return password.toString();

    }

    public static void main(String[] args) {
        System.out.println(createPassword());
    }
}
