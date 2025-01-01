import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        //File -> es un fichero logico apunta a un fichero fisico

       /*fichero logico (fichero no existe) apunta a algo que no esta pero que creamos ahora
        File ficheroSinPuntero = new File("/Users/nicolas/Documents/GitHub/ACCESODATOS/TM1/ejemplo.md");
        System.out.println(ficheroSinPuntero.getName());
        System.out.println(ficheroSinPuntero.getParent());
        System.out.println(ficheroSinPuntero.length());
        System.out.println(ficheroSinPuntero.exists());*/

        //ficherofisico (fichero si existe) apunta a algo que no esta pero que creamos ahora ruta absoluta
        File ficheroConPunteroFisicoLogico = new File("src/resources/directorio/ejemplo.md");
        System.out.println(ficheroConPunteroFisicoLogico.getName());
        System.out.println(ficheroConPunteroFisicoLogico.getParent());
        System.out.println(ficheroConPunteroFisicoLogico.length());
        System.out.println(ficheroConPunteroFisicoLogico.exists());
        System.out.println(ficheroConPunteroFisicoLogico.isDirectory());


        //File[]-> devuelve todos los FICHEROS que estan dentro del directorio con un array
        ficheroConPunteroFisicoLogico.listFiles();

        // String [] -> devuelve todas las rutas de los FICHEROS  que estan dentro del directorio
        ficheroConPunteroFisicoLogico.list();

        // -> 1º Obtener todos los nombres de los ficheros del directorio llamado directorio
        // -> 2º Crear una subcarpeta en el directorio  llamado directorio y crear en ella un fichero
        // ->  Obterner todos los nombres de los ficheros del directorio llamado directorio y el subdirectorio
        // -> 3º Listar el nombre de todos los ficheros del SISTEMA( c:/ o /Users)

        // RECURSIVIDAD
        



        /* Para crear un fichero si no existe. Ademas nos sugiere controlar el error
        if(!ficheroConPunteroFisicoLogico.exists()){
            try {
                ficheroConPunteroFisicoLogico.createNewFile();
            } catch (IOException e) {
                System.out.println("fallo en la creacion del fichero");
            }
        }*/


    }
}
