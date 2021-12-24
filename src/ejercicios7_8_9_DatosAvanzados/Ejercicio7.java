package ejercicios7_8_9_DatosAvanzados;

import java.io.IOException;

public class Ejercicio7 {

    public static void main(String[] args) {

        try {
            int resultado = dividir(5, 0);
            System.out.println(resultado);
        }catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }

    }

    public static int dividir (int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
        }catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }

}
