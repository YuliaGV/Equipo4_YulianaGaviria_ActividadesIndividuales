package com.bootcamp.triviagame.entities;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private long id;

    @Column(name = "name")
    private String category;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;


}
