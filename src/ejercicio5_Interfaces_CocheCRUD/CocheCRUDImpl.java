package ejercicio5_Interfaces_CocheCRUD;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    //Creamos un ArrayList donde guardaremos todos los objetos de la clase coche
    private List<Coche> coches = new ArrayList<Coche>();

    //metodo para guardar coches en nuestra "base de datos"
    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    //metodo para imprimir todos los coches de nuestra "base de datos"
    @Override
    public List<Coche> findall() {
        return coches;
    }

    //metodo para eliminar coches de nuestra "base de datos"
    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
    }
}
