package Clase6;

import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {


        /*
        Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de teléfono, sin espacios: ");
        String phoneNumber = sc.next();
        System.out.println("https://api.whatsapp.com/send?phone="+phoneNumber);


    }



}
