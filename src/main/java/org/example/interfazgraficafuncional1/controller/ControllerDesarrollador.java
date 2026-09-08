package org.example.interfazgraficafuncional1.controller;

import javafx.scene.control.Alert;

public class ControllerDesarrollador {

    public void showDevInfo(String nombre, String apellido, String correo) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información del Desarrollador");
        alert.setHeaderText(null);
        alert.setContentText("Nombre: Denis" + "\nApellido: Ortega" + "\nCorreo: diortega@uamv.edu.ni");
        alert.show();
    }
}
