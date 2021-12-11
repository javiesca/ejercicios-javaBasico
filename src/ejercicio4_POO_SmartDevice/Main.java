package ejercicio4_POO_SmartDevice;

public class Main {

    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple", "iPhone", 1800, 900,
                "OLED", 7, true,24);

        System.out.println(iphone);


        System.out.println("");



        SmartWatch galaxy = new SmartWatch("Samsung", "Galaxy Watch", 600, 445, "LCD", true,
                false, true);

        System.out.println(galaxy);
    }

}
