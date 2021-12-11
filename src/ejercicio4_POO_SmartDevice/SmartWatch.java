package ejercicio4_POO_SmartDevice;

public class SmartWatch extends SmartDevice{

    private boolean sumergible;
    private boolean redMovil;
    private boolean pulsometro;
    SmartDevice smartDevice;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, int bateria, double precio, String tipoPantalla,
                      boolean sumergible, boolean redMovil, boolean pulsometro) {

        super(marca, modelo, bateria, precio, tipoPantalla);
        this.sumergible = sumergible;
        this.redMovil = redMovil;
        this.pulsometro = pulsometro;
    }


    public String isSumergible() {
        String sumerg;
        if(sumergible){
            sumerg = "SI";
        }else{
            sumerg = "NO";
        }
        return sumerg;
    }

    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;
    }

    public String isRedMovil() {
        String redmovil;
        if(redMovil){
            redmovil = "SI";
        }else{
            redmovil = "NO";
        }
        return redmovil;
    }

    public void setRedMovil(boolean redMovil) {
        this.redMovil = redMovil;
    }

    public String isPulsometro() {
        String pulso;
        if(pulsometro){
            pulso = "SI";
        }else{
            pulso = "NO";
        }
        return pulso;
    }

    public void setPulsometro(boolean pulsometro) {
        this.pulsometro = pulsometro;
    }

    public SmartDevice getSmartDevice() {
        return smartDevice;
    }

    public void setSmartDevice(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }

    public String toString() {

        return super.toString() + "\nSumergible: " + isSumergible() + "\nConexión movil:" + isRedMovil()
                + "\nPulsometro: " + isPulsometro();
    }
}
