package ejercicio5_Interfaces_CocheCRUD;

import java.util.List;

public class Main {

    //Creamos un objeto de la implemetación de CocheCRUD
    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        //Creamos 3 objetos de la clase Coche
        Coche coche1 = new Coche("Peugeot", "308", 110, 1.6, 2010);
        Coche coche2 = new Coche("Renault", "Clio", 150, 2000, 2005);
        Coche coche3 = new Coche("Volkswagen", "Golf", 105, 1.6, 2011);

        //Guardamos los 3 coches en nuestra base de datos
        cocheCrud.save(coche1);
        cocheCrud.save(coche2);
        cocheCrud.save(coche3);

        //Guardamos los coches de nuestra base de datos en una List miscoches y los imprimimos
        List<Coche> miscoches = cocheCrud.findall();
        System.out.println(miscoches);

        //Eliminamos el coche2 de nuestra base de datos e imprimimos de nuevo.
        cocheCrud.delete(coche2);
        System.out.println(miscoches);

    }


}
