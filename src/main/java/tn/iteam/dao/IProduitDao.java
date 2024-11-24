package tn.iteam.dao;

import java.util.List;

public interface IProduitDao {
    public void save(Produit produit);
    public List <Produit> findAll();

    public List <Produit> findByDesignation(String mc);

    public Produit findById(Long id);

    public void update(Produit produit);

    public void deleteById(Long id);


}
