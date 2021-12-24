package ejercicios7_8_9_DatosAvanzados;

import java.io.*;

public class Ejercicio8 {

    public static void main(String[] args) {

        try {
            copiaFichero(new FileInputStream("hola.txt"), new PrintStream("copia.txt"));
        }catch (Exception e) {

        }
    }

    public static void copiaFichero(InputStream a, PrintStream b) throws FileNotFoundException, IOException {

        try {
            InputStream leeFichero = new FileInputStream("hola.txt");

            try {
                byte[] datos = leeFichero.readAllBytes();
                leeFichero.close();

                PrintStream copiaFichero = new PrintStream("copia.txt");
                copiaFichero.write(datos);
                copiaFichero.close();


            } catch (IOException e) {
                System.out.println("Error leyendo fichero" + e.getMessage());
                throw new IOException();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado" + e.getMessage());
            throw new FileNotFoundException();
        }

    }
}