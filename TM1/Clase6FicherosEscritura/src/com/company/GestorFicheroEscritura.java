package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestorFicheroEscritura {

    private int contador =0; //Para la creación de muchos ficheros

    public void escrituraWriter(String path) {
        //Me tengo que crear siempre un objeto de tipo File -> FileWriter -> BufferWriter ->PrintWriter
        //Aquí es importantisimo es CERRAR EL FLUJO  que es obligatorio

        //Segundo ejemplo escritura y creacion de varios ficheros_escritura 1.txt hasta el 6
        //contador++;
        //path += "_escritura "+ contador+ ".txt";

        File file = new File(path);
        FileWriter fileWriter = null;

        //Preguntar a usuario que quiere escribir en el nuevo fichero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto a guardar");
        String LecturaFrase = scanner.nextLine();
        System.out.println(" Indica si quieres sobreescribir el fichero");
        boolean sobreescritura = scanner.hasNextBoolean();



        try {                                                  //con false empieza de 0 y lo crea este o no.
            fileWriter = new FileWriter(file, sobreescritura);
            //fileWriter = new FileWriter(file, true); // append -> anexar o no la escritura. el ( esta a false siempre y se  escribe)
            //fileWriter.write( 88); //Escribe en codigo asci
            fileWriter.write( 88);
            fileWriter.write( LecturaFrase);

        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero caracter a caracter, por permisos");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error en el cierre del flujo por IOException");
            } catch (NullPointerException e) {
                System.out.println("Error en el cierre del flujo");
            }
        }



    }
}






