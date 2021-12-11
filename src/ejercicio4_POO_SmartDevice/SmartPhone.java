package ejercicio4_POO_SmartDevice;

public class SmartPhone extends SmartDevice {

    private int pulgadasPantalla;
    private boolean conexion5g;
    private float mpxCamara;
    SmartDevice smartDevice;


    public SmartPhone() {

    }

    public SmartPhone(String marca, String modelo, int bateria, double precio, String tipoPantalla,
    int pulgadasPantalla, boolean conexion5g, float mpxCamara) {

        super(marca, modelo, bateria, precio, tipoPantalla);
        this.pulgadasPantalla = pulgadasPantalla;
        this.conexion5g = conexion5g;
        this.mpxCamara = mpxCamara;

    }

    public int getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(int pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public String isConexion5g() {
        String tipoConexion;
        if (conexion5g) {
            tipoConexion = "SI";
        } else {
            tipoConexion = "NO";
        }
        return tipoConexion;
    }

    public void setConexion5g(boolean conexion5g) {
        this.conexion5g = conexion5g;
    }

    public float getMpxCamara() {
        return mpxCamara;
    }

    public void setMpxCamara(float mpxCamara) {
        this.mpxCamara = mpxCamara;
    }

    public String toString() {
        return super.toString() + "\nPulgadas: " + pulgadasPantalla + "\nConexión 5G: " + isConexion5g() + "\nCamara MPX: " + mpxCamara;

    }
}

