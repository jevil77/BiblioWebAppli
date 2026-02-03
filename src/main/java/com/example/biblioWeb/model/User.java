package com.example.biblioWeb.model;

public class User {

    String nom;
    String age;

    public User(String nom, String age){
        this.nom = nom;
        this.age = age;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
