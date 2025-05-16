package org.example.Exoannuaire;

import java.util.Scanner;

public class IHMconsole {
    private Scanner scanner;
    private Annuaire annuaire;

    public IHMconsole(){
        this.scanner = new Scanner(System.in);
        this.annuaire = new Annuaire();
    }

    public void afficheMenu(){
        System.out.println("""
                #### Menu annuaire entreprise ####
                1) ajouter une entreprise
                2) voir toutes les entreprises (nom uniquement)
                3)voir le détail d'une entreprise
                0) pour quitter le programme
                """);
    }

    public void startMenu(){
        byte choix = 99;
        while(choix != 0){
            afficheMenu();
            choix = this.scanner.nextByte();
            scanner.nextLine(); // consommer la touche entree apres un int/byte/double

            switch (choix){
                case 1 :
                    createEntrepriseAndAddToAnnuaire();
                    break;
                case 2 :
                    System.out.println("Vous avez fait le choix 2");
                    System.out.println("Voici tout les noms des entreprises :");
                    showNamesEntreprises();
                    break;
                case 3 :
                    System.out.println("Vous avez fait le choix 3");
                    System.out.println("Mettez l'indice de l'entreprise dont vous souhaitez consulter les détails");
                    System.out.println();

                    break;
                case 0 :
                    System.out.println("au revoir.");
                    break;
                default:
                    System.out.println("choix invalide");

            }
        }

    }
    public void createEntrepriseAndAddToAnnuaire(){
        System.out.println("Vous avez fait le choix 1");
        System.out.println("Donnez moi le nom de l'entreprise :");
        String nom = scanner.nextLine();
        System.out.println("Donnez moi l'adresse' de l'entreprise :");
        String adresse = scanner.nextLine();
        System.out.println("Donnez moi le siret de l'entreprise :");
        long siret = scanner.nextLong();
        System.out.println("Donnez moi le site web de l'entreprise :");
        String site = scanner.nextLine();
        scanner.nextLine();
        annuaire.addEntrepriseToAnnuaire(nom,siret,adresse,site);
    }

    public void showNamesEntreprises(){
        annuaire.showAllNameEntreprise();
    }

    public void showDetailEntreprises(){
       // for (String name : annuaire.showDetailsEntreprise(scanner.nextInt());
    //    System.out.println(name);
    }
}
