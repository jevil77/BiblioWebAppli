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

    public static class Auteur {
        String nom;
        String date_naissance;
        String date_mort;

        public Auteur(String nom, String date_naissance, String date_mort){
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

        public String getDescription(){
            return "Nom: " + nom + "Date de naissance: " + date_naissance + "Date de décès: " + date_mort;
        }
    }
}
