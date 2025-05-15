package org.example.Exoannuaire;

public class MainAnnuaireE {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();

        annuaire.addEntrepriseToAnnuaire("Oui",45341534,"Lille","www.bidule");
        annuaire.addEntrepriseToAnnuaire("Non",45999534,"Roubaix","www.truc");
        annuaire.addEntrepriseToAnnuaire("Truc",4588834,"Tourcoing","www.machin");
        annuaire.addEntrepriseToAnnuaire("Machin",4577734,"Dunkerque","bidule");

        annuaire.showAllNameEntreprise();
    }
}
