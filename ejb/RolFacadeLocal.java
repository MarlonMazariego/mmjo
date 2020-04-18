
package ejb;

import Entity.Rol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface RolFacadeLocal {

    void create(Rol areas);

    List<Rol> findAll();

    void edit(Rol entity);

    void remove(Rol entity);

    Rol find(Object id);
}
