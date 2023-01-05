package com.example.gestionMateriel.Beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Materiel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private float prix;
    private String marque;
    private String numeroSerie;

    public Materiel() {
    }

    public Materiel(Long id, String nom, float prix, String marque, String numeroSerie) {
        super();
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.marque = marque;
        this.numeroSerie = numeroSerie;
    }

    public Materiel(String nom, float prix, String marque, String numeroSerie) {
        super();
        this.nom = nom;
        this.prix = prix;
        this.marque = marque;
        this.numeroSerie = numeroSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
