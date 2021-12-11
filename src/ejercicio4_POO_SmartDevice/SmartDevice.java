package ejercicio4_POO_SmartDevice;

public class SmartDevice {

    private String marca;
    private String modelo;
    private int bateria;
    private double precio;
    private String tipoPantalla;


    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, int bateria, double precio, String tipoPantalla){

        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.precio = precio;
        this.tipoPantalla = tipoPantalla;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nBateria: " + bateria + "\nPrecio: " + precio
                + "\nTipo de pantalla: " + tipoPantalla;
    }
}
