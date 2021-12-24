package ejercicios7_8_9_DatosAvanzados;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5 {

    public static void main(String[] args) {

        //creamos ArrayList de 4 elementos
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Teclado");
        lista.add("Ratón");
        lista.add("Monitor");
        lista.add("Altavoces");

        //mostramos los elementos del ArrayList
        System.out.println("ArrayList: " + lista);

        //creamos una LindkedList y le damos como parametro el ArrayLista para que copie los elementos.
        LinkedList<String> lista2 = new LinkedList<>(lista);

        //mostramos los elementos del LindkedList
        System.out.println("LindkedList: " + lista2);

        //recorremos ArrayList
        for(String a : lista){
            System.out.println(a);
        }
        
        //recorremos LindkedList
        for(String a : lista2){
            System.out.println(a);
        }






    }
}
