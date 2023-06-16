package com.example.ejercicio2clase9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/search")
    public String[] getWordsAutocomplete(String search){

        String [] options = {"Ruta de Backend", "Aprender programación", "Inglés", "Curso de Java", "Curso de Spring", "MySQL","Curso de Angular", "Ruta de Frontend"};


        return result;

    }

}
