package ejercicios7_8_9_DatosAvanzados.Ejercicio9;

import java.util.Scanner;

public class Agenda {

    //1. ATRIBUTOS
    String nombre;
    int edad;
    int telefono;

    //2.CONSTRUCTORES
    public Agenda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        this.nombre = scanner.next();
        System.out.println("Introduce edad: ");
        this.edad = scanner.nextInt();
        System.out.println("Introduce telefono: ");
        this.telefono = scanner.nextInt();
    }



    //3.METODOS



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
