/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eliaquimjolon.controller;

import com.eliaquimjolon.model.Rol;
import java.util.ArrayList;
import com.eliaquimjolon.model.Usuario;

/**
 *
 * @author informatica
 */
public class AuthSistema {

    private static ArrayList<Usuario> ListaUsuarios = new ArrayList<>();

    public AuthSistema() {
        Usuario usuarioAdmin = new Usuario("admin", "admin", "admin", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("dani", "123", "Daniela Melendez", Rol.USER);
        Usuario usuarioYo = new Usuario("kim", "1234", "Eliaquim Tzul", Rol.ADMIN);

        ListaUsuarios.add(usuarioAdmin);
        ListaUsuarios.add(usuarioUser);
        ListaUsuarios.add(usuarioYo);

    }

    public Usuario login(String nombreUsuario, String clave) {

        for (Usuario UsuarioBuscado : ListaUsuarios) {
            if (UsuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                    && UsuarioBuscado.getPassword().equals(clave)) {
                return UsuarioBuscado;
            }
        }

        return null;
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return ListaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        AuthSistema.ListaUsuarios = listaUsuarios;
    }
}
