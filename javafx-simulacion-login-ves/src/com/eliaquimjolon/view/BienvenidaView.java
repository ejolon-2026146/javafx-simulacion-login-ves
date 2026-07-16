/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eliaquimjolon.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author informatica
 */
/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {

    private static BienvenidaView instanciaBienvenidaView;

    private Label lblBienvenida;
    private Button btnCerrar;

    public BienvenidaView() {
        construirInterfaz();
    }

    private void construirInterfaz() {
        this.setPrefWidth(350);
        this.setPrefHeight(220);
        this.setSpacing(20);
        this.setStyle(
                "-fx-background-color: #2c3e50;"
                + "-fx-background-radius: 15;"
                + "-fx-padding: 30;"
        );

        lblBienvenida = new Label("¡Bienvenido!");
        lblBienvenida.setStyle(
                "-fx-text-fill: white;"
                + "-fx-font-size: 20px;"
                + "-fx-font-weight: bold;"
        );

        lblBienvenida.setWrapText(true);

        btnCerrar = new Button("Continuar");
        btnCerrar.setStyle(
                "-fx-background-color: #27ae60;"
                + "-fx-text-fill: white;"
                + "-fx-font-size: 14px;"
                + "-fx-padding: 8 20 8 20;"
                + "-fx-background-radius: 8;"
        );

        this.getChildren().add(lblBienvenida);
        this.getChildren().add(btnCerrar);
    }

    public void setNombreUsuario(String nombre) {
        lblBienvenida.setText("¡Bienvenid@, " + nombre + "!");
    }

    public Label getLblBienvenida() {
        return lblBienvenida;
    }

    public Button getBtnCerrar() {
        return btnCerrar;
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }
}
