module org.example.interfazgraficafuncional1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.interfazgraficafuncional1 to javafx.fxml;
    exports org.example.interfazgraficafuncional1;
    exports org.example.interfazgraficafuncional1.application;
    opens org.example.interfazgraficafuncional1.application to javafx.fxml;
    exports org.example.interfazgraficafuncional1.controller;
    opens org.example.interfazgraficafuncional1.controller to javafx.fxml;
    opens org.example.interfazgraficafuncional1.model to javafx.base;

}