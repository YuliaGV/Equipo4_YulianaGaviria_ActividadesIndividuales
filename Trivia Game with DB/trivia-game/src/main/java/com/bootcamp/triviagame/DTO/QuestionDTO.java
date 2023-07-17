package com.bootcamp.triviagame.DTO;

import lombok.Data;

@Data
public class QuestionDTO {  //Esta es una especie de clase auxiliar que representa el objeto que finalmente se va a retornar el controlador


    private String category;
    private String question;
    private String[] options;
    private int answer;
    private String explanation;





}
