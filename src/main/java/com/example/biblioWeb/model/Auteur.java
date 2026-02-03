package com.example.biblioWeb.model;

public class Auteur {
    String nom;
    String date_naissance;
    String date_mort;

    public Auteur(String nom, String date_naissance, String date_mort) {
        this.nom = nom;
        this.date_naissance = date_naissance;
        this.date_mort = date_mort;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getDate_mort() {
        return date_mort;
    }

    public void setDate_mort(String date_mort) {
        this.date_mort = date_mort;
    }

}
