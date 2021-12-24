package ejercicios7_8_9_DatosAvanzados;

import java.util.Vector;

public class Ejercicio3 {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Primer elemento");
        vector.add("Segundo elemento");
        vector.add("Tercer elemento");
        vector.add("Cuarto elemento");
        vector.add("Quinto elemento");
        vector.add("Sexto elemento");

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);

    }
}
