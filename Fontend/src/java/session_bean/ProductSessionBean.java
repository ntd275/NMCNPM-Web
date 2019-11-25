/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_bean;

/**
 *
 * @author ntd27
 */
import entity.SanPham;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductSessionBean extends AbstractSessionBean<SanPham> {

    @PersistenceContext(unitName = "FontendPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductSessionBean() {
        super(SanPham.class);
    }

    public List<SanPham> FindByCategory(String categoryname) {
        return em.createQuery(
                "SELECT c FROM SanPham c WHERE c.loai = :name")
                .setParameter("name", categoryname)
                .setMaxResults(10)
                .getResultList();
    }
}
