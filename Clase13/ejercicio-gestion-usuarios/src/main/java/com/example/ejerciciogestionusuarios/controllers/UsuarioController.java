package com.example.ejerciciogestionusuarios.controllers;

import com.example.ejerciciogestionusuarios.data.UsuariosLista;
import com.example.ejerciciogestionusuarios.entities.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

        //Opción usando forEach
        /*usuarios.forEach(usuario -> {
            if (String.valueOf(usuario.getId()).equals(id)) {
            usuarios.remove(usuario);
            return;
        }
        });*/


    }


    @PutMapping("/usuarios/{id}")
    public void editarUsuario(@PathVariable String id, @RequestBody Usuario usuarioActualizado){

        Optional<Usuario> usuarioOptional = usuarios.stream()
                .filter(usuario -> String.valueOf(usuario.getId()).equals(id))
                .findFirst();


        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();

            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setApellido(usuarioActualizado.getApellido());
            usuario.setTelefono(usuarioActualizado.getTelefono());
            usuario.setEmail(usuarioActualizado.getEmail());

        }


        //Opción usando forEach
        /*usuarios.forEach(usuario -> {
            if (String.valueOf(usuario.getId()).equals(id)) {
                usuario.setNombre(usuarioActualizado.getNombre());
                usuario.setApellido(usuarioActualizado.getApellido());
                usuario.setTelefono(usuarioActualizado.getTelefono());
                usuario.setEmail(usuarioActualizado.getEmail());

            }

        });*/



    }




}
