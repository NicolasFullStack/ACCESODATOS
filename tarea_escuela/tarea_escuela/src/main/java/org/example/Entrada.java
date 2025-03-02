package org.example;

import controlador.EscuelaController;
import model.Alumno;

public class Entrada {
    public static void main(String[] args) {

        EscuelaController escuelaController = new EscuelaController();

        EscuelaController.crearAlumno(new Alumno("juan","sanchez","barco 56"));
        System.out.println("el alumno ha sido creado" );



    }
}