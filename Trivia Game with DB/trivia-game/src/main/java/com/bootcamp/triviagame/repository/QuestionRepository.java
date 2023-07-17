package com.bootcamp.triviagame.repository;


import com.bootcamp.triviagame.entities.Category;
import com.bootcamp.triviagame.entities.Question;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class QuestionRepository {


    @PersistenceContext
    EntityManager entityManager; //Estamos usando Entity Manager para interactuar con la base de datos

    public List<Question> getAllQuestionsByIDCategory(long id) {
        String jpql = "SELECT q FROM Question q WHERE q.category.id = :id";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("id", id);

        try {
            return (List<Question>) query.getResultList();
        } catch (NoResultException e) {
            // Manejar la excepción si no se encuentran preguntas
            return null;
        }
    }



}
