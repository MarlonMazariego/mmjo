
package ejb;

import Entity.Inventario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface InventarioFacadeLocal {
    
    void create(Inventario areas);

    List<Inventario> findAll();

    void edit(Inventario entity);

    void remove(Inventario entity);

    Inventario find(Object id);
}
