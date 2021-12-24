package ejercicios7_8_9_DatosAvanzados;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[][] numeros = {
                {1,2,3,4,5,6},
                {15,25,35,45,55}
        };

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posicion de i: " + i);
            for(int j = 0; j < numeros[i].length; j++){
                System.out.println("Valor: " + numeros[i][j]);
            }
        }


    }
}
