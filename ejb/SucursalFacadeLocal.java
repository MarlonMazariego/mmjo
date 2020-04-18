package ejb;

import Entity.Sucursal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface SucursalFacadeLocal {

    void create(Sucursal areas);

    List<Sucursal> findAll();

    void edit(Sucursal entity);

    void remove(Sucursal entity);

    Sucursal find(Object id);
}
