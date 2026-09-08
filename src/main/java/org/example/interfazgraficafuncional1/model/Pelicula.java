package org.example.interfazgraficafuncional1.model;

public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private double recaudaciones;
    private double costos;

    public Pelicula(String titulo, String director, String genero, double recaudaciones, double costos) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.recaudaciones = recaudaciones;
        this.costos = costos;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getRecaudaciones() {
        return recaudaciones;
    }

    public void setRecaudaciones(double recaudaciones) {
        this.recaudaciones = recaudaciones;
    }

    public double getCostos() {
        return costos;
    }

    public void setCostos(double costos) {
        this.costos = costos;
    }
}
