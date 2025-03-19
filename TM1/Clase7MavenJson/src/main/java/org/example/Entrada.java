package org.example;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class Entrada {
    public static void main(String[] args) {
        //Clase 7 Primer Trimestre
/*File file = new File("src/main/resources/usuario.txt");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer lecturaCompleta = new StringBuffer();
            String linea = null;

            while(true){
                try {
                    if (!((linea= bufferedReader.readLine())!=null)) break;

                } catch (IOException e) {
                    System.out.println("error en la lectura");
                }
                lecturaCompleta.append(linea);
                }
            // System.out.println(lecturaCompleta.toString());
            JSONObject usuario = new JSONObject(lecturaCompleta.toString());

            Object usuarioObj = usuario.get("edad");
            String mombreUsuario = usuario.getString("nombre");
            JSONArray usuarioArray =usuario.getJSONArray("asignaturas");


            System.out.println(mombreUsuario);
            System.out.println(usuarioObj);
            System.out.println(usuarioArray);




                } catch (FileNotFoundException e) {
            System.out.println("error en el fichero");

        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("error en el cerrado");
            }
        }

    }*/
//Clase 8 Primer Trimestre
        PeticionJASON peticionJASON = new PeticionJASON();
        peticionJASON.procesarPeticion();


    }
}
