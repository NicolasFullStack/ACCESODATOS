package com.company;

import java.io.*;

public class GestorFicheroBufferyPrintReader {
    public static void lecturaTextoPlano2(String path) {


        //Crear un File (SIEMPRE)
        File file = new File(path);
        //Lectura de linea a linea, no como Filereader que es caracter a caracter
        BufferedReader bufferedReader = null; //a Nullo porque despues tenermos que cerrar el flujo de datos


        //Si existe y ademas es un fichero
        // tenemos que tratar la excepción
        if (file.exists() && file.isFile()) try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura= null;
            //Una manera de realizar la lectura
            // StringBuffer lecturaCompleta= new StringBuffer();
            StringBuilder lecturaCompleta = new StringBuilder();//Funciona como el StringBuffer
            //StringBuilder comunica entre ellos para decir quien tiene el objeto ocupado ocupa mucho tamaño
            while ((lectura = bufferedReader.readLine())!=null){
               // lecturaCompleta.append(lectura);
                lecturaCompleta.append("\n");
            }
            System.out.println(lecturaCompleta.toString());//lectura que no es recurrente

        } catch (FileNotFoundException e) {
            System.out.println("Fallo en la lectura del fichero");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("fallo en la lectura de fileRead.read");
        } finally {
            // FINALLY Siempre se ejecuta
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("error al cerrar el flujo de datos Fichero IOEXception");
            } catch (NullPointerException e) {
                System.out.println("error al cerrar el flujo de datos Fichero Nulo");
            } catch (Exception e) {
                System.out.println("catch (Exception) es la excepcion universal donde entran todas las demas");
            }
        }
    }
}

