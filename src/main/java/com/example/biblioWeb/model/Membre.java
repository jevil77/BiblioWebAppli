package com.example.biblioWeb.model;

public class Membre {
    String nom;
    String dateAbonnement;

    public Membre(String nom, String dateAbonnement){
        this.nom = nom;
        this.dateAbonnement = dateAbonnement;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateAbonnement() {
        return dateAbonnement;
    }

    public void setDateAbonnement(String dateAbonnement) {
        this.dateAbonnement = dateAbonnement;
    }
}



