package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PeticionJASON {

    public void procesarPeticion() {

        //-> FILE -> FILE READER -> FILEREADER
        // -> URL - HTTPCONNECTION -> BUFFEREADER

        // CREAMOS UNA VARIALE URL  QUE ES CON QUIEN QUIERO CONECTARÇ
        String utlString = "https://dummyjson.com/products";

        // CREO UN OBJETO DEL TIPO URL QUE LE DOY COMO PARAMETRO LA ANTERIOR VARIABLE
        try {
            URL url = new URL(utlString);

            //Para abrir la url en un navegador necesitamos un objeto de tipo HTTPCONECTION

            HttpURLConnection conection = (HttpURLConnection) url.openConnection();

            //para interpretar-leer los datos de flujo entrante. La peticion esta abierta
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conection.getInputStream()));

            // creamos una lectura recurrente hacerlo siempre.
            String linea= null;
            StringBuffer stringBuffer = new StringBuffer();
            while ((linea = bufferedReader.readLine()) != null) {
                    stringBuffer.append(linea);
            }
            //convertimos el elemento en formato JSON para manejar la información desde el formato JSON, antes era texto plano
            JSONObject peticionProductos = new JSONObject(stringBuffer.toString());
            JSONArray listaProductos= peticionProductos.getJSONArray("products");
            JSONObject productoObjeto = listaProductos.getJSONObject(0);
            System.out.println(productoObjeto.getString("title"));
            //System.out.println(listaProductos);
            //System.out.println(peticionProductos);//Aqui lo que está devolviendo es un JSON y lo podemos tratar como tal

            //si quiero sacar un listado de todos los titulos, hacemos un for, además podemos sacar precio u otro campo
            for (Object item : listaProductos) {
                JSONObject producto = (JSONObject) item;
                System.out.println(producto.getString( "title"));
                System.out.println(producto.getDouble("price"));

                //Para ir recorriendo capas mas internas del objeto, si queremos sacar  "tags" que es array dentro del array
                //usamos un bucle que lo recorra
                JSONArray tags= producto.getJSONArray("tags");
                System.out.println("las categorias del array dentro del array tags son ");
                for (Object tag : tags) {
                    System.out.println(tag);

                }
            }




        } catch (MalformedURLException e) {
            System.out.println("no es una pagina web, intentelo de nuevo");
        } catch (IOException e) {
            System.out.println("error en la pagina no responde");
        }

    }
}
