package Clase6;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {


        /*
        Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.

        Los libros de “Elige tu propia aventura” eran historias interactivas, en el que el lector en un momento podía elegir a qué página ir.
        El ejercicio consiste en hacer un pequeño cuento de este estilo. Por ejemplo:


        Es una noche estrellada, te encuentras en un bosque misterioso:
        1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante
        2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora

        El usuario escoge “2”:
        Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:
        1) Entras por la puerta de la izquierda
        2) Optas por la puerta de la derecha

        El usuario escoge “1”:
        Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos.
        Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque.
        Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Tu hermano te prestó su auto y le hiciste una abolladura intentando parquear en la universidad. Escoge una opción: ");
        System.out.println("1. Le cuentas lo sucedido y le ofreces dinero para repararlo");
        System.out.println("2. Le dices que el auto ya tenía esa abolladura");

        boolean isValidOption = false;
        int option;

        while (!isValidOption){

            System.out.println("Escribe el número de tu opción: ");
            option = sc.nextInt();

            if(option == 1 || option ==2){
                isValidOption = true;
                if(option == 1){
                    System.out.println("Tu hermano se pone muy molesto al comienzo, pero luego toma el dinero y parece calmarse. Lamenta haberte prestado su auto, pero valora tu sinceridad");
                }else{
                    System.out.println("Aunque tu hermano no parece muy convencido, prefiere confiar en ti... pero su mejor amigo estaba aquel día en la universidad y vió cuando dañaste el auto. \nTu hermano está furioso, porque no sólo eres torpe, también eres mentiros@!");
                }

            }else {
                System.out.println("Opción no válida");
            }
        }

    }
}
