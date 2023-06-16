package com.example.ejerciciosclase9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchAutocompleteController {


    /*
    Estamos armando el servicio de autocompletar de Google.
Tienes que desarrollar una aplicación en springboot que recibe lo que está escribiendo el usuario, y devuelve un listado de posibles resultados.
Para hacer esto en un array de String carga resultados de ejemplo
     */

    @GetMapping("/search/{word}")
    public List<String> getWordsAutocomplete(@PathVariable  String word){


        List <String> result = new ArrayList<>();
        String [] optionsForSearching = {"Ruta de Backend", "Aprender programación", "Curso de inglés", "Curso de Java", "Curso de Spring", "MySQL","Curso de Angular", "Ruta de Frontend", "Curso de React", "Lógica de programación", "Curso de Javascript"};

        for(String option: optionsForSearching){
            if(option.toLowerCase().contains(word.toLowerCase())){
                result.add(option);
            }
        }
        return result;

    }

}
