package ejercicios7_8_9_DatosAvanzados;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CadenaAlReves {

    public static void main(String[] args) {

        System.out.println(reverse("Hola Mundo"));

    }


    public static String reverse(String texto){

        char[] reves = new char[texto.length()];

        int contador = 0;

        for(int i = texto.length()-1; i >= 0; i--) {

            reves[contador] = texto.charAt(i);
            contador++;

            }

        return String.valueOf(reves);
    }
}
