
package ejb;

import Entity.Articulo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Claudia Pineda
 */
@Stateless
public class ArticuloFacade extends AbstractFacade<Articulo> implements ArticuloFacadeLocal{
    @PersistenceContext(unitName = "dbinventario")
    private  EntityManager  em;
    
    @Override
    protected  EntityManager getEntityManager(){
    return em;
    }
    
    public  ArticuloFacade(){
        super(Articulo.class);
    }
}
