package org.example.interfazgraficafuncional1.repository;

import org.example.interfazgraficafuncional1.model.Pelicula;

import java.util.List;

public class PeliculaRepository {
    public List<Pelicula> findAll(){
        return List.of(
                new Pelicula(
                        "Obssesion",
                        "Curry Barker",
                        "Terror",
                        590000000,
                        750000),
                new Pelicula(
                        "The substance",
                        "Coralie Fargeat",
                        "Drama",
                        77000000,
                        18000000),
                new Pelicula(
                        "Titanic",
                        "James Cameron",
                        "Romance",
                        220000000,
                        200000000));
    }
}