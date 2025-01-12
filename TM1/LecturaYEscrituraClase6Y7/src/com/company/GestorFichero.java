package com.company;

//Clase 6 Explica lectura File y Excepciones (3maneras diferentes) hasta min 35
//

import java.io.*;

public class GestorFichero {

   public static void lecturaTextoPlano(String path){

       //Crear un File -> FileReader Todos los flujos de datos al terminar hay que cerrar los flujos de datos.

       File file = new File(path);
       //Lectura de linea a linea, no como Filereader que es caracter a caracter
       BufferedReader bufferedReader= null; //a Nullo porque despues tenermos que cerrar el flujo de datos

       FileReader fileReader= null;
        //Si existe y ademas es un fichero
       // tenemos que tratar la excepción
       if (file.exists() && file.isFile()){
           try {
               fileReader = new FileReader(file);
               //Para poder hacer una lectura, lo hace en int -> unicode ASCI
               int lectura1 = fileReader.read();
               System.out.println((char)lectura1);//para leer una vez y hacer comprobaciones, sino usamos un while
               //mientras exista el numero haz la lectura y muestrala
               int lecturaCompleta= 0;
               while ((lecturaCompleta = fileReader.read())!=-1){
                   //imprime siempre que haya numero, para ello le decimow -1 para que cuando no este pare
                   //Lectura de izquierda a derecha secuencial caracter a caracter
                   System.out.print((char) lecturaCompleta);
               }
           } catch (FileNotFoundException e) {
               System.out.println("Fallo en la lectura del fichero");
               System.out.println(e.getMessage());
           } catch (IOException e) {
               System.out.println("fallo en la lectura de fileRead.read");
           } finally {
               // FINALLY Siempre se ejecuta
               try {
                   fileReader.close();
               } catch (IOException e) {
                   System.out.println("error al cerrar el flujo de datos Fichero IOEXception");
               } catch (NullPointerException e) {
                   System.out.println("error al cerrar el flujo de datos Fichero Nulo");
               }catch (Exception e){
                   System.out.println("catch (Exception) es la excepcion universal donde entran todas las demas");
               }
           }
       }


   }
}
