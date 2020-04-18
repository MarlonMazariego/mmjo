package ejb;

import Entity.TipoRegistro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Claudia Pineda
 */
@Local
public interface TipoRegistroFacadeLocal {

    void create(TipoRegistro areas);

    List<TipoRegistro> findAll();

    void edit(TipoRegistro entity);

    void remove(TipoRegistro entity);

    TipoRegistro find(Object id);
}
