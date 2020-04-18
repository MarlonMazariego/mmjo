package ejb;

import Entity.Razon;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Owner
 */
@Local
public interface RazonFacadeLocal {

    void create(Razon areas);

    List<Razon> findAll();

    void edit(Razon entity);

    void remove(Razon entity);

    Razon find(Object id);
}
