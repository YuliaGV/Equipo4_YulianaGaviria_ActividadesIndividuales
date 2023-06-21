package com.example.ejerciciotrivia.data;

import com.example.ejerciciotrivia.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoriesList {

    public static List<Category> getCategoriesList(){  //Static para que no tengamos que instanciar esta clase
        Category cat = new Category();
        cat.setCategory("Programacion");
        cat.setDescription("Preguntas relacionadas con programación, desarrollo de software y lenguajes de programación.");

        Category cat2 = new Category();
        cat2.setCategory("Musica Rock");
        cat2.setDescription("Preguntas relacionadas con la música rock, bandas, artistas, albums y su historia.");


        Category cat3 = new Category();
        cat3.setCategory("Videojuegos");
        cat3.setDescription("Preguntas relacionadas con videojuegos, curiosidades sobre estos, personajes y la industria de los videojuegos en general.");

        Category cat4 = new Category();
        cat4.setCategory("Geografia");
        cat4.setDescription("Preguntas relacionadas con países, capitales, continentes y características geográficas");

        Category cat5 = new Category();
        cat5.setCategory("Biologia");
        cat5.setDescription("Preguntas relacionadas con el estudio de los seres vivos, sistemas biológicos y ecosistemas");

        Category cat6 = new Category();
        cat6.setCategory("Matematicas");
        cat6.setDescription("Preguntas relacionadas con teoría de números, álgebra, geometría, cálculo y otras ramas de las matemáticas");

        List<Category> categoriesList = new ArrayList<>();
        categoriesList.add(cat);
        categoriesList.add(cat2);
        categoriesList.add(cat3);
        categoriesList.add(cat4);
        categoriesList.add(cat5);
        categoriesList.add(cat6);

        return categoriesList;
    }



}
