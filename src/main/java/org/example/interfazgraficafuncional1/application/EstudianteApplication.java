package org.example.interfazgraficafuncional1.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EstudianteApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EstudianteApplication.class.getResource("/org/example/interfazgraficafuncional1/registro-estudiante.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Registro de Estudiante");
        stage.setScene(scene);
        stage.show();
    }
}
