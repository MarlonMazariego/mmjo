
package ejb;

import Entity.Categoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface CategoriaFacadeLocal {

    void create(Categoria areas);

    List<Categoria> findAll();

    void edit(Categoria entity);

    void remove(Categoria entity);

    Categoria find(Object id);
}
