package com.example.ejerciciotrivia;

import com.example.ejerciciotrivia.data.CategoriesList;
import com.example.ejerciciotrivia.data.QuestionsList;
import com.example.ejerciciotrivia.entities.Category;
import com.example.ejerciciotrivia.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController

public class TriviaController {

    @GetMapping("/categories")
    public List<Category> getCategories(){
        return CategoriesList.getCategoriesList();  //Nos traemos la lista de categorías, ¿por qué externa? para que se vea más claro el código aquí
    }

    @GetMapping("/question/{category}")
    public Question getQuestion(@PathVariable String category){

        List<Question> myquestionList = QuestionsList.getQuestionList(); //Nos traemos la lista de preguntas

        /*Stream option
        <Question> questionsForSelectedCategory = myquestionList.stream()
                .filter(question -> question.getCategory().equals(category))
                .collect(Collectors.toList());*/

        List<Question> questionsForSelectedCategory = new ArrayList<>(); //Esta va a ser la lista filtrada

        myquestionList.forEach(elem ->{
            if(elem.getCategory().equals(category)){   //Usamos equals porque no es la misma referencia en memoria
                questionsForSelectedCategory.add(elem);
            }
        });

        Random random = new Random();
        int randomNumber;

        if(questionsForSelectedCategory.size()>0){     //Nos aseguramos que la lista filtrada tenga al menos un elemento
            randomNumber = random.nextInt(questionsForSelectedCategory.size());
            return questionsForSelectedCategory.get(randomNumber);
        }else{  //Si la lista filtrada tiene longitud 0 es porque llegó por parámetro una categoría que conocerá Dios, entonces devolveremos cualquier pregunta
            randomNumber = random.nextInt(myquestionList.size());
            return myquestionList.get(randomNumber);
        }


    }


}
