package tn.iteam.dao;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

//JAva bean
// Class Pojo : 1.  private fields 2. public getters and setters 3. default constructor 4. implements Serializable (Object -->Binaire)
@Entity
@Table(name = "Produits")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reference;
    private String designation;
    private double prix;
    private int quantite;

    public Produit() {
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
