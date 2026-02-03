package com.example.biblioWeb.model;

public class Livre {

    String ISBN;
    String titre;
    String auteur;
    String annee;


    public Livre(String ISBN, String titre, String auteur, String annee){
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getDescription(){
        return "ISBN: " + ISBN + "Titre: " + titre + "Auteur: " + auteur + "Année: " + annee;
    }


}
