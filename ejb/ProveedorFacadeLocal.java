package ejb;

import Entity.Proveedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface ProveedorFacadeLocal {

    void create(Proveedor areas);

    List<Proveedor> findAll();

    void edit(Proveedor entity);

    void remove(Proveedor entity);

    Proveedor find(Object id);
}
