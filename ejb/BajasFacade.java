package ejb;

import Entity.Bajas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Claudia Pineda
 */
@Stateless
public class BajasFacade extends AbstractFacade<Bajas> implements BajasFacadeLocal {

    @PersistenceContext(unitName = "dbinventario")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BajasFacade() {
        super(Bajas.class);
    }
}
