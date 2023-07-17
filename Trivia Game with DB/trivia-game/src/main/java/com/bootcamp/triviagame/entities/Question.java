package com.bootcamp.triviagame.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "question")
@Data
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private long id;

    @Column(name = "question_text", columnDefinition = "TEXT")
    private String question;

    @Column(name = "explanation", columnDefinition = "TEXT")
    private String explanation;

    @ManyToOne   //Relación many to one con la entidad Categoria, una categoría puede tener muchas preguntas, una pregunta solamente tiene una categoría
    @JoinColumn(name = "category_id")
    private Category category;


}
