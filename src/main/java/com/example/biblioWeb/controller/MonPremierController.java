package com.example.biblioWeb.controller;

import com.example.biblioWeb.model.Livre;
import com.example.biblioWeb.model.User;
import org.springframework.web.bind.annotation.*;

import java.awt.Color;


@RestController
public class MonPremierController {
    @GetMapping("/")
    public String helloWorld(){return "Hello World";}

    @GetMapping("/hello")
    public String helloSomeone(@RequestParam String nom){
        return "Hello " + nom ;
    }

    @GetMapping("/hello/{nom}")
    public String helloSomeone2(@PathVariable String nom){
        return "Hello " + nom;
    }


    @GetMapping("/color")
    public Color black(){return Color.magenta;}

    @GetMapping("/user")
    public User getUser(){
        User u = new User("Joe","10");
        return u;
   }

   @PostMapping("/user")
       public User postUser(@RequestBody User u){
        return u;
       }

   @GetMapping("/livres")
        public Livre getLivre(){
        Livre l = new Livre(" 2-226-04824-3", "Le silence des agneaux",  "Thomas Harris","1988");
        return l;
   }





}
