
package ejb;

import Entity.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Claudia Pineda
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "conectionJv")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    /*
    @Override
    public int verificar(Usuario user) {
        int verificar =0;
        try {
            String sql = "SELECT e FROM Usuario e Where e.usuario=?1 AND e.clave=?2";
            Query query = em.createQuery(sql);
            query.setParameter(1, user.getUsuario());
            query.setParameter(2, user.getClave());
            user = (Usuario) query.getSingleResult();
            System.out.println("Antes "+user.getIdUsuario());
            if (user.getIdUsuario() >0) {
                System.out.println("Entro "+user.getIdUsuario());
                verificar++;
            }
        } catch (Exception e) {
        }
        return verificar;
    } */


}
