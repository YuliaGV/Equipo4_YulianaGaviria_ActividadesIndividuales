package Ejercicio2;

import java.util.*;

public class Ejercicio2 {


    /*
    Crear un programa que funcione como una calculadora de cambio: Este programa debe recibir como entrada una cantidad de dinero y el costo de un producto.
    Utilizando la resta, el programa debe calcular el cambio que se debe entregar al cliente y mostrar la cantidad de billetes y monedas necesarios para el cambio.
     */

    /*Vamos a usar moneda colombiana COP*/


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Coloca el precio del producto");
        int purchasePrice = sc.nextInt();

        System.out.println("Coloca la cantidad de dinero que darás");
        int clientMoney = sc.nextInt();

        // Crear un HashMap para almacenar los billetes y monedas de Colombia
        Map<String, Integer> colombiaCurrency = new  LinkedHashMap<>();

        // Agregar los billetes y monedas con sus valores correspondientes
        colombiaCurrency.put("Billete de 50000", 50000);
        colombiaCurrency.put("Billete de 20000", 20000);
        colombiaCurrency.put("Billete de 10000", 10000);
        colombiaCurrency.put("Billete de 5000", 5000);
        colombiaCurrency.put("Billete de 2000", 2000);
        colombiaCurrency.put("Billete de 1000", 1000);
        colombiaCurrency.put("Moneda de 500", 500);
        colombiaCurrency.put("Moneda de 200", 200);
        colombiaCurrency.put("Moneda de 100", 100);
        colombiaCurrency.put("Moneda de 50", 50);

        int change = clientMoney - purchasePrice;

        Map<String, Integer> changeList = new  LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : colombiaCurrency.entrySet()) {
            changeList.put(entry.getKey(), change/entry.getValue());
            change %= entry.getValue();
        }

        System.out.println("El cambio será: ");
        for (Map.Entry<String, Integer> entry : changeList.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }


}
