package com.bootcamp.triviagame.repository;

import com.bootcamp.triviagame.entities.Category;
import com.bootcamp.triviagame.entities.Option;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class OptionsRepository {


    @PersistenceContext
    EntityManager entityManager; //Estamos usando Entity Manager para interactuar con la base de datos


    public List<Option> getOptionsByQuestion(long id){

        String jpql = "SELECT c FROM Option c WHERE c.questionId = :id";
        Query query = entityManager.createQuery(jpql); //Creando la consulta
        query.setParameter("id", id);   //Estos son los parámetros de la consulta, en este caso solamente id

        try {
            return (List<Option>) query.getResultList();
        } catch (NoResultException e) {
            // Manejar la excepción si no se encuentra la categoría
            return null;
        }
    }



}
