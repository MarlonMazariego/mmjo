package ejb;

import Entity.TipoRegistro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Claudia Pineda
 */
@Stateless
public class TipoRegistroFacade extends AbstractFacade<TipoRegistro> implements TipoRegistroFacadeLocal {

    @PersistenceContext(unitName = "dbinventario")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoRegistroFacade() {
        super(TipoRegistro.class);
    }
}
