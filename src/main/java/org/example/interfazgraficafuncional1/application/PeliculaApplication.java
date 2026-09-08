package org.example.interfazgraficafuncional1.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PeliculaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PeliculaApplication.class.getResource("/org/example/interfazgraficafuncional1/registro-pelicula.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Registro de Película");
        stage.setScene(scene);
        stage.show();
    }
}
