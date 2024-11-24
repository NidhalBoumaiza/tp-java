package tn.iteam.metier;

import tn.iteam.dao.IProduitDao;
import tn.iteam.dao.Produit;

import javax.persistence.*;
import java.util.List;

public class ProduitImplements implements IProduitDao{
    private EntityManagerFactory entityManagerFactory ;
    private EntityManager entityManager ;
    public ProduitImplements() {
        entityManagerFactory = Persistence.createEntityManagerFactory("UP_CAT");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void save(Produit produit) {
        EntityTransaction transaction = entityManager.getTransaction() ;

        transaction.begin();
        try{
            entityManager.persist(produit);
            transaction.commit();
        }catch (Exception e){

        }
    }

    @Override
    public List<Produit> findAll() {
        Query query = entityManager.createQuery("select p from Produit p") ;
        return query.getResultList();
    }

    @Override
    public List<Produit> findByDesignation(String mc) {
        return null;
    }

    @Override
    public Produit findById(Long id) {
        return null;
    }

    @Override
    public void update(Produit produit) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
