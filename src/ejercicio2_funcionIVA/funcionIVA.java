package ejercicio2_funcionIVA;

public class funcionIVA {

    public static void main(String[] args) {

        System.out.println(precioIVA(100));

    }

    public static double precioIVA(double precio){

        return precio * 0.21 + precio;
    }
}
