package ejb;

import Entity.Persona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface PersonaFacadeLocal {

    void create(Persona areas);

    List<Persona> findAll();

    void edit(Persona entity);

    void remove(Persona entity);

    Persona find(Object id);
}
