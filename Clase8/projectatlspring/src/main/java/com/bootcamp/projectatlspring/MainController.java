package com.bootcamp.projectatlspring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


/*
Crea una aplicación en Springboot que permita generar contraseñas (utilizando el código del ejercicio anterior) al llamar a la siguiente ruta:
localhost:8080/generar-password

 */


@RestController
public class MainController {

    @GetMapping("generar-password")
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


}
