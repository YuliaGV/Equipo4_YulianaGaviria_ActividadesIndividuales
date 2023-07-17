package com.bootcamp.triviagame.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "options") //Se nombro options porque el nombre option resultó problemático en MySQL

@Data
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private long id;

    @Column(name = "option_text")
    private String optionText;

    @Column(name = "is_correct" , columnDefinition = "TINYINT")
    private byte isCorrect;


    @ManyToOne   //Relación many to one con la entidad Question, una pregunta puede tener varias opciones, una opción solamente pertenece a una pregunta
    @JoinColumn(name = "question_id")
    private Question question;




}
