package org.example.interfazgraficafuncional1.controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.interfazgraficafuncional1.application.PeliculaApplication;
import org.example.interfazgraficafuncional1.model.Pelicula;
import org.example.interfazgraficafuncional1.repository.PeliculaRepository;

public class ControllerPelicula {
    @FXML
    private TextField txtTitulo;
    @FXML
    private TextField txtDirector;
    @FXML
    private TextField txtGenero;
    @FXML
    private TextField txtRecaudacion;
    @FXML
    private TextField txtCostos;

    @FXML
    private TableView<Pelicula> tblPeliculas;
    @FXML
    TableColumn<Pelicula, String> colTitulo;
    @FXML
    TableColumn<Pelicula, String> colDirector;
    @FXML
    TableColumn<Pelicula, String> colGenero;
    @FXML
    TableColumn<Pelicula, Double> colRecaudacion;
    @FXML
    TableColumn<Pelicula, Double> colCostos;

    private final ObservableList<Pelicula> peliculas = FXCollections.observableArrayList();
    private final PeliculaRepository peliculaRepository = new PeliculaRepository();

    @FXML
    private void initialize() {
        configureTable();
        loadInitialData();
        configureTableSelection();
    }

    private void configureTable(){
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colDirector.setCellValueFactory(new PropertyValueFactory<>("director"));
        colGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
        colRecaudacion.setCellValueFactory(new PropertyValueFactory<>("recaudaciones"));
        colCostos.setCellValueFactory(new PropertyValueFactory<>("costos"));
        tblPeliculas.setItems(peliculas);
    }



    private void loadInitialData(){
        peliculas.clear();
        peliculas.setAll(peliculaRepository.findAll());
    }

    private void configureTableSelection(){
        tblPeliculas.getSelectionModel().selectedItemProperty()
                .addListener((observable,oldValue,newValue)->{
                    if(newValue!=null) {
                        loadPeliculaIntoForm(newValue);
                    }
                });
    }


    private void loadPeliculaIntoForm(Pelicula pelicula){
        txtTitulo.setText(pelicula.getTitulo());
        txtDirector.setText(pelicula.getDirector());
        txtGenero.setText(pelicula.getGenero());
        txtRecaudacion.setText(String.valueOf(pelicula.getRecaudaciones()));
        txtCostos.setText(String.valueOf(pelicula.getCostos()));
    }

    @FXML
    public void clickRegistrar() {
        if(!validateForm()){
            return;
        }
        Pelicula pelicula = new Pelicula(
                txtTitulo.getText().trim(),
                txtDirector.getText().trim(),
                txtGenero.getText().trim(),
                Double.parseDouble(txtRecaudacion.getText()),
                Double.parseDouble(txtCostos.getText())
        );
                peliculas.add(pelicula);
                showAlert(Alert.AlertType.INFORMATION,"Registro exitoso","La película ha sido registrada correctamente");



    }
    private void showAlert(Alert.AlertType type, String title, String message){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public boolean validateForm() {
        String titulo = txtTitulo.getText().trim();
        String director = txtDirector.getText().trim();
        String genero = txtGenero.getText().trim();
        String recaudacion = txtRecaudacion.getText().trim();
        String costos = txtCostos.getText().trim();
        if(titulo.isEmpty() || director.isEmpty() || genero.isEmpty() ||  recaudacion.isEmpty() || costos.isEmpty()){
            showAlert(Alert.AlertType.WARNING,"Datos incompletos", "Complete todos los campos para continuar");
            return false;

       }
        return true;
    }



    @FXML
    public void clickLimpiar() {
        txtTitulo.clear();
        txtDirector.clear();
        txtGenero.clear();
        txtRecaudacion.clear();
        txtCostos.clear();
    }
    @FXML
    public void clickSalir() {
        System.exit(0);

    }


}
