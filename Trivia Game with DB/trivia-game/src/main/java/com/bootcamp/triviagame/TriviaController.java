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

import java.util.ArrayList;
import java.util.List;

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

    /*@GetMapping("/question/{category}")
    public QuestionDTO getQuestion(@PathVariable String category){

        QuestionDTO result = new QuestionDTO();


        if(categoryRepository.findByName(category) == null){
            return result;  //Si la categoría señalada no existe, retornamos null
        }else {

            long categoryID = categoryRepository.findByName(category).getId();

            if(questionRepository.getAllQuestionsByIDCategory(categoryID) == null){ //Si no hay preguntas para la categoría señalada, retornamos null
                return result;
            }else{

                List <Question> questionList = questionRepository.getAllQuestionsByIDCategory(categoryID);

                Question question = questionList.get(0);

                result.setCategory(category);
                result.setQuestion(question.getQuestion());

                long questionID = question.getId();

                List<Option> options = optionsRepository.getOptionsByQuestion(questionID);

                for (Option que : options) {
                    if (que.getIsCorrect() == 0) {
                        result.setAnswer((int) que.getId());
                    }
                }



                return result;


            }


        }






    }

    */
    

    /*
    private String category;
    private String question;
    private String[] options;
    private int answer;
    private String explanation;
     */



}
