package com.bootcamp.triviagame;


import com.bootcamp.triviagame.DTO.QuestionDTO;
import com.bootcamp.triviagame.entities.Category;
import com.bootcamp.triviagame.entities.Option;
import com.bootcamp.triviagame.entities.Question;
import com.bootcamp.triviagame.repository.CategoryRepository;
import com.bootcamp.triviagame.repository.OptionsRepository;
import com.bootcamp.triviagame.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TriviaController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    OptionsRepository optionsRepository;


    //Controller del endpoint /categories
    @GetMapping("/categories")
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }


    //Controller del endpoint /questions/{category}

    @GetMapping("/question/{category}")
    public QuestionDTO getQuestion(@PathVariable String category){

        QuestionDTO result = new QuestionDTO();


        if(categoryRepository.findByName(category) == null){
            return result;  //Si la categoría señalada no existe, retornamos null
        }else {

            long categoryID = categoryRepository.findByName(category).getId();

            if(questionRepository.getAllQuestionsByIDCategory(categoryID) == null){ //Si no hay preguntas para la categoría señalada, retornamos null
                return result;
            }else {

                List<Question> questionList = questionRepository.getAllQuestionsByIDCategory(categoryID); //Nos traemos las preguntas de la categoría


                //Obtener un elemento random de la lista
                Random random = new Random();
                Question question = questionList.get(random.nextInt(questionList.size()));


                //Empezamos a construir el objeto QuestionDTO que se retornará, este objeto lo llamamos result

                /*¿Por qué un objeto DTO?
                El front nos exige un objeto cuya entidad no tenemos porque sus atributos vienen de la combinación de varias entidades de acuerdo a la estructura planteada
                 */

                result.setCategory(category); //Categoria de la pregunta
                result.setQuestion(question.getQuestion()); //Texto de la pregunta

                //Obtenemos la opciones asociadas a la pregunta
                long questionID = question.getId();
                List<Option> options = optionsRepository.getOptionsByQuestion(questionID);

                Collections.shuffle(options); //Desordenamos la lista para que aparezcan en diferente orden al que fueron ingresadas en la base de datos y evitar que se detecte un patrón


                //Creamos un array para almacenar los textos de las opciones


                String[] optionsText = new String[options.size()];


                //En el siguiente ciclo vamos a recorrer las opciones e ir asignando sus textos al array de opciones, también guardaremos el índice de la opción correcta en el atributo answer que devolveremos

                for(int i=0; i<options.size(); i++){

                    optionsText[i] = options.get(i).getOptionText();
                    if(options.get(i).getIsCorrect() == 1){
                        result.setAnswer(i);
                    }

                }


                result.setOptions(optionsText);
                result.setExplanation(question.getExplanation());

                return result;


            }


        }






    }






}
