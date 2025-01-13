package com.company;

import java.util.Scanner;

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

        //Ejemplo 4 GestorFicheroConjunto escribir y leer cifrando con la fase
        GestorFicheroConjunto gestorFicheroConjunto = new GestorFicheroConjunto();
        //MENU PARA CIFRAR Y DESCIFRAR
        Scanner scanner = new Scanner(System.in);
        int opcion= 0;

        do {
            System.out.println("Indica que quieres hacer");
           opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestorFicheroConjunto.cifrado("src/FicherosBuffer/FicheroConjuntoEjemplo4.txt");
                    break;

                case 2:
                    gestorFicheroConjunto.descifrado("src/FicherosBuffer/FicheroConjuntoEjemplo4.txt");
                    break;
            }
        }while (opcion!=0);
        gestorFicheroConjunto.cifrado("src/FicherosBuffer/FicheroConjuntoEjemplo4.txt");
    }
}
