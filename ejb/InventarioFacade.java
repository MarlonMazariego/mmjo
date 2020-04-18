package ejb;

import Entity.Inventario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Claudia Pineda
 */
@Stateless
public class InventarioFacade extends AbstractFacade<Inventario> implements InventarioFacadeLocal{

    @PersistenceContext(unitName = "dbinventario")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventarioFacade() {
        super(Inventario.class);
    }
}
