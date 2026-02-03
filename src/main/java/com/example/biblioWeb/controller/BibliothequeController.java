package com.example.biblioWeb.controller;

import com.example.biblioWeb.BiblioWebApplication;
import com.example.biblioWeb.model.Auteur;
import com.example.biblioWeb.model.Livre;
import com.example.biblioWeb.model.Membre;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class BibliothequeController {

    private List<Auteur> auteurs = new ArrayList<>();
    private List<Livre> livres = new ArrayList<>();
    private List<Membre> membres = new ArrayList<>();

    public BibliothequeController() {
        livres.add(new Livre("123456", "Hannibal", "TH","1990"));
        livres.add(new Livre("654321","Le silence des agneaux","TH","1988"));
        livres.add(new Livre("555556", "Le signal","MC","2018"));
        livres.add(new Livre("9782355841170 ","Gone girl ","Gillian Flynn ","2012 "));

        auteurs.add(new Auteur("Thomas Harris", "01/01/1960",""));
        auteurs.add(new Auteur("Maxime Chattam","25/06/1977",""));

        membres.add(new Membre("Jérôme","25/06/2023"));
        membres.add(new Membre("Nathalie","10/06/2023"));



    }

    public Livre getPremierLivre(){
        return this.livres.getFirst();
    }

    @GetMapping("/livre")
    public List<Livre> getLivres(){
        return this.livres;
    }


    @GetMapping("/livres/{id}")
    public Livre getParId(@PathVariable
    int id){
        return this.livres.get(id);
    }

    public List<Livre> getPartitre(@PathVariable String titreRecherche) {
        titreRecherche = titreRecherche.toLowerCase();
        List<Livre> result = new ArrayList<>();

        for (Livre l : this.livres) {
            if (l.getTitre().toLowerCase().contains(titreRecherche)) {
                result.add(l);
            }
        }
        return result;
    }

    @GetMapping("/auteur")
    public List<Auteur> getAuteur() {return this.auteurs;}

    @GetMapping("/auteur/{id}")
    public Auteur getAuteurParID(@PathVariable int id){
        return this.auteurs.get(id);
    }

    @GetMapping("/auteurs/nom/{nomRecherche}")
    public List<Auteur> getAuteurParNom(@PathVariable String nomRecherche){
        nomRecherche = nomRecherche.toLowerCase(Locale.ROOT);
        List<Auteur> result = new ArrayList<>();
        for (Auteur a : this.auteurs){
            if(a.getNom().toLowerCase().contains(nomRecherche)){
                result.add(a);
            }
        }
        return result;
    }


    @GetMapping("/membres")
    public List<Membre> getMembre(){return this.membres;}








}



