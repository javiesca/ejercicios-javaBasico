package ejercicio5_Interfaces_CocheCRUD;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);

    List<Coche> findall();

    void delete(Coche coche);
}
