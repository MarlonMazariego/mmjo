package ejb;

import Entity.Articulo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface ArticuloFacadeLocal {

    void create(Articulo areas);

    List<Articulo> findAll();

    void edit(Articulo entity);

    void remove(Articulo entity);

    Articulo find(Object id);
}
