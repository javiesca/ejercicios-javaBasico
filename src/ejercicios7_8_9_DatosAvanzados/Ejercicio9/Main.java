package ejercicios7_8_9_DatosAvanzados.Ejercicio9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //ArrayList donde guardaremos OBJETOS de la clase Agenda
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Agenda> miAgenda = new ArrayList<>();

    public static void main(String[] args) {

        // HASHMAP para definir usuarios y contraseñas para agregar indices a la agenda
        HashMap<String, String> acceso = new HashMap<String, String>();

        acceso.put("Javi", "111111");
        acceso.put("Elena", "222222");

        System.out.println("Introduce usuario: ");
        String usuario = scanner.next();
        System.out.println("Introduce contraseña: ");
        String password = scanner.next();

        // Recorremos el Mapa y comprobamos credenciales
        for (Map.Entry get : acceso.entrySet()) {

            if (usuario.equals(get.getKey()) && password.equals(get.getValue())) {

                // menu para agregar entradas a la agenda
                int menu = 0;
                System.out.println("Usuario y contraseña correctas. Bienvenido.");
                System.out.println("Pulsa 1 para agregar números a la agenda \nPulsa 0 para salir: )");
                menu = scanner.nextInt();
                if (menu != 0) {
                    while (menu != 0) {

                        miAgenda.add(new Agenda());
                        System.out.println("Pulsa 1 para agregar números a la agenda \nPulsa 0 para salir: )");
                        menu = scanner.nextInt();

                    }

                    // Grabamos los datos del ArrayList en un archivo TXT con la clase PrintStream
                    try {
                        PrintStream graba = new PrintStream("Agenda.txt");
                        byte[] data = miAgenda.toString().getBytes();
                        try {
                            graba.write(data);
                            graba.close();
                        }catch (IOException e){
                            System.out.println("ERROR!" + e.getMessage());
                        }
                    }catch (FileNotFoundException e){
                        System.out.println("ERROR!" + e.getMessage());
                    }

                    // Recuperamos los datos de un artivo TXT
                    try {
                        InputStream recupera = new FileInputStream("Agenda.txt");
                        BufferedReader br = new BufferedReader(new InputStreamReader(recupera));
                        try {
                            int datos = br.read();
                            while(datos != -1) {

                                System.out.print((char)datos);
                                datos = br.read();
                            }
                        }catch(IOException e){
                            System.out.println("ERROR!" + e.getMessage());
                        }

                    }catch (FileNotFoundException e){
                        System.out.println("ERROR!" + e.getMessage());
                    }
                }

            } else {
                System.out.println("Contraseña Incorrecta");

            }


        }



    }
}








