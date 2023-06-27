package com.example.ejerciciotriviaintegracionchatgpt;

import com.example.ejerciciotriviaintegracionchatgpt.data.CategoriesList;
import com.example.ejerciciotriviaintegracionchatgpt.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TriviaController {


    @GetMapping("/categories")
    public List<Category> getCategories(){
        return CategoriesList.getCategoriesList();  //Nos traemos la lista de categorías, ¿por qué externa? para que se vea más claro el código aquí
    }


    @GetMapping("/question/{categoria}")
    public String getQuestion(@PathVariable String categoria) {

        ChatGptClient chatGpt = new ChatGptClient();
        String respuestaJson = chatGpt.enviarPregunta("Estoy armando una trivia, necesito que me des una pregunta de la categoria " + categoria + ", con la siguiente estructura de JSON. LA respuesta de la pregunta no siempre tiene que ser la primera, tiene que variar:\n" +
                "\n" +
                "{\n" +
                "  \"category\": \"aca va el nombre de la categoria\",\n" +
                "  \"question\": \"aca va la pregunta\",\n" +
                "  \"options\": [\n" +
                "    \"aca va la opcion 1\",\n" +
                "    \"aca va la opcion 2\",\n" +
                "    \"aca va la opcion 3\"\n" +
                "  ],\n" +
                "  \"answer\": aqui va la respuesta correcta en caso de ser la primera es el numero 0 en caso de ser la segunda es el 1 y en caso de ser la tercera es el 2,\n" +
                "  \"explanation\": \"aca tienes que poner una explicacion diciendo porque es la respuesta correcta\"\n" +
                "}");
        return respuestaJson;
        //ObjectMapper convertidor = new ObjectMapper();
        //Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class);
        //return preg;
    }



}
