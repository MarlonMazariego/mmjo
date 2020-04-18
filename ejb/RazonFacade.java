package ejb;

import Entity.Razon;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Owner
 */
@Stateless
public class RazonFacade extends AbstractFacade<Razon> implements RazonFacadeLocal {

    @PersistenceContext(unitName = "dbinventario")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RazonFacade() {
        super(Razon.class);
    }
}
