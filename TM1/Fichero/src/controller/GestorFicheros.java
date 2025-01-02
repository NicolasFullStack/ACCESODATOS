package controller;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class GestorFicheros {

  /*  public void lecturaDirectoios(String path){
        // Me creo un File logico que apunta a un File fisico que exista
        // -> 1º Obtener todos los nombres de los ficheros del directorio llamado directorio

        //una manera de sacar la información. pero aparece un archivo oculto, en el siguiente metodo se soluciona
        /*File file= new File(path);
        String[] nombres = file.list();
        for ( String item :nombres ){
            System.out.println(item);
        }

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

    }*/

    public void lecturaTextoPlano (String path){
        //File -> FILEREADER -> BUFFEREDREADER -<

        File file = new File(path); //Crea el fichero logigo y si es fisico podemos trabajar con el
        //FileReader filereader = null ;//Creamos el objeto de tipo File i.o
        BufferedReader bufferedReader= null;

        //Preguntamos si existe y es un fichero
        if(file.exists() && file.isFile()){
            //Trato la excepcion aqui

            try {
               // filereader = new FileReader(file);// inicializamos la lectura de fichero
                bufferedReader = new BufferedReader( new FileReader(file));
                System.out.println(bufferedReader.readLine());

                String lectura =null;
                while (lectura = bufferedReader.readLine() !=null){
                    System.out.println(lectura);
                }

                // mientras exista el numero haz la lectura e imprime LECTURA CON FILEREADER
                // int lectura =0;
                /*while ((lectura = filereader.read()) != -1 ){
                    // imprime los numeros
                    System.out.print((char) lectura);
                }*/




                /*int lectura = filereader.read();// int -> Unicode ASCI
                System.out.println((char) lectura);*/

            }catch (FileNotFoundException e){
                System.out.println("Fallo de lectura");
                System.out.println(e.getMessage());

            } catch (IOException e) {
                System.out.println("Error en la escritura, fallo de permisos");// Este es el tratamiento de la lectura
            } finally {
                //Se ejecuta siempre .Ha de ir siempre, Todos los flujos de datos se tienen que cerrar siempre
                try {
                    BufferedReader.close();//NULLPOINTEREXCEPTION
                }catch (IOException e){
                    System.out.println("Error en el cerrado del flujo");
                    System.out.println(e.getMessage());
                }catch (NullPointerException e){
                    System.out.println("Error en el cerrado por ser nulo");
                }
            }
        }

    }
}
