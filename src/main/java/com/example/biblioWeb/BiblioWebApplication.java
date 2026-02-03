package com.example.biblioWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BiblioWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioWebApplication.class, args);
	}

    public static class Livre {

        String titre;
        String annee_parution;

        public Livre(String titre, String annee_parution){
            this.titre = titre;
            this.annee_parution = annee_parution;
        }

        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getAnnee_parution() {
            return annee_parution;
        }

        public void setAnnee_parution(String annee_parution) {
            this.annee_parution = annee_parution;
        }





    }
}
