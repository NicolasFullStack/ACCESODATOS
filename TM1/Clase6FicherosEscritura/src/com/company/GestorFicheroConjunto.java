package com.company;

import java.io.*;
import java.util.Scanner;

public class GestorFicheroConjunto {

    public void cifrado(String path){

        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;

        System.out.println("Introduce el mensaje a guardar");
        String mensaje = scanner.nextLine();
        System.out.println("Indica la fase de cifrado del mensaje");
        int fase = scanner.nextInt();//Con esto le pedimos que introduzca el numero para multiplicar y codificar

        try {
            fileWriter = new FileWriter(file, false);
          //  fileWriter.write(mensaje); Con este me lo saca con letras

            for (int i= 0; i< mensaje.length(); i++){//Para cifrar las letras a numero asci y si lo multiplico lo encripto (mas o menos)
                char letra = mensaje.charAt(i);
                int codigo = (int)letra;
                fileWriter.write(String.valueOf(codigo*fase)+"\n");
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
    public void descifrado (String path){
        Scanner scanner = new Scanner(System.in);
        System.out.println("indica la fase de descifrado");
        int fase = scanner.nextInt();

        File file = new File(path);
        BufferedReader bufferdecodificador = null;
        try {
            bufferdecodificador= new BufferedReader(new FileReader(file));
            String lectura = null;

            while ((lectura = bufferdecodificador.readLine())!=null){
                //lectura
                int codigo = Integer.parseInt(lectura);
                System.out.print((char)(codigo/fase));


        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
