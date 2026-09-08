package org.example.interfazgraficafuncional1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerEstudiante {


    @FXML
    private TextField txtNombresEst;
    @FXML
    private TextField txtApellidosEst;
    @FXML
    private TextField txtCarreraEst;
    @FXML
    private TextField txtAnioAcadEst;
    @FXML
    private TextField txtDireccionEst;
    @FXML
    private TextArea txtAreaInfo;


    @FXML
    public void clickRegistrar(ActionEvent actionEvent) {
        String nombres = txtNombresEst.getText();
        String apellidos = txtApellidosEst.getText();
        String carrera = txtCarreraEst.getText();
        String anioAcad = txtAnioAcadEst.getText();
        String direccion = txtDireccionEst.getText();
        if (nombres.isEmpty() || apellidos.isEmpty() || carrera.isEmpty() || anioAcad.isEmpty() || direccion.isEmpty()) {
            txtAreaInfo.setText("Por favor, complete todos los campos.");
            return;
        }

        String info = "Nombre: " + nombres + "\nApellidos: " + apellidos + "\nCarrera: " + carrera + "\nAño Académico: " + anioAcad + "\nDirección: " + direccion;
        txtAreaInfo.setText(info);

    }
    @FXML
    public void clickLimpiar(ActionEvent actionEvent) {
        txtNombresEst.clear();
        txtApellidosEst.clear();
        txtCarreraEst.clear();
        txtAnioAcadEst.clear();
        txtDireccionEst.clear();
        txtAreaInfo.clear();
    }



}
