package org.example.Exoannuaire;

import java.util.ArrayList;
import java.util.List;

public class Annuaire {

    private List<Entreprise> entreprises = new ArrayList<>();

    // ou bien public Annuaire()
//    {
//     entreprises = new ArrayList<>();
//    }

    public void addEntrepriseToAnnuaire(String nom, long siret, String adresse, String site){
        if(site.startsWith("www")){
        Entreprise entreprise = new Entreprise(nom,siret,adresse,site);
        this.entreprises.add(entreprise);
    }}

    public void showAllNameEntreprise(){
        for(int i = 0; i < this.entreprises.size(); i++ ){
            System.out.println(i+") "+this.entreprises.get(i).getNom());
        }
    }

    public void showDetailsEntreprise(int indice){
        if(indice < this.entreprises.size())
        System.out.println(this.entreprises.get(indice));
    }

}
