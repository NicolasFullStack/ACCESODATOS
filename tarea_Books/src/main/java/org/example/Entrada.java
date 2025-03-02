package org.example;

import Controlador.ControladorLibros;
import model.Autor;
import model.Editorial;
import model.Libreria;
import model.Libro;

import java.util.ArrayList;
import java.util.List;

public class Entrada {
    public static void main(String[] args) {


        ControladorLibros controladorLibros = new ControladorLibros();

        //Dar de alta 3 autores
        controladorLibros.agregarAutor(new Autor("Pepe","Sanz"));
        controladorLibros.agregarAutor(new Autor("juan","perez"));
        controladorLibros.agregarAutor(new Autor("josefa","gutierrez"));

        //Dar de alta 2 editoriales
        controladorLibros.agregarEditorial(new Editorial("azul","matilde2"));
        controladorLibros.agregarEditorial(new Editorial("alfaguara","ponzano 23"));

        //Dar de alta 8 libros cada libro será escrito por uno de los autores dados de alta
        //previamente y pertenecerá a uno de los editoriales dados de alta previamente.

        controladorLibros.agregarLibro(new Libro("El Misterio de la Isla Perdida",12,1,1));
        controladorLibros.agregarLibro(new Libro("Aventuras en el Bosque Encantado",22,1,2));
        controladorLibros.agregarLibro(new Libro("El Enigma del Castillo",34,2,1));
        controladorLibros.agregarLibro(new Libro("Historias de la Ciudad Oculta" ,20,2,2));
        controladorLibros.agregarLibro(new Libro("Secretos del Mar Profundo" ,10,2,2));
        controladorLibros.agregarLibro(new Libro("Cuentos de la Luna Llena" ,45,3,2));
        controladorLibros.agregarLibro(new Libro("Viaje a las Estrellas" ,25,3,1));
        controladorLibros.agregarLibro(new Libro("El Secreto de la Montaña" ,30,2,2));

        //2 librerías, cada librería tendrá 4 libros dados de alta previamente
        controladorLibros.agregarLibreria(new Libreria("libreria Pepe","jose mora","apodaca 2"));
        controladorLibros.agregarLibreria(new Libreria("libreria Punto","Julieta Hernan","Cruz 30"));

    }
}