package ejb;

import Entity.Bajas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface BajasFacadeLocal {

    void create(Bajas areas);

    List<Bajas> findAll();

    void edit(Bajas entity);

    void remove(Bajas entity);

    Bajas find(Object id);
}
