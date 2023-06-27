package com.example.ejerciciogestionusuarios.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

}
