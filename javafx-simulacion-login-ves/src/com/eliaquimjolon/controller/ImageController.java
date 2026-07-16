/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eliaquimjolon.controller;

import javafx.scene.image.Image;

/**
 *
 * @author informatica
 */
public class ImageController {

    private final String RUTA_IMAGENES = "/com/eliaquimjolon/resources/";

    public Image getImagelogin(String nombreImagen) {
        Image crearImagen;
        switch (nombreImagen) {
            case "logo":
                crearImagen = new Image(RUTA_IMAGENES + "MegaMan.png");
                break;
            default:
                crearImagen = new Image(RUTA_IMAGENES + "MegaMan.png");
        }
        return crearImagen;
    }
}
