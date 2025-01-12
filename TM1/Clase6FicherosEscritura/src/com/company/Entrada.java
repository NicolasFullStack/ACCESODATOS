package com.company;

public class Entrada {

    public static void main(String[] args) {

        // ejemplo 1 gestorFicheroEscritura.escrituraWriter("src/Ficheros/FicheroWriterCreado.txt");
       // GestorFicheroEscritura gestorFicheroEscritura= new GestorFicheroEscritura();
        //gestorFicheroEscritura.escrituraWriter("src/Ficheros/FicheroScanner.txt");



        //Ejemplo 2 creación de muchos ficheros
        /*
        gestorFicheroEscritura.escrituraWriter("src/Ficheros/");
        gestorFicheroEscritura.escrituraWriter("src/Ficheros/");
        gestorFicheroEscritura.escrituraWriter("src/Ficheros/");
        gestorFicheroEscritura.escrituraWriter("src/Ficheros/");
        gestorFicheroEscritura.escrituraWriter("src/Ficheros/");*/

        //Ejemplo 3 BufferWriter y PrintWriter
        /*GestorFicheroEscrituraBuffer gestorFicheroEscrituraBuffer1 = new GestorFicheroEscrituraBuffer();
        gestorFicheroEscrituraBuffer1.escrituraWriter("src/FicherosBuffer/ficheroBuffer1.txt");*/

        //Ejemplo 4 GestorFicheroConjunto escribir y leer
        GestorFicheroConjunto gestorFicheroConjunto = new GestorFicheroConjunto();
        gestorFicheroConjunto.lecturaEscritura("src/FicherosBuffer/FicheroConjuntoEjemplo4.txt");

    }
}
