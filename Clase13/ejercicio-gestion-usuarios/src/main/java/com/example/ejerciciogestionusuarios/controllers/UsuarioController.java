package com.example.ejerciciogestionusuarios.controllers;

import com.example.ejerciciogestionusuarios.data.UsuariosLista;
import com.example.ejerciciogestionusuarios.entities.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {


    List<Usuario> usuarios = UsuariosLista.getUserList();


    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }


    @PostMapping("/usuarios")
    public void agregarUsuario(@RequestBody Usuario newUser){
        usuarios.add(newUser);
    }

    @DeleteMapping("/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id){
        usuarios = usuarios.stream().filter(usuario -> !String.valueOf(usuario.getId()).equals(id)).toList();

        /*Opción usando forEach
        */


    }

}
