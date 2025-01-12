package com.company;

import java.io.*;


public class GestorFicheroEscrituraBuffer {

    public void escrituraWriter(String path) {
        //Me tengo que crear siempre un objeto de tipo File -> FileWriter -> BufferWriter ->PrintWriter
        //Aquí es importantisimo es CERRAR EL FLUJO  con  PrintWriter no es obligatorio

        File file1 = new File(path);
        FileWriter fileWriter1 = null;
        BufferedWriter bufferedWriter= null;//Me creo el BufferWriter y lo inicializo a nullo
        PrintWriter printWriter = null; //Aqui no he de cerrar el flujo de datos. no es obligatorio

        try {
            fileWriter1 = new FileWriter(file1);//con false empieza de 0 y lo crea este o no.
            /*bufferedWriter = new BufferedWriter(fileWriter1);
            bufferedWriter.newLine();
            bufferedWriter.write("Escritura de una linea con buffer mirar en entrada su constructor creado");
            bufferedWriter.newLine();
            bufferedWriter.write("esto es otra linea");*/

            printWriter = new PrintWriter(file1);
            printWriter.println("Linea escrita con PrinWriter");
            printWriter.println("OTRA Linea escrita con PrinWriter");


        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero caracter a caracter, por permisos");
        }finally {
           try {
                //bufferedWriter.close();
               printWriter.close();
            }/* catch (IOException e) {
                System.out.println("Error en el cierre del flujo por IOException");
            } */ catch (NullPointerException e) {
                System.out.println("Error en el cierre del flujo");
            }
        }
    }
}
