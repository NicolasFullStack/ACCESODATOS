package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestorFicheroConjunto {

    public void lecturaEscritura(String path){

        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;

        System.out.println("Introduce el mensaje a guardar");
        String mensaje = scanner.nextLine();

        try {
            fileWriter = new FileWriter(file, false);
          //  fileWriter.write(mensaje); Con este me lo saca con letras

            for (int i= 0; i< mensaje.length(); i++){//Para cifrar las letras a numero asci y si lo multiplico lo encripto (mas o menos)
                char letra = mensaje.charAt(i);
                int codigo = (int)letra;
                fileWriter.write(String.valueOf(codigo*90));
            }
        } catch (IOException e) {
            System.out.println("Error en los perm,osos");
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("fallo en el cerrado");
            }
        }


    }
}
