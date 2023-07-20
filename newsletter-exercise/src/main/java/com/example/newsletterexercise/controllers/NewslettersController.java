package com.example.newsletterexercise.controllers;


import com.example.newsletterexercise.models.Lead;

import com.example.newsletterexercise.repository.EmailRepository;
import com.example.newsletterexercise.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newsletter")
public class NewslettersController {

    @Autowired
    EmailRepository emailRepository;

    @PostMapping("/registeremail")
    public String register(@RequestBody Lead lead){

        String email = lead.getEmail();

        if(!EmailValidator.isValidEmail(email)){
            return "El email no es válido";
        }
        emailRepository.saveEmail(email);

        return "Email guardado: "+email;

    }

    @DeleteMapping("/unsuscribe")
    public String unsuscribe(@RequestBody Lead lead){

        String email = lead.getEmail();
        emailRepository.deleteEmail(email);

        return "Email eliminado: "+email;

    }

    @GetMapping("/getemails")
    public List<String> getEmailList(){

        return emailRepository.getEmails();
    }


}

