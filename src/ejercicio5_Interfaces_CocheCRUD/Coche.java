package ejercicio5_Interfaces_CocheCRUD;

public class Coche {

    // 1.Atributos

    private String marca;
    private String modelo;
    private int caballos;
    private double cilindrada;
    private int year;

    // 2. Constrauctores

    public Coche(){

    }

    public Coche(String marca, String modelo, int caballos, double cilindrada, int year){
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.cilindrada = cilindrada;
        this.year = year;

    }

    // 3. Metodos

        //getter & setter
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getCaballos(){
        return caballos;
    }

    public void setCaballos(int caballos){
        this.caballos = caballos;
    }

    public double getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

        //toString

    public String toString() {
        return "\n\nDATOS DEL COCHE\n---------------" + "\nMarca: " + marca + "\nModelo: " + modelo +
                "\nCaballos: " + caballos + "\nCilindrada: " + cilindrada + "\nAño: " + year;
    }




}
