package ejb;

import Entity.Registro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface RegistroFacadeLocal {

    void create(Registro areas);

    List<Registro> findAll();

    void edit(Registro entity);

    void remove(Registro entity);

    Registro find(Object id);
}
