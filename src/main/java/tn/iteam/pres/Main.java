package tn.iteam.pres;

import tn.iteam.dao.IProduitDao;
import tn.iteam.dao.Produit;
import tn.iteam.metier.ProduitImplements;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UP_CAT");
        ProduitImplements metier = new ProduitImplements() ;
        System.out.println("Insertion dans la table produits : ");
        Produit produit = new Produit();
        produit.setDesignation("Ordinateur");
        produit.setPrix(2800);
        produit.setQuantite(50) ;
       // metier.save(produit);
        List <Produit> produits =new ArrayList();
        produits = metier.findAll() ;
        System.out.println(produits.get(1).getDesignation());
    }
}
