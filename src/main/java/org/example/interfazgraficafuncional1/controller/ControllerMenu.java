package org.example.interfazgraficafuncional1.controller;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import org.example.interfazgraficafuncional1.application.EstudianteApplication;
import org.example.interfazgraficafuncional1.application.PeliculaApplication;

import java.io.IOException;

public class ControllerMenu {

    @FXML
    private MenuItem miEstudiante;
    @FXML
    private MenuItem miPeliculas;
    @FXML
    private MenuItem miDesarrollador;

    @FXML
    private void clickEstudiante (ActionEvent event) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(org.example.interfazgraficafuncional1.application.EstudianteApplication.class.getResource("/org/example/interfazgraficafuncional1/registro-estudiante.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Registro de Estudiante");
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    private void clickPeliculas (ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PeliculaApplication.class.getResource("/org/example/interfazgraficafuncional1/registro-pelicula.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Registro de Película");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    private void clickDesarrollador (ActionEvent event){
        ControllerDesarrollador controller = new ControllerDesarrollador();
        controller.showDevInfo("Denis", "Ortega", "diortega@uamv.edu.ni");
    }

    @FXML
    private void clickSalir (ActionEvent event){
        System.out.println("Se ha seleccionado la opción Salir");
        System.exit(0);
    }
}
