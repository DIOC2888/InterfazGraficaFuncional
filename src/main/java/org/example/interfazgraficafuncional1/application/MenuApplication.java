package org.example.interfazgraficafuncional1.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MenuApplication.class.getResource("/org/example/interfazgraficafuncional1/menu-principal-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menú Principal");
        stage.setScene(scene);
        stage.show();
    }

}
