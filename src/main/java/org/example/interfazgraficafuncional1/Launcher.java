package org.example.interfazgraficafuncional1;

import javafx.application.Application;
import org.example.interfazgraficafuncional1.application.EstudianteApplication;
import org.example.interfazgraficafuncional1.application.MenuApplication;

public class Launcher {
    public static void main(String[] args) {
        Application.launch(MenuApplication.class, args);
    }
}
