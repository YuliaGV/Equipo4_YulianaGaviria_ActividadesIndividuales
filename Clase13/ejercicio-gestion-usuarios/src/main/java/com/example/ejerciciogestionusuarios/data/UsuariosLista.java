package com.example.ejerciciogestionusuarios.data;

import com.example.ejerciciogestionusuarios.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosLista {


    public static List<Usuario> getUserList(){

        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setNombre("Jon");
        usuario1.setApellido("Snow");
        usuario1.setTelefono("123456789");
        usuario1.setEmail("jon@example.com");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setNombre("Daenerys");
        usuario2.setApellido("Targaryen");
        usuario2.setTelefono("987654321");
        usuario2.setEmail("daenerys@example.com");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setNombre("Tyrion");
        usuario3.setApellido("Lannister");
        usuario3.setTelefono("555555555");
        usuario3.setEmail("tyrion@example.com");

        Usuario usuario4 = new Usuario();
        usuario4.setId(4);
        usuario4.setNombre("Arya");
        usuario4.setApellido("Stark");
        usuario4.setTelefono("999999999");
        usuario4.setEmail("arya@example.com");

        Usuario usuario5 = new Usuario();
        usuario5.setId(5);
        usuario5.setNombre("Cersei");
        usuario5.setApellido("Lannister");
        usuario5.setTelefono("111111111");
        usuario5.setEmail("cersei@example.com");


        List <Usuario> list = new ArrayList<>();
        list.add(usuario1);
        list.add(usuario2);
        list.add(usuario3);
        list.add(usuario4);
        list.add(usuario5);

        return list;

    }


}
