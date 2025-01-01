package controller;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

public class GestorFicheros {

    public void lecturaDirectoios(String path){
        // Me creo un File logico que apunta a un File fisico que exista
        // -> 1º Obtener todos los nombres de los ficheros del directorio llamado directorio

        //una manera de sacar la información. pero aparece un archivo oculto, en el siguiente metodo se soluciona
        /*File file= new File(path);
        String[] nombres = file.list();
        for ( String item :nombres ){
            System.out.println(item);
        }*/

        // Para decirle que no muestre los archivos ocultos usamos el !item.isHidden()
        File file = new File(path);
        String[] nombres = file.list();
        File[] ficheros = file. listFiles();
        for (File item : ficheros){

            if (!item.isHidden()){
                System.out.println(item.getName());
            }
            // -> 2º Crear una subcarpeta en el directorio  llamado directorio y crear en ella un fichero
            // ->  Obterner todos los nombres de los ficheros del directorio llamado directorio y el subdirectorio
            if(item.isDirectory()){
                File[]subdirectorio = item.listFiles();
                for( File file1 : subdirectorio ){
                    System.out.println("\t" +file1.getName());
                }
            }
        }
    }

public void lecturaRecursiva(String path){

        File file= new File(path); // paso a n fichero logico y fisico
       // File[] ficheros = file.listFiles();
        for ( File item : file.listFiles()) {
            System.out.println(item.getName());

            if (item.isDirectory()){
                lecturaSubdirectorios(item);
            }

            // pregunto si es directorio
            //  saco todos los ficheros del directorio y los muesto usando la recursividad -> no sabemos cuantas veces
            //  tenemos que preguntar

            // RECURSIVIDAD -> EJECUCION QUE SE LLAMA A ELLA MISA, CON CUIDADO DE QUE TENGA UNA SALIDA.



        }



}
    private void lecturaSubdirectorios(File fichero ) {
        for (File file : fichero.listFiles()) {
            System.out.println("\t" + file.getName());
            if (file.isDirectory()) {
                lecturaSubdirectorios(file);
            }
        }

    }
}
