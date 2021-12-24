package ejercicios7_8_9_DatosAvanzados;

import java.util.ArrayList;

public class Ejercicio6 {

    public static void main(String[] args) {

        //creamos un ArrayList de enteros
        ArrayList<Integer> miArray = new ArrayList<>();

        //recorremos el ArrayList y lo rellenamos con los elementos del 1 al 10
        for(int i = 1; i <= 10; i++){
            miArray.add(i);
        }

        //recorremos el ArrayList y eliminamos los valores pares
        for(int i = 0; i < miArray.size(); i++){
            if(miArray.get(i) % 2 == 0){
                miArray.remove(i);
            }
        }

        //recorremos el ArrayList para mostrar el resultado final
        for(int i = 0; i <miArray.size(); i++){
            System.out.print(miArray.get(i) + " ");
        }

    }

}
