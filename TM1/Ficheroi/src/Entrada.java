import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {

        // codigo de la 3Clase 1 Trimestre
        // FILE ->  Fichero logico -> fisico

        File fichesoSinPuntero = new File("src/resources/Directorio/EjemploCreadoNuevo.md");
        /*System.out.println(fichesoSinPuntero.getName());
        System.out.println(fichesoSinPuntero.getParent());
        System.out.println(fichesoSinPuntero.length());
        System.out.println(fichesoSinPuntero.exists()*/;

        //Para saber lo que hay dentro del fichero

        // File [] -> Devuelve todos los FICHEROS que estan dentro del directorio
        System.out.println("DEVOLUCION DE FICHEROS ARRAY"+fichesoSinPuntero.listFiles());

        // File [] -> Devuelve todas las rutas de los ficheros que estan dentro del directorio

        System.out.println(fichesoSinPuntero.list());

        //Para comprobar si es un directorio
        File directorio2 = new File("src/resources/Directorio");
        System.out.println(" 1 Es un directorio " + directorio2.isDirectory());
        System.out.println(" Devuelveme los ficheros que tengas " + directorio2.listFiles());
        System.out.println(fichesoSinPuntero.isFile());

        //COMO CREAR UN FICHERO EN CASO DE QUE NO EXISTA, USAMOS LA NEGACIÓN, ""SI NO EXISTE ! "" CREALO "createNewFile()"
        if(!fichesoSinPuntero.exists()) {
            try {
                System.out.println("El fichero aun no se ha creado " +fichesoSinPuntero.exists());
                //Para crear el fihero si no existe
                fichesoSinPuntero.createNewFile();
                System.out.println("El fichero YA se ha creado " +fichesoSinPuntero.exists());
            } catch (IOException e) {
                System.out.println("fallo en la creacion del fichero");;
            }
        }else {
            System.out.println("LO SIENTO PERO EL FICHERO YA EXISTE Y NO LO PUEDO DUPLICAR");
        }

    }
}
