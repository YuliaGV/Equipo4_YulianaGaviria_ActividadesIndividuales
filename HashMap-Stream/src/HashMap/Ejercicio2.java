package HashMap;


/*
2. Agenda de contactos:
Desarrolla una aplicación de agenda de contactos en la que los usuarios puedan agregar nombres y números de teléfono.
Implementa funciones para agregar, buscar y eliminar contactos utilizando un HashMap donde los nombres son las claves y los números son los valores.

 */

import java.util.HashMap;

public class Ejercicio2 {


    static HashMap<String, String> ContactsList = new HashMap<>();

    public static String findContactName(String name){
        return ContactsList.keySet().stream().filter(palabra -> palabra.contains(name.toLowerCase())).findFirst().orElse("");
    }


    public static void addContact(String name, String phoneNumber){
        ContactsList.put(name.toLowerCase(), phoneNumber);
    }

    public static String findNumber(String name){

        if(ContactsList.containsKey(findContactName(name))){
            return ContactsList.get(findContactName(name));
        }
        return "No encontrado";
    }

    public static void deleteContact(String name){

        if(ContactsList.containsKey(findContactName(name))){
            ContactsList.remove(findContactName(name).toLowerCase());
        }
    }





    public static void main(String[] args) {

        addContact("Perano Pérez", "3216392879");
        addContact("Felipe Gómez", "3008526423");
        addContact("Felipe Arias", "3104691282");
        System.out.println(findNumber("Felipe"));
        System.out.println(findNumber("Felipe"));

    }

}
