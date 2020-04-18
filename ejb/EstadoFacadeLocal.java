package ejb;

import Entity.Estado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface EstadoFacadeLocal {

    void create(Estado areas);

    List<Estado> findAll();

    void edit(Estado entity);

    void remove(Estado entity);

    Estado find(Object id);
}
