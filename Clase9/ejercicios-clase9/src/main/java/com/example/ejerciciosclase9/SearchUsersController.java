package com.example.ejerciciosclase9;


/*
“Crea un servicio web en springboot que tenga un arreglo con nombres completos de personas.
Debe permitir realizar una búsqueda por el nombre de la persona, agregar personas y también borrarlas”.

 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/users")
public class SearchUsersController {


    List<String> usersList = new ArrayList<>(Arrays.asList("Lionel Messi", "Kylian Mbappe", "Erling Haaland", "Mohamed Salah", "Sadio Mané", "Sergio Ramos", "Robert Lewandowski"));

    @GetMapping("/{name}")
    public String getUser(@PathVariable String name){

        /*for(String user: usersList){
            if(user.toLowerCase().contains(name.toLowerCase().replaceAll("[+-]", " "))){
                return user;
            }
        }
        return "No encontrado"
        */

        //Using stream
        return usersList.stream().filter(n -> n.toLowerCase().contains(name.replaceAll("[+-]", " "))).findFirst().orElse("No encontrado");

    }

    @GetMapping("/add/{newUser}")
    public String addUser(@PathVariable String newUser){

        if(newUser.length() != 0){
            usersList.add(newUser.replaceAll("[+-]", " ").trim());
            return "Agregaste un usuario, la nueva lista es: "+ usersList.toString();
        }else{
            return "No válido";
        }

    }

    @GetMapping("/delete/{selectedUser}")
    public String deleteUser(@PathVariable String selectedUser){

       /* for(String user: usersList){
            if(user.toLowerCase().contains(selectedUser.toLowerCase().replaceAll("[+-]", " ").trim())){
                usersList.remove(user);
                return "Eliminaste un usuario, la nueva lista es: "+ usersList.toString();
            }
        }

        return "No encontrado";*/

        //Using Stream

        usersList = usersList.stream().filter(n -> !n.toLowerCase().contains(selectedUser.toLowerCase().replaceAll("[+-]", " ").trim())).toList();
        return "Eliminaste un usuario, la nueva lista es: "+ usersList.toString();

    }

}
