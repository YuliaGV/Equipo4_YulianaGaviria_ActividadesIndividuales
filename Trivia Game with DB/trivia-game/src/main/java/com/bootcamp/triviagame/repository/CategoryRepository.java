package com.bootcamp.triviagame.repository;


import com.bootcamp.triviagame.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class CategoryRepository {



    @PersistenceContext
    EntityManager entityManager; //Estamos usando Entity Manager para interactuar con la base de datos


    public Category findById(Long id){
        return  entityManager.find(Category.class, id);
    }

    public Category findByName(String name) {
        String jpql = "SELECT c FROM Category c WHERE LOWER(c.category) = LOWER(:name)";  //Lower permite convertir a mayúscula
        Query query = entityManager.createQuery(jpql); //Creando la consulta
        query.setParameter("name", name);   //Estos son los parámetros de la consulta, en este caso solamente name

        try {
            return (Category) query.getSingleResult();
        } catch (NoResultException e) {
            // Manejar la excepción si no se encuentra la categoría
            return null;
        }
    }

    public List<Category> findAll() {
        Query query = entityManager.createQuery("SELECT c FROM Category c");
        return query.getResultList();
    }




}
