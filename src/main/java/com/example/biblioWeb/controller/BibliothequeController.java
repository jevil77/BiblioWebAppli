package com.example.biblioWeb.controller;

import com.example.biblioWeb.BiblioWebApplication;
import com.example.biblioWeb.model.Livre;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BibliothequeController {

    private List<Livre.Auteur> auteurs = new ArrayList<>();
    private List<Livre> livres = new ArrayList<>();

    public BibliothequeController() {
        livres.add(new Livre("123456", "Hannibal", "TH","1990"));
        livres.add(new Livre("654321","Le silence des agneaux","TH","1988"));
        livres.add(new Livre("555556", "Le signal","MC","2018"));
        livres.add(new Livre("9782355841170 ","Gone girl ","Gillian Flynn ","2012 "));

    }

    public Livre getPremierLivre(){
        return this.livres.getFirst();
    }

    @GetMapping("/livre")
    public List<Livre> getLivres(){
        return livres;
    }


    @GetMapping("/livres/{id}")
    public Livre getParId(@PathVariable
    int id){
        return this.livres.get(id);
    }



}



