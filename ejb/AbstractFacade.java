
package ejb;

/**
 *
 * @author Claudia Pineda
 */
import java.util.List;
import javax.persistence.EntityManager;


public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);

    }
    
    public  void  remove(T entity){
    getEntityManager().remove(getEntityManager().merge(entity));
    }
    
    public T find(Object id){
        return getEntityManager().find(entityClass, id);
    }
    public int count(){
    return 0;
    }
    public List<T> findRange(int[] range){
    List<T> lista = null;
        return  lista;
    }
}
