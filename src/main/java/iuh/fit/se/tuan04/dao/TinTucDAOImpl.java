package iuh.fit.se.tuan04.dao;

import iuh.fit.se.tuan04.model.TinTuc;
import jakarta.persistence.EntityManager;

import java.util.List;

public class TinTucDAOImpl implements TinTucDAO{
    private EntityManager em;

    public TinTucDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<TinTuc> findAll() {
        return em.createQuery("SELECT t from TinTuc t", TinTuc.class).getResultList();
    }

    @Override
    public void insert(TinTuc tintuc) {
        em.getTransaction().begin();
        em.persist(tintuc);
        em.getTransaction().commit();
    }

    @Override
    public void delete(int maTT) {
        em.getTransaction().begin();
        TinTuc tinTuc = em.find(TinTuc.class, maTT);
        if(tinTuc!=null) em.remove(tinTuc);
        em.getTransaction().commit();
    }
}
